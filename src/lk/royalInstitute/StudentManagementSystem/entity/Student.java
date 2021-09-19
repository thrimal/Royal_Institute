package lk.royalInstitute.StudentManagementSystem.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Student implements SuperEntity{
    @Id
    private String id;
    private String name;
    private String address;
    private String contact;
    private String dob;
    private String gender;

//    @OneToMany(mappedBy = "Student",cascade = CascadeType.ALL)
//    private List<Registration> registrations=new ArrayList<>();


    public Student() {
    }

    public Student(String id, String name, String address, String contact, String dob, String gender) {
        this.setId(id);
        this.setName(name);
        this.setAddress(address);
        this.setContact(contact);
        this.setDob(dob);
        this.setGender(gender);
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

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

//    public List<Registration> getRegistrations() {
//        return registrations;
//    }

//    public void setRegistrations(List<Registration> registrations) {
//        this.registrations = registrations;
//    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", contact='" + contact + '\'' +
                ", dob='" + dob + '\'' +
                ", gender='" + gender + '\'' +
//                ", registrations=" + registrations +
                '}';
    }
}
