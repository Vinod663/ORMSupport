package org.example.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Laptop {
    @Id
    private int lid;
    private String name;

    @ManyToMany(mappedBy = "laptop")
    private List<Student> student;

    public Laptop() {
    }

    public Laptop(int lid, String name, List<Student> student) {
        this.lid = lid;
        this.name = name;
        this.student = student;
    }

    public int getLid() {
        return lid;
    }

    public void setLid(int lid) {
        this.lid = lid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Student> getStudent() {
        return student;
    }

    public void setStudent(List<Student> student) {
        this.student = student;
    }
}
