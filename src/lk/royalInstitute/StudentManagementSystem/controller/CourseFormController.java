package lk.royalInstitute.StudentManagementSystem.controller;

import com.jfoenix.controls.JFXTextField;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import lk.royalInstitute.StudentManagementSystem.bo.BoFactory;
import lk.royalInstitute.StudentManagementSystem.bo.custom.CourseBO;
import lk.royalInstitute.StudentManagementSystem.dto.CourseDTO;
import lk.royalInstitute.StudentManagementSystem.view.tm.CourseTM;

import java.net.URL;
import java.util.ArrayList;
import java.util.Optional;
import java.util.ResourceBundle;

public class CourseFormController implements Initializable {
    public JFXTextField txtCourseId;
    public JFXTextField txtCourseName;
    public JFXTextField txtCourseDuration;
    public JFXTextField txtCourseFee;
    public TableColumn colCourseId;
    public TableColumn colCourseName;
    public TableColumn colDuration;
    public TableColumn colFee;
    public TableView<CourseTM> tblCourse;

    private CourseBO courseBO= BoFactory.getInstance().getBo(BoFactory.BoType.COURSE);
    private ObservableList<CourseTM> courseTMS = FXCollections.observableArrayList();

    @Override
    public void initialize(URL location, ResourceBundle resources) {
//        tblCourse.getColumns().get(0).setCellValueFactory(new PropertyValueFactory<>("code"));
        tblCourse.getColumns().get(0).setCellValueFactory(new PropertyValueFactory<>("name"));
        tblCourse.getColumns().get(1).setCellValueFactory(new PropertyValueFactory<>("duration"));
        tblCourse.getColumns().get(2).setCellValueFactory(new PropertyValueFactory<>("courseFee"));

        loadTable();
    }
    public void txtIdOnAction(ActionEvent actionEvent) {

    }

    public void btnSaveOnAction(ActionEvent actionEvent) {
        try {
            boolean saveCourse = courseBO.saveCourse(new CourseDTO(
//                    txtCourseId.getText(),
                    txtCourseName.getText(),
                    txtCourseDuration.getText(),
                    Double.parseDouble(txtCourseFee.getText())
            ));
            if(saveCourse){
                new Alert(Alert.AlertType.INFORMATION,"Save Successfully...").show();
                clearFields();
                loadTable();
                tblCourse.refresh();
            }
        } catch (Exception e) {
            new Alert(Alert.AlertType.INFORMATION,"Save Failed...").show();
            e.printStackTrace();
        }
    }

    public void btnRemoveOnAction(ActionEvent actionEvent) {
     Alert alert = new Alert(Alert.AlertType.CONFIRMATION,"Are you sure whether you want to delete this Course?",
        ButtonType.YES,ButtonType.NO);
        Optional<ButtonType> buttonType = alert.showAndWait();
        if(buttonType.get()==ButtonType.YES){
            CourseTM selectedItem =  tblCourse.getSelectionModel().getSelectedItem();
            try{
//                courseBO.deleteCourse(selectedItem.getCode());
                tblCourse.getItems().remove(selectedItem);
                tblCourse.getSelectionModel().clearSelection();
                tblCourse.refresh();
            }catch (Exception e){
                e.printStackTrace();
                new Alert(Alert.AlertType.ERROR,"Failed to delete the Course",ButtonType.OK).show();
            }
        }
    }
    public void loadTable(){
        try {
            tblCourse.refresh();
            ArrayList<CourseDTO> courseBOAll = courseBO.getAll();
            for (CourseDTO c : courseBOAll) {
                courseTMS.add(new CourseTM(
//                        c.getCode(),
                        c.getName(),
                        c.getDuration(),
                        c.getCourseFee()
                ));
                tblCourse.setItems(courseTMS);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void clearFields(){
//        txtCourseId.clear();
        txtCourseFee.clear();
        txtCourseName.clear();
        txtCourseDuration.clear();
    }
}
