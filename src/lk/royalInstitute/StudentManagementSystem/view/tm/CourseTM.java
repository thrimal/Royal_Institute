package lk.royalInstitute.StudentManagementSystem.view.tm;

public class CourseTM {
    private String code;
    private String name;
    private String duration;
    private double courseFee;

    public CourseTM() {
    }

    public CourseTM(String code, String name, String duration, double courseFee) {
        this.setCode(code);
        this.setName(name);
        this.setDuration(duration);
        this.setCourseFee(courseFee);
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
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

    @Override
    public String toString() {
        return "CourseDTO{" +
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", duration='" + duration + '\'' +
                ", courseFee=" + courseFee +
                '}';
    }
}
