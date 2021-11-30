package services.src.main.java;

import Entities.Record;


import javax.persistence.EntityManager;

public class Insert {
    private EntityManager manager;
    public void insertRecord(Long id) {
        Record record = new Record();
        record.relation_id = id;
        manager.getTransaction().begin();
        manager.persist(record);
        manager.getTransaction().commit();
    }
}
