package lk.royalInstitute.StudentManagementSystem.entity;

import lk.royalInstitute.StudentManagementSystem.dto.CourseDTO;
import org.hibernate.annotations.ColumnDefault;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Course implements SuperEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long code;
    private String name;
    private String duration;
    private double courseFee;

//    @OneToMany(mappedBy = "Course",cascade = CascadeType.ALL)
//    private List<Registration> registrations=new ArrayList<>();

    public Course() {
    }

    public Course(String name, String duration, double courseFee) {
//        this.setCode(code);
        this.setName(name);
        this.setDuration(duration);
        this.setCourseFee(courseFee);
    }

    public Course(CourseDTO courseDTO) {

    }

    public long getCode() {
        return code;
    }

    public void setCode(long code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public double getCourseFee() {
        return courseFee;
    }

    public void setCourseFee(double courseFee) {
        this.courseFee = courseFee;
    }

//    public List<Registration> getRegistrations() {
//        return registrations;
//    }

//    public void setRegistrations(List<Registration> registrations) {
//        this.registrations = registrations;
//    }

    @Override
    public String toString() {
        return "Course{" +
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", duration='" + duration + '\'' +
                ", courseFee=" + courseFee +
//                ", registrations=" + registrations +
                '}';
    }
}
