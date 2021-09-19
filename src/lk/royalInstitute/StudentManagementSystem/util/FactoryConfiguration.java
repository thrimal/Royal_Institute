package lk.royalInstitute.StudentManagementSystem.util;



import lk.royalInstitute.StudentManagementSystem.entity.Course;
import lk.royalInstitute.StudentManagementSystem.entity.Registration;
import lk.royalInstitute.StudentManagementSystem.entity.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.io.IOException;
import java.util.Properties;

public class FactoryConfiguration {
    private static FactoryConfiguration factoryConfiguration;
    private SessionFactory sessionFactory;

    private FactoryConfiguration(){
        Properties properties=new Properties();

        try {
            properties.load(ClassLoader.getSystemClassLoader().getResourceAsStream("application.properties"));
            sessionFactory = new Configuration().mergeProperties(properties).addAnnotatedClass(Course.class).addAnnotatedClass(Student.class).addAnnotatedClass(Registration.class).buildSessionFactory();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static FactoryConfiguration getInstance(){
        return factoryConfiguration==null ? factoryConfiguration=new FactoryConfiguration() : factoryConfiguration;
    }

    public Session getSession(){
        return  sessionFactory.openSession();
    }

}
