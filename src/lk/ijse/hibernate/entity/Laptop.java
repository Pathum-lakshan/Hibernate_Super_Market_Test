/**
 * @author : ALE_IS_TER
 * Project Name: Hibernate_Super_Market_Test
 * Date        : 6/13/2022
 * Time        : 9:02 PM
 * @Since : 0.1.0
 */

package lk.ijse.hibernate.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Laptop {
    @Id
    private String lId;
    private String description;
    @OneToOne
    private Student student;

    public Laptop() {
    }

    public Laptop(String lId, String description) {
        this.lId = lId;
        this.description = description;
    }

    public Laptop(String lId, String description, Student student) {
        this.lId = lId;
        this.description = description;
        this.student = student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Student getStudent() {
        return student;
    }

    public String getlId() {
        return lId;
    }

    public void setlId(String lId) {
        this.lId = lId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "lId='" + lId + '\'' +
                ", description='" + description + '\'' +
                ", student=" + student +
                '}';
    }
}
