package org.example;

import org.example.config.FactoryConfiguration;
import org.example.entity.Student;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class Main {
    public static void main(String[] args) {
        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();

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

        Student student = session.get(Student.class, 2);
        /*session.delete(session.get(Student.class, 2));*/
        session.delete(student);

        transaction.commit();
        session.close();
    }
}