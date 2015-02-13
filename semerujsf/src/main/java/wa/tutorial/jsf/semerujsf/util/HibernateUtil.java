/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wa.tutorial.jsf.semerujsf.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;



/**
 *
 * @author Taw
 */
public class HibernateUtil {
    private static final SessionFactory SESSION_FACTORY;
    public static final String HIBERNATE_SESSION = "hibernate_session";
    
    static{
        try{
            System.out.println("Tentando configurar a SessionFactory");
            Configuration configuration = new Configuration().configure();
            ServiceRegistry serviceRegistry = new ServiceRegistryBuilder().
                    applySettings(configuration.getProperties()).buildServiceRegistry();
            
            
            SESSION_FACTORY = configuration.buildSessionFactory(serviceRegistry);
        
            System.out.println("SessionFactory criada com sucesso!");
            
        } catch(Exception e){
            System.out.println("ocorreu um erro ao iniciar a SessionFactory" + e);
            throw new ExceptionInInitializerError(e);
        }
        
        
    }

    public static SessionFactory getSESSION_FACTORY() {
        return SESSION_FACTORY;
    }
    
    
}
