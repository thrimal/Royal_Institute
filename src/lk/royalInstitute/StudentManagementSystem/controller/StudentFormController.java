package lk.royalInstitute.StudentManagementSystem.controller;

import com.jfoenix.controls.JFXTextField;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import lk.royalInstitute.StudentManagementSystem.bo.BoFactory;
import lk.royalInstitute.StudentManagementSystem.bo.custom.CourseBO;
import lk.royalInstitute.StudentManagementSystem.bo.custom.StudentBO;
import lk.royalInstitute.StudentManagementSystem.dto.CourseDTO;
import lk.royalInstitute.StudentManagementSystem.dto.StudentDTO;
import lk.royalInstitute.StudentManagementSystem.view.tm.CourseTM;
import lk.royalInstitute.StudentManagementSystem.view.tm.StudentTM;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class StudentFormController implements Initializable {
    public JFXTextField txtStudentId;
    public JFXTextField txtStudentName;
    public DatePicker pckrDateOfBirth;
    public JFXTextField txtAddress;
    public JFXTextField txtContactNo;
    public Label lblDate;
    public ComboBox<String> cmbGender;
    public ComboBox<String> cmbCourse;
    public JFXTextField txtCourseId;
    public JFXTextField txtCourseDuration;
    public JFXTextField txtCourseFee;
    public TableView<StudentTM> tblStudents;
    public Label lblTotal;
    private CourseBO courseBO=BoFactory.getInstance().getBo(BoFactory.BoType.COURSE);
    private StudentBO studentBO= BoFactory.getInstance().getBo(BoFactory.BoType.STUDENT);
    private ObservableList<CourseTM> studentTMS = FXCollections.observableArrayList();

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        ObservableList<String> courses = FXCollections.observableArrayList();
        try {
            ArrayList<CourseDTO> courseDTOS = courseBO.getAll();
            for (CourseDTO c : courseDTOS) {
                courses.add(c.getCode());
            }
            cmbCourse.setItems(courses);

            ObservableList<String> gender = FXCollections.observableArrayList("Male", "Female");
            cmbGender.setItems(gender);
        } catch (Exception e) {

            e.printStackTrace();
        }
    }

    public void txtStudentIdOnAction(ActionEvent actionEvent) {

    }

    public void btnRegisterOnAction(ActionEvent actionEvent)  {
        try {
            boolean saveStudent = studentBO.saveStudent(new StudentDTO(
                    txtStudentId.getText(),
                    txtStudentName.getText(),
                    txtAddress.getText(),
                    pckrDateOfBirth.getValue().toString(),
                    txtContactNo.getText(),
                    cmbGender.getValue()
            ));
            if(saveStudent){
                new Alert(Alert.AlertType.INFORMATION,"Save Successfully...").show();

            }
        } catch (Exception e) {
            e.printStackTrace();
            new Alert(Alert.AlertType.INFORMATION,"Save Failed...").show();
        }

    }

    public void btnRemoveOnAction(ActionEvent actionEvent) {

    }

    public void btnAddOnAction(ActionEvent actionEvent) {

    }

    public void cmbGenderOnAction(ActionEvent actionEvent) {

    }

    public void cmbCourseOnAction(ActionEvent actionEvent) {
        try {
            CourseDTO courseDTO = courseBO.getCourseById(cmbCourse.getValue());
            System.out.println(courseDTO.getCourseFee());
            if(courseDTO!=null){
                txtCourseId.setText(courseDTO.getCode());
                txtCourseDuration.setText(courseDTO.getDuration());
                txtCourseFee.setText(courseDTO.getCourseFee()+"");
            }
        } catch (Exception e) {
            new Alert(Alert.AlertType.ERROR,"No Course Found...").show();
            e.printStackTrace();
        }
    }
}
