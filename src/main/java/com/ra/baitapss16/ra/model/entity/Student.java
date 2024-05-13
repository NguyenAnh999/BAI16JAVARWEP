package com.ra.baitapss16.ra.model.entity;

public class Student {
    int id;
    String name;
    boolean sex;
    int age;
    String email;

    public Student() {
    }

    public Student(int id, String name, boolean sex, int age, String email) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.email = email;
    }

    public int getId() {

        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
