package org.example.peaksoft.congiguratin;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;

import javax.persistence.EntityManager;

public class DatabaseConnection {
    private static SessionFactory sessionFactory;
    private static EntityManager entityManager;

    static {
        sessionFactory = new Configuration()
                .setProperty(Environment.DRIVER, "org.postgresql.Driver")
                .setProperty(Environment.URL, "jdbc:postgresql://localhost:5432/postgres")
                .setProperty(Environment.USER,"postgres")
                .setProperty(Environment.PASS,"1234")
                .setProperty(Environment.HBM2DDL_AUTO, "validate")
                .setProperty(Environment.DIALECT, "org.hibernate.dialect.PostgreSQL10Dialect")
                .setProperty(Environment.SHOW_SQL, "true")
                .addAnnotatedClass(Country.class)
                .buildSessionFactory();
        entityManager = sessionFactory.createEntityManager();
    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public static EntityManager getEntityManager() {
        return entityManager;
    }
}

