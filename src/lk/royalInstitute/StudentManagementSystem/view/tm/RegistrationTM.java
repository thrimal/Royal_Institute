package lk.royalInstitute.StudentManagementSystem.view.tm;

import lk.royalInstitute.StudentManagementSystem.dto.CourseDTO;
import lk.royalInstitute.StudentManagementSystem.dto.StudentDTO;

/**
 * @author Thrimal Avishka <thrimalavishka99@gmail.com>
 * @since 19-Nov-21
 */
public class RegistrationTM {
//    private int regNo;
    private String regDate;
    private double regFee;
    private StudentDTO studentDTO;
    private CourseDTO courseDTO;

    public RegistrationTM() {
    }

    public RegistrationTM(String regDate, double regFee, StudentDTO studentDTO, CourseDTO courseDTO) {
//        this.regNo = regNo;
        this.regDate = regDate;
        this.regFee = regFee;
        this.studentDTO = studentDTO;
        this.courseDTO = courseDTO;
    }


//    public int getRegNo() {
//        return regNo;
//    }
//
//    public void setRegNo(int regNo) {
//        this.regNo = regNo;
//    }

    public String getRegDate() {
        return regDate;
    }

    public void setRegDate(String regDate) {
        this.regDate = regDate;
    }

    public double getRegFee() {
        return regFee;
    }

    public void setRegFee(double regFee) {
        this.regFee = regFee;
    }

    public StudentDTO getStudentDTO() {
        return studentDTO;
    }

    public void setStudentDTO(StudentDTO studentDTO) {
        this.studentDTO = studentDTO;
    }

    public CourseDTO getCourseDTO() {
        return courseDTO;
    }

    public void setCourseDTO(CourseDTO courseDTO) {
        this.courseDTO = courseDTO;
    }

    @Override
    public String toString() {
        return "RegistrationTM{" +
//                "regNo=" + regNo +
                ", regDate='" + regDate + '\'' +
                ", regFee=" + regFee +
                ", studentDTO=" + studentDTO +
                ", courseDTO=" + courseDTO +
                '}';
    }
}
