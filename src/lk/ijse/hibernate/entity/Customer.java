/**
 * @author : ALE_IS_TER
 * Project Name: Hibernate_Super_Market_Test
 * Date        : 6/13/2022
 * Time        : 4:42 AM
 * @Since : 0.1.0
 */

package lk.ijse.hibernate.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Customer {
    @Id
    private String id;
    private String name;
    private String address;
    private String nic;

    public Customer() {
    }

    public Customer(String id, String name, String address, String nic) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.nic = nic;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNic() {
        return nic;
    }

    public void setNic(String nic) {
        this.nic = nic;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", nic='" + nic + '\'' +
                '}';
    }
}
