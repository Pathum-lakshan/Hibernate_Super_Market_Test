package lk.ijse.hibernate;

import lk.ijse.hibernate.entity.*;
import lk.ijse.hibernate.util.FactoryConfiguration;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Session session = FactoryConfiguration.getInstance().getSession();

        Transaction transaction = session.beginTransaction();

        // normal crud

       /* session.save(new Customer("C002","pathum","panadura","200130601063"));

        session.update(new Customer("C001","pathum","kaluthara","200130601063"));

        Customer customer = session.get(Customer.class, "C001");

        System.out.println(customer.getAddress());

        session.delete(customer);
*/

        // one to one relation

       /* Student student = new Student("S003", "herath");


        session.save(student);
        session.save(new Laptop("L003","acer",student));*/

        //one to many relation

      /*  Owner owner = new Owner();
        owner.setName("pathum");
        owner.setoId("O001");

        Pet pet1 = new Pet("P001","cat",owner);
        Pet pet2 = new Pet("P002","dog",owner);
        Pet pet3 = new Pet("P003","bird",owner);


        ArrayList<Pet> pets = new ArrayList<>();

        // 1 methodology
       *//* pets.add(pet1);
        pets.add(pet2);
        pets.add(pet3);

        owner.setPetList(pets);*//*

        // 2 methodology

        owner.getPetList().add(pet1);
        owner.getPetList().add(pet2);
        owner.getPetList().add(pet3);


        session.save(owner);
        session.save(pet1);
        session.save(pet2);
        session.save(pet3);
*/

         // many to many relation

        Lecture lecture1 = new Lecture();
        lecture1.setlId("L001");
        lecture1.setName("pathum");

        Lecture lecture2 = new Lecture();
        lecture2.setlId("L002");
        lecture2.setName("lakshan");

        Subject subject1 = new Subject();
        subject1.setSid("S001");
        subject1.setName("kalum");

        Subject subject2 = new Subject();
        subject2.setSid("S002");
        subject2.setName("nuwan");

        lecture1.getSubjectsList().add(subject1);
        lecture1.getSubjectsList().add(subject2);

        lecture2.getSubjectsList().add(subject1);
        lecture2.getSubjectsList().add(subject2);

        subject1.getLectureList().add(lecture1);
        subject1.getLectureList().add(lecture2);

        subject2.getLectureList().add(lecture1);
        subject2.getLectureList().add(lecture2);

        session.save(lecture1);
        session.save(lecture2);

        session.save(subject1);
        session.save(subject2);

        transaction.commit();

        session.close();

    }
}
