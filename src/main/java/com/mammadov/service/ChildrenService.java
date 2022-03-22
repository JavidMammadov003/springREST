package com.mammadov.service;

import com.mammadov.dao.ChildrenDao;
import com.mammadov.dao.ChildrenDaoImpl;
import com.mammadov.entity.Child;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Service
public class ChildrenService {
    @Autowired
    ChildrenDao childrenDao;
    @Transactional
    public List<Child> getChildren(){
        return childrenDao.getChildren();

    }
    @Transactional
    public Child getChildById(int id){
        return childrenDao.getChildById(id);
    }
}
