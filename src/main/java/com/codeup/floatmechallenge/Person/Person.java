package com.codeup.floatmechallenge.Person;

import java.time.LocalDate;

public class Person {
    private long id;
    private String name;
    private Integer age;
    private LocalDate dateJoined;
    private LocalDate dateUpdated;

    public Person() {
    }

    public Person(long id, String name, Integer age, LocalDate dateJoined, LocalDate dateUpdated) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.dateJoined = dateJoined;
        this.dateUpdated = dateUpdated;
    }

    public Person(String name, Integer age, LocalDate dateJoined, LocalDate dateUpdated) {
        this.name = name;
        this.age = age;
        this.dateJoined = dateJoined;
        this.dateUpdated = dateUpdated;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public LocalDate getDateJoined() {
        return dateJoined;
    }

    public void setDateJoined(LocalDate dateJoined) {
        this.dateJoined = dateJoined;
    }

    public LocalDate getDateUpdated() {
        return dateUpdated;
    }

    public void setDateUpdated(LocalDate dateUpdated) {
        this.dateUpdated = dateUpdated;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", dateJoined=" + dateJoined +
                ", dateUpdated=" + dateUpdated +
                '}';
    }
}
