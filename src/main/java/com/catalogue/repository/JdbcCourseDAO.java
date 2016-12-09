package com.catalogue.repository;

import com.catalogue.core.entity.Course;
import com.catalogue.core.tools.HibernateUtil;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class JdbcCourseDAO {

    public static void persist(Course course) {
        Session session=HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction trans=session.beginTransaction();
        session.save(course);
        trans.commit();
    }

    public static Course retrieve(String code) {
        Course res = (Course) HibernateUtil.getSessionFactory().getCurrentSession().get(Course.class, code);
        return res;
    }

    public static List<Course> retrieveAll() {
        List<Course> res = HibernateUtil.getSessionFactory().getCurrentSession().createQuery("from Course").list();
        return res;
    }

    public static void delete(Course course) {
        Session hibSess = HibernateUtil.getSessionFactory().getCurrentSession();
        hibSess.createQuery("DELETE FROM COURSE WHERE code = :code")
                .setString("code", course.getCode()).executeUpdate();
    }

    public static void merge(Course course) {
        HibernateUtil.getSessionFactory().getCurrentSession().merge(course);
    }
}
