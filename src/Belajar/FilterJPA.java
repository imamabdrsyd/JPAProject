/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Belajar;

import com.indocyber.model.Person;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TemporalType;

/**
 *
 * @author user
 */
public class FilterJPA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        EntityManagerFactory emf = 
                Persistence.createEntityManagerFactory("JPAProjectPU");
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();
        
        
//        String nama = "Stanley Adam";
//        Query qNama = em.createQuery("Select p from Person p where p.nama = :nama");
//        qNama.setParameter("nama", nama);
//        Person aName = (Person) qNama.getSingleResult();
//        System.out.println(aName.getNama() + " " + aName.getPosition());
        
        Query qPro = em.createQuery("Select p from Person p where p.position = :po");
        qPro.setParameter("po", "System Analyst");
        List<Person> progs = qPro.getResultList();
        for (Person prog : progs) {
            System.out.println(prog.getNama() + " " + prog.getPosition());
        }
        
//        String jpql = "Select p from Person p"
//                + "where p.position :jabatan and p.salary < gaji";
//        Query qSalary = em.createQuery(jpql);
//        qSalary.setParameter("jabatan", "programmer");
//        qSalary.setParameter("gaji", "20000000");
//        List<Person> progSalaries = qSalary.getResultList();
//        for (Person progSalary : progSalaries) {
//            System.out.println(progSalary.getNama() + "" + progSalary.getPosition());
//        }
    }
    
}
