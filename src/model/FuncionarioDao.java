package model;
import java.util.ArrayList;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaQuery;


/**
 *
 * @author Clayd Nandza
 */
public class FuncionarioDao extends DAO<Funcionario> {
    private final EntityManagerFactory entityManagerFactory;
    private final EntityManager entityManager;

    public FuncionarioDao() {
        this.entityManagerFactory = Persistence.createEntityManagerFactory("TesteTrabalhoPU");
        this.entityManager = entityManagerFactory.createEntityManager();
    }
    
     public ArrayList<Funcionario> listar(){ 
        try {
            CriteriaQuery criteriaQuery =  entityManager.getCriteriaBuilder().createQuery();
            criteriaQuery.select(criteriaQuery.from(Funcionario.class));
            Query query = entityManager.createQuery(criteriaQuery);         
            return (ArrayList<Funcionario>)query.getResultList();
        } finally {
            entityManager.close();
        }
    }
}