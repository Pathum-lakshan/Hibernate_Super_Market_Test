/**
 * @author : ALE_IS_TER
 * Project Name: Hibernate_Super_Market_Test
 * Date        : 6/13/2022
 * Time        : 9:00 PM
 * @Since : 0.1.0
 */

package lk.ijse.hibernate.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
    @Id
    private String sId;
    private String name;

    public Student() {
    }

    public Student(String sId, String name) {
        this.sId = sId;
        this.name = name;
    }

    public String getsId() {
        return sId;
    }

    public void setsId(String sId) {
        this.sId = sId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sId='" + sId + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
