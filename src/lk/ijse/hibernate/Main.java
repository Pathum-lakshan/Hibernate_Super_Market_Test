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

        /*Owner owner = new Owner();
        owner.setName("pathum");
        owner.setoId("O001");

        Pet pet1 = new Pet("P001","cat",owner);
        Pet pet2 = new Pet("P002","dog",owner);
        Pet pet3 = new Pet("P003","bird",owner);

        ArrayList<Pet> pets = new ArrayList<>();

        pets.add(pet1);
        pets.add(pet2);
        pets.add(pet3);

        owner.setPetList(pets);

        session.save(owner);
        session.save(pet1);
        session.save(pet2);
*/



        transaction.commit();

        session.close();

    }
}
