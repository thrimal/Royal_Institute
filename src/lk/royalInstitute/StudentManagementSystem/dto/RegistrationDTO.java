package lk.royalInstitute.StudentManagementSystem.dto;

public class RegistrationDTO {
    private int regNo;
    private String regDate;
    private double regFee;
    private StudentDTO studentDTO;
    private CourseDTO courseDTO;

    public RegistrationDTO() {
    }

    public RegistrationDTO(int regNo, String regDate, double regFee, StudentDTO studentDTO, CourseDTO courseDTO) {
        this.setRegNo(regNo);
        this.setRegDate(regDate);
        this.setRegFee(regFee);
        this.setStudentDTO(studentDTO);
        this.setCourseDTO(courseDTO);
    }

    public int getRegNo() {
        return regNo;
    }

    public void setRegNo(int regNo) {
        this.regNo = regNo;
    }

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
        return "RegistrationDTO{" +
                "regNo=" + regNo +
                ", regDate='" + regDate + '\'' +
                ", regFee=" + regFee +
                ", studentDTO=" + studentDTO +
                ", courseDTO=" + courseDTO +
                '}';
    }
}
