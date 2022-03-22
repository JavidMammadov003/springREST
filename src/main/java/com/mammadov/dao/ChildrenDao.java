package com.mammadov.dao;

import com.mammadov.entity.Child;

import java.util.List;

public interface ChildrenDao {
     List<Child> getChildren();
     void deleteChild(int id);
     void saveChild(Child child);
     Child getChildById(int id);
}
