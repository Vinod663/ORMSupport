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

        Laptop laptop2 = new Laptop();
        laptop2.setLid(2);
        laptop2.setName("Hp");

        List<Laptop> laptops = new ArrayList<>();
        laptops.add(laptop);
        laptops.add(laptop2);

        Student student = new Student();
        student.setId(1);
        student.setName("Kamal");
        student.setAddress("Galle");
        student.setLaptop(laptops);

        laptop.setStudent(student);//laptop ekata related stuednt kawda kiyala kiwwe nathnm ekata null value ekak dagannawa
        laptop2.setStudent(student);

        session.persist(laptop);
        session.persist(laptop2);
        session.persist(student);

        transaction.commit();
        session.close();
    }
}