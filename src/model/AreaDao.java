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

public class AreaDao extends DAO <Area> {
    
    private final EntityManagerFactory entityManagerFactory;
    private final EntityManager entityManager;

    public AreaDao() {
        this.entityManagerFactory = Persistence.createEntityManagerFactory("TesteTrabalhoPU");
        this.entityManager = entityManagerFactory.createEntityManager();
    }
    
     public EntityManager getEntityManager() {
         EntityManagerFactory factory = Persistence.createEntityManagerFactory("TesteTrabalhoPU");
         return factory.createEntityManager();
    }
  
    public ArrayList <Area> listar(){   
        try {
            CriteriaQuery criteriaQuery =  entityManager.getCriteriaBuilder().createQuery();
            criteriaQuery.select(criteriaQuery.from(Area.class));
            Query query = entityManager.createQuery(criteriaQuery);         
            return (ArrayList<Area>)query.getResultList();
        } finally {
            entityManager.close();
        }
    }
}