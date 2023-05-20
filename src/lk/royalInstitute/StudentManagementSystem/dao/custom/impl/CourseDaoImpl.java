package lk.royalInstitute.StudentManagementSystem.dao.custom.impl;

import lk.royalInstitute.StudentManagementSystem.dao.custom.CourseDAO;
import lk.royalInstitute.StudentManagementSystem.entity.Course;
import lk.royalInstitute.StudentManagementSystem.util.FactoryConfiguration;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.NativeQuery;
import org.hibernate.query.Query;

import java.util.ArrayList;
import java.util.List;

public class CourseDaoImpl implements CourseDAO {
    @Override
    public boolean save(Course course) throws Exception {
        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();
        session.save(course);
        transaction.commit();
        session.close();
        return true;
    }

    @Override
    public boolean update(Course course) throws Exception {
        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();
        session.update(course);
        transaction.commit();
        session.close();
        return true;
    }

    @Override
    public boolean delete(String s) throws Exception {
        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();
        Course course = session.get(Course.class, s);
        session.delete(course);
        transaction.commit();
        session.close();
        return true;
    }

    @Override
    public Course get(String s) throws Exception {
        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();
        String hql = "FROM Course WHERE name = :name";
        Query query = session.createQuery(hql);
        query.setParameter("name", s);
        Course course = (Course) query.uniqueResult();
        transaction.commit();
        session.close();
        return course;
    }

    @Override
    public ArrayList<Course> getAll() throws Exception {
        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();
        List<Course> courseList=null;
        Query query=session.createQuery("from Course");
        courseList=query.list();
        transaction.commit();
        session.close();
        return (ArrayList<Course>) courseList;
    }

    @Override
    public Course getCourseByName(String name) throws Exception {
        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();
        Query query=session.createNativeQuery("select * from course where courseName=?",name);
        transaction.commit();
        session.close();
        return (Course) query;
    }
}
