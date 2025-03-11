package org.example;

import org.example.config.FactoryConfiguration;
import org.example.entity.Laptop;
import org.example.entity.Student;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        /*Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();*/

        /*Student student = new Student();
        *//*student.setId(1);
        student.setName("Kamal");
        student.setAddress("Galle");*//*
        student.setId(1);
        student.setName("Vinod");
        student.setAddress("Moratuwa");*/

        /*session.save(student);*/
        /*session.update(student);*/

        /*Student student = session.get(Student.class, 1);
        System.out.println(student.getName());*/

        /*Student student = session.get(Student.class, 2);
        *//*session.delete(session.get(Student.class, 2));*//*
        session.delete(student);

        transaction.commit();
        session.close();*/

        /*Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();

        Laptop laptop = new Laptop();
        laptop.setLid(2);
        laptop.setName("Hp");


        Student student = new Student();
        student.setId(2);
        student.setName("Namal");
        student.setAddress("Colombo");
        student.setLaptop(laptop);

        session.persist(student);
        session.persist(laptop);


        transaction.commit();
        session.close();*/

        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();

        Laptop laptop = new Laptop();
        laptop.setLid(1);
        laptop.setName("Dell");

        Laptop laptop1 = new Laptop();
        laptop1.setLid(2);
        laptop1.setName("Hp");

        List<Laptop> laptops = new ArrayList<>();
        laptops.add(laptop);
        laptops.add(laptop1);

        Student student = new Student();
        student.setId(1);
        student.setName("Kamal");
        student.setAddress("Galle");
        student.setLaptop(laptops);

        Student student1 = new Student();
        student1.setId(2);
        student1.setName("Namal");
        student1.setAddress("Colombo");
        student1.setLaptop(laptops);

        List<Student> students = new ArrayList<>();
        students.add(student);
        students.add(student1);

        laptop.setStudent(students);
        laptop1.setStudent(students);

        session.save(laptop);
        session.save(laptop1);
        session.save(student);
        session.save(student1);

        transaction.commit();
        session.close();
    }
}