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
public class EmpregadorDao extends DAO<Empregador>{
    private final EntityManagerFactory entityManagerFactory;
    private final EntityManager entityManager;

    public EmpregadorDao() {
        this.entityManagerFactory = Persistence.createEntityManagerFactory("TesteTrabalhoPU");
        this.entityManager = entityManagerFactory.createEntityManager();
    }
   
    public ArrayList<Empregador> listar(){ 
       
        try {
            CriteriaQuery criteriaQuery =  entityManager.getCriteriaBuilder().createQuery();
            criteriaQuery.select(criteriaQuery.from(Empregador.class));
            Query query = entityManager.createQuery(criteriaQuery);         
            return (ArrayList<Empregador>)query.getResultList();
        } finally {
            entityManager.close();
        }
    }
}