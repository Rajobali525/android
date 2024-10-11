package com.example.first;

public class Student {

    private String name;
    private String age;
    private String section;
    private String lm;
    private String fault;
    private String date;

    public Student(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }


    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public String getLm() {
        return lm;
    }

    public void setLm(String lm) {
        this.lm = lm;
    }

    public String getFault() {
        return fault;
    }

    public void setFault(String fault) {
        this.fault = fault;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }




    public Student(String name, String age,String section,String lm,String fault,String date) {
        this.name = name;
        this.age = age;
        this.section = section;
        this.lm = lm;
        this.fault = fault;
        this.date = date;
    }

}
