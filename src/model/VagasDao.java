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


public class VagasDao extends DAO<Vagas> {
    private final EntityManagerFactory entityManagerFactory;
    private final EntityManager entityManager;

    public VagasDao() {
        this.entityManagerFactory = Persistence.createEntityManagerFactory("TesteTrabalhoPU");
        this.entityManager = entityManagerFactory.createEntityManager();
    }
     public ArrayList<Vagas> listar(){   
        try {
            CriteriaQuery criteriaQuery =  entityManager.getCriteriaBuilder().createQuery();
            criteriaQuery.select(criteriaQuery.from(Vagas.class));
            Query query = entityManager.createQuery(criteriaQuery);         
            return (ArrayList<Vagas>)query.getResultList();
        } finally {
            entityManager.close();
        }
    }
}