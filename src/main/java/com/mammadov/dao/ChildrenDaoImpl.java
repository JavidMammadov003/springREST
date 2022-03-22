package com.mammadov.dao;

import com.mammadov.entity.Child;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import java.util.ArrayList;
import java.util.List;
@Component
public class ChildrenDaoImpl implements ChildrenDao{
    @Autowired
   SessionFactory sessionFactory;

    @Override
    public List<Child> getChildren() {
        Session session=sessionFactory.getCurrentSession();
         ArrayList<Child> children=(ArrayList<Child>) session.createQuery("from Child").getResultList();
        return children;
    }

    @Override
    public void deleteChild(int id) {
    Session session=sessionFactory.getCurrentSession();

    session.delete(session.get(Child.class,id));

    }

    @Override
    public void saveChild(Child child) {
      Session session=sessionFactory.getCurrentSession();
      session.saveOrUpdate(child);
    }

    @Override
    public Child getChildById(int id) {
        Session session=sessionFactory.getCurrentSession();
        return session.get(Child.class,id);

    }
}
