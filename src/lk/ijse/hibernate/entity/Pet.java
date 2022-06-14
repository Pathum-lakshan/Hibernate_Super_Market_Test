/**
 * @author : ALE_IS_TER
 * Project Name: Hibernate_Super_Market_Test
 * Date        : 6/13/2022
 * Time        : 11:22 PM
 * @Since : 0.1.0
 */

package lk.ijse.hibernate.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Pet {
    @Id
    private String pId;
    private String name;
    @ManyToOne
    private Owner owner;
    public Pet() {
    }

    public Pet(String pId, String name) {
        this.pId = pId;
        this.name = name;
    }

    public Pet(String pId, String name, Owner owner) {
        this.pId = pId;
        this.name = name;
        this.owner = owner;
    }

    public String getpId() {
        return pId;
    }

    public void setpId(String pId) {
        this.pId = pId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "pId='" + pId + '\'' +
                ", name='" + name + '\'' +
                ", owner=" + owner +
                '}';
    }
}
