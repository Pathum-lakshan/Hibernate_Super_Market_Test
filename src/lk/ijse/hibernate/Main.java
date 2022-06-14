package lk.ijse.hibernate;

import lk.ijse.hibernate.entity.Customer;
import lk.ijse.hibernate.entity.Laptop;
import lk.ijse.hibernate.entity.Student;
import lk.ijse.hibernate.util.FactoryConfiguration;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class Main {

    public static void main(String[] args) {

        Session session = FactoryConfiguration.getInstance().getSession();

        Transaction transaction = session.beginTransaction();

       /* session.save(new Customer("C002","pathum","panadura","200130601063"));

        session.update(new Customer("C001","pathum","kaluthara","200130601063"));

        Customer customer = session.get(Customer.class, "C001");

        System.out.println(customer.getAddress());

        session.delete(customer);
*/


        Student student = new Student("S002", "lakshan");


        session.save(student);
        session.save(new Laptop("L003","acer",student));

        transaction.commit();

        session.close();

    }
}
