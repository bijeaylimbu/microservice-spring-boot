package com.user.entity;

import java.util.ArrayList;
import java.util.List;

public class User {
    private Long userId;
    private String name;
    private String studentClass;
    private List<Location > list=new ArrayList<>();

    public User(Long userId, String name, String studentClass, List<Location> list) {
        this.userId = userId;
        this.name = name;
        this.studentClass = studentClass;
        this.list = list;
    }

    public User(Long userId, String name, String studentClass) {
        this.userId = userId;
        this.name = name;
        this.studentClass = studentClass;
    }


    public User(){

    }
    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStudentClass() {
        return studentClass;
    }

    public void setStudentClass(String studentClass) {
        this.studentClass = studentClass;
    }

    public List<Location> getList() {
        return list;
    }

    public void setList(List<Location> list) {
        this.list = list;
    }
}
