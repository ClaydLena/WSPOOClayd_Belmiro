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
public class EncaminhamentosDao extends DAO<Encaminhamento>{
    private final EntityManagerFactory entityManagerFactory;
    private final EntityManager entityManager;

    public EncaminhamentosDao() {
        this.entityManagerFactory = Persistence.createEntityManagerFactory("TesteTrabalhoPU");
        this.entityManager = entityManagerFactory.createEntityManager();
    }
    public ArrayList<Encaminhamento> listar(){   
        try {
            CriteriaQuery criteriaQuery =  entityManager.getCriteriaBuilder().createQuery();
            criteriaQuery.select(criteriaQuery.from(Encaminhamento.class));
            Query query = entityManager.createQuery(criteriaQuery);         
            return (ArrayList<Encaminhamento>)query.getResultList();
        } finally {
            entityManager.close();
        }
    }
}