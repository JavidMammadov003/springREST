package com.mammadov.dao;

import com.mammadov.entity.Child;

import java.util.List;

public interface ChildrenDao {
    public List<Child> getChildren();
    public void deleteChild(Child child);
    public void saveChild(Child child);
    public Child getChildById(int id);
}
