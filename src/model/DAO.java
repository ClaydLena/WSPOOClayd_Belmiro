package model;
import java.util.ArrayList;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaQuery;

/**
 * Classe de Acesso aos dados do sistema Generica. Reduz o tamanho e repeticao de codigo.
 * Realiza todas operacoes CRUD comuns entre as classes.
 * @param <T> o tipo da classe
 * @author Clayd Nandza
 */
public class DAO <T extends DAOInterface> {
   
    public EntityManager getEntityManager() {
       EntityManagerFactory factory = Persistence.createEntityManagerFactory("TesteTrabalhoPU");
       return factory.createEntityManager();
    }    
/*   
    private EntityManagerFactory entityManagerFactory;
    private EntityManager manager;

    public DAO() {
        this.entityManagerFactory = Persistence.createEntityManagerFactory("TesteTrabalhoPU");
        this.manager = entityManagerFactory.createEntityManager();
    }
  */  
    
  

    /**
     * Este metodo recebe um parametro do tipo t, qualquer classe do sistema,
     * para grava-lo na base de dados. Ou actualiza-lo, caso exista.
     * @param t um objecto da classe
     * @return t o objecto persistido
     * @throws Exception 
     */
    public T salvar(T t) throws Exception {
       EntityManager manager = getEntityManager();
       try {
           manager.getTransaction().begin();
           if (t.getId() == null){
               manager.persist(t);
           } else {
               if (!manager.contains(t)){
                   if(manager.find(t.getClass(), t.getId()) == null){
                       throw new Exception("Erro ao actualizar dado!");
                   }
               }
               t = manager.merge(t);
           }
           manager.getTransaction().commit();
       } finally {
           manager.close();
       }
       return t;
    }
    
    /**
     * Este metodo elimina um objecto.
     * @param clazz a classe na qual o objeco sera eliminado (instancia)
     * @param id o id do objecto
     */
    public void eliminar(Class <T> clazz, Long id){
      EntityManager manager = getEntityManager();
        T t = manager.find(clazz, id);
        try {
            manager.getTransaction().begin();
            manager.remove(t);
            manager.getTransaction().commit();
        } finally {
            manager.close();   
        }
    }
    
    /**
     * Este metodo pesquisa um dado objecto.
     * @param clazz a classe na qual se faz a pesquisa
     * @param id da obecto procurado
     * @return o objecto procurado
     */
    public T pesquisarPorId(Class <T> clazz, Long id){
      EntityManager manager = getEntityManager();
        T t = null;
        try {
            t = manager.find(clazz, id);
        } finally {
            manager.close();
        }
        return t;
    }
   
    /**
     * Este metodo retorna um objecto pesquisado
     * @param clazz a classe do objecto
     * @param nome o atributo usado para pesquisar
     * @return o elemento encontrado
     */
    public ArrayList <T> pesquisaCandidato(Class <T> clazz, String nome){
        EntityManager manager = getEntityManager();
        ArrayList<T> t = new ArrayList();
        try{
            t.add(manager.find(clazz, nome));
        }finally{
            manager.close();
        }
        return t;
    }
  
    
    /**
     * Este meto doretorna um arraylist de objectos duma classe 
     * @param t o tipo de objecto
     * @return a lista dos obejctos do tipo em causa
     */
    public ArrayList<T> listar(T t){   
        EntityManager manager = getEntityManager();
        try {
            CriteriaQuery criteriaQuery =  manager.getCriteriaBuilder().createQuery();
            criteriaQuery.select(criteriaQuery.from(t.getClass()));
            Query query = manager.createQuery(criteriaQuery);         
            return (ArrayList<T>)query.getResultList();
        } finally {
            manager.close();
        }
    }
    
}