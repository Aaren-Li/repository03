package com.collection.HumanManage;

public class Worker {
    private String name;
    private int age;
    private String sex;
    private int id;
    private double salary;
    public Worker(String name, int age, String sex, int id, double salary) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.id = id;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }
/*
    public void setSalary(double salary) {
        this.salary = salary;
    }
*/
    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", id=" + id +
                ", salary=" + salary +
                '}';
    }
}
