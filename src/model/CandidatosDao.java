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
public class CandidatosDao extends DAO<Candidato> {
    
    private final EntityManagerFactory entityManagerFactory;
    private final EntityManager entityManager;

    public CandidatosDao() {
        this.entityManagerFactory = Persistence.createEntityManagerFactory("TesteTrabalhoPU");
        this.entityManager = entityManagerFactory.createEntityManager();
    }
    
    public ArrayList<Candidato> listar(){    
        try {
            CriteriaQuery criteriaQuery =  entityManager.getCriteriaBuilder().createQuery();
            criteriaQuery.select(criteriaQuery.from(Candidato.class));
            Query query = entityManager.createQuery(criteriaQuery);         
            return (ArrayList<Candidato>)query.getResultList();
        } finally {
            entityManager.close();
        }
    }
}