package com.database;


import com.model.RailwayReservastion;
import com.service.MethodService;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.Scanner;

public class RailwayToDataBase {


    public static void establishAndcreateAndInsert(RailwayReservastion rw) {
        Configuration configuration=new Configuration();
        configuration.configure("hibernate.cfg.xml");

      SessionFactory sessionFactory =configuration.buildSessionFactory();
      Session session =sessionFactory.openSession();
        Transaction tx=session.beginTransaction();

        try{


            session.save(rw);

            tx.commit();

        }catch (Exception e){
            System.err.println();
            e.printStackTrace();
            if(tx!=null){
                tx.rollback();
            }

        }finally {
            try{
                if(session !=null){
                    session.close();
                }

            }catch (Exception e){
                System.err.println("Error Message"+e.getMessage());
                e.printStackTrace();
            }

        }


    }


}
