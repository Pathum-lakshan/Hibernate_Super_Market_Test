/**
 * @author : ALE_IS_TER
 * Project Name: Hibernate_Super_Market_Test
 * Date        : 6/14/2022
 * Time        : 1:57 AM
 * @Since : 0.1.0
 */

package lk.ijse.hibernate.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Subject {
    @Id
    private String sid;
    private String name;
    @ManyToMany(mappedBy = "subjectsList")
    private List<Lecture> lectureList = new ArrayList<>();
    public Subject() {
    }

    public Subject(String sid, String name) {
        this.sid = sid;
        this.name = name;
    }

    public Subject(String sid, String name, List<Lecture> lectureList) {
        this.sid = sid;
        this.name = name;
        this.lectureList = lectureList;
    }

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Lecture> getLectureList() {
        return lectureList;
    }

    public void setLectureList(List<Lecture> lectureList) {
        this.lectureList = lectureList;
    }

    @Override
    public String toString() {
        return "Subject{" +
                "sid='" + sid + '\'' +
                ", name='" + name + '\'' +
                ", lectureList=" + lectureList +
                '}';
    }
}
