package org.GenSpark;

import org.GenSpark.Entity.Computer;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory = cfg.buildSessionFactory();

        Session session = factory.openSession();
        Transaction trans = session.beginTransaction();

        Computer comp = new Computer();
        comp.setComputerID(1);
        comp.setMotherBoard("Z87");
        comp.setOS("Doors");
        comp.setCPU("J9");
        comp.setGPU("XTR 9030");
        comp.setRAM("64 GB");
        comp.setHDD("2TB");
        comp.setOD("CD/DVD/BD");

        session.save(comp);
        trans.commit();

        factory.close();
        session.close();

        //Query query = session.createQuery("from Computer");
        //List<Computer> compList = query.list();

        //for (Computer computer : compList)
        //{
        //    System.out.println(computer);
        //}
    }
}

