/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testocr.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

/**
 *
 * @author wsc-206
 */
public abstract class BaseDao<T> {
    public final String PERSISTANCE_META = "persistance";
    EntityManagerFactory emFactory;
    EntityManager entityManager;
    private Class<T> type;

    public BaseDao(Class<T> type) {
        this.type = type;
    } 
            
    public void startTransaction(String persistence){
        emFactory = Persistence.createEntityManagerFactory(persistence);
        
        entityManager = emFactory.createEntityManager();
        entityManager.getTransaction().begin();
    }
    public void endTransaction(){
        entityManager.close();
        emFactory.close();
    }
    
    public void save(T t){
        startTransaction(PERSISTANCE_META);
        
        entityManager.persist(t);
        entityManager.getTransaction().commit();
        
        endTransaction();
    }
    public abstract void update(int id, T t);
    public void delete(int id){
        startTransaction(PERSISTANCE_META);
        T t = entityManager.find(type, id);
        entityManager.remove(t);
        entityManager.getTransaction().commit();
        endTransaction();
    }
    public T findById(int id){
        startTransaction(PERSISTANCE_META);
        T t = entityManager.find(type, id);
        endTransaction();
        return t;
    }
    public List<T> findAll(){
        startTransaction(PERSISTANCE_META);
        
        CriteriaBuilder cb = entityManager.getCriteriaBuilder();
        CriteriaQuery<T> cq = cb.createQuery(type);
        Root<T> rootEntry = cq.from(type);
        CriteriaQuery<T> all = cq.select(rootEntry);
        TypedQuery<T> allQuery = entityManager.createQuery(all);
        List<T> result = allQuery.getResultList();
        
        endTransaction();
        
        return result;
    }  
    public T findLastData(){
        List<T> result = this.findAll();
        T t = null;
        for(int i=0; i<result.size(); i++){
            t = result.get(i);
        }
        return t;
    }
}
