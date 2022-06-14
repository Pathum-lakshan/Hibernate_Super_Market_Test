/**
 * @author : ALE_IS_TER
 * Project Name: Hibernate_Super_Market_Test
 * Date        : 6/14/2022
 * Time        : 1:57 AM
 * @Since : 0.1.0
 */

package lk.ijse.hibernate.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Lecture {
    @Id
    private String lId;
    private String name;
    @ManyToMany
    private
    List<Subject> subjectsList = new ArrayList<>();

    public Lecture() {
    }

    public Lecture(String lId, String name) {
        this.lId = lId;
        this.name = name;
    }

    public Lecture(String lId, String name, List<Subject> subjectsList) {
        this.lId = lId;
        this.name = name;
        this.subjectsList = subjectsList;
    }

    public String getlId() {
        return lId;
    }

    public void setlId(String lId) {
        this.lId = lId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Subject> getSubjectsList() {
        return subjectsList;
    }

    public void setSubjectsList(List<Subject> subjectsList) {
        this.subjectsList = subjectsList;
    }

    @Override
    public String toString() {
        return "Lecture{" +
                "lId='" + lId + '\'' +
                ", name='" + name + '\'' +
                ", subjectsList=" + subjectsList +
                '}';
    }
}
