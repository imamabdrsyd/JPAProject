/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.indocyber.model;

import java.util.Date;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

/**
 *
 * @author user
 */
public class MainJPA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        EntityManagerFactory emf = 
                Persistence.createEntityManagerFactory("JPAProjectPU");
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        
        Person staf = new Person();
        staf.setNama("Jonathan Living the Dream");
        staf.setSalary(2500000);
        staf.setAge(14);
        staf.setDateOfBirth(new Date());
        
        em.persist(staf);
        
        tx.commit();
        
        em.close();
        emf.close();
    }
    
}
