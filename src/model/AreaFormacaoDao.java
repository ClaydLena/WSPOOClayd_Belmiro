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


public class AreaFormacaoDao extends DAO <AreaFormacao> {
   
    private final EntityManagerFactory entityManagerFactory;
    private final EntityManager entityManager;

    public AreaFormacaoDao() {
        this.entityManagerFactory = Persistence.createEntityManagerFactory("TesteTrabalhoPU");
        this.entityManager = entityManagerFactory.createEntityManager();
    }
    
    public EntityManager getEntityManager() {
         EntityManagerFactory factory = Persistence.createEntityManagerFactory("TesteTrabalhoPU");
         return factory.createEntityManager();
    }
    public  ArrayList <AreaFormacao> listar(){ 
        try {
            CriteriaQuery criteriaQuery =  entityManager.getCriteriaBuilder().createQuery();
            criteriaQuery.select(criteriaQuery.from(AreaFormacao.class));
            Query query = entityManager.createQuery(criteriaQuery);         
            return (ArrayList<AreaFormacao>)query.getResultList();
        } finally {
            entityManager.close();
        }
    }
}