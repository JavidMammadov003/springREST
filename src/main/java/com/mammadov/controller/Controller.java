package com.mammadov.controller;

import com.mammadov.entity.Child;
import com.mammadov.exceptions.MyExceptionHandler;
import com.mammadov.exceptions.NoSuchIdException;
import com.mammadov.service.ChildrenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("child")
public class Controller {
    @Autowired
    ChildrenService childrenService;
    @GetMapping("")
    public List<Child> getChildren(){

        return childrenService.getChildren();

    }

    @GetMapping("/{id}")
    public Child getChildById(@PathVariable int id){
        Child child=childrenService.getChildById(id);
        if(child==null)
            throw new NoSuchIdException("There is no such id");
       return childrenService.getChildById(id);
    }
    @PostMapping("")
    public Child saveChild(@RequestBody Child child){
        childrenService.saveChild(child);
        return child;
    }
    @PutMapping("")
    public Child updateChild(@RequestBody Child child){
        int id=child.getId();
        Child child1=childrenService.getChildById(id);
        if(child1==null)
            throw new NoSuchIdException("There is not id="+id);
        childrenService.saveChild(child);
        return child;
    }
    @DeleteMapping("/{id}")
    public String deleteChild(@PathVariable int id){
        childrenService.deleteChild(id);
        return "id= "+id+"deleted";
    }


}
