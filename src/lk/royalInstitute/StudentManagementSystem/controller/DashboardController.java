package lk.royalInstitute.StudentManagementSystem.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Background;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class DashboardController implements Initializable {
    public AnchorPane main;
    public AnchorPane children;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    public void clckDashboard(MouseEvent mouseEvent) throws IOException {
        Parent root= FXMLLoader.load(getClass().getResource("/lk/royalInstitute/StudentManagementSystem/view/Dashboard.fxml"));
        main.setBackground(Background.EMPTY);
        main.getChildren().setAll(root);
    }

    public void btnStudentFormOnAction(ActionEvent actionEvent) throws IOException {
        Parent root= FXMLLoader.load(getClass().getResource("/lk/royalInstitute/StudentManagementSystem/view/StudentForm.fxml"));
        children.setBackground(Background.EMPTY);
        children.getChildren().setAll(root);
    }

    public void btnCourseOnAction(ActionEvent actionEvent) throws IOException {
        Parent root= FXMLLoader.load(getClass().getResource("/lk/royalInstitute/StudentManagementSystem/view/CourseForm.fxml"));
        children.setBackground(Background.EMPTY);
        children.getChildren().setAll(root);
    }

    public void btnStudentDetailOnAction(ActionEvent actionEvent) throws IOException {
        Parent root= FXMLLoader.load(getClass().getResource("/lk/royalInstitute/StudentManagementSystem/view/StudentDetailForm.fxml"));
        children.setBackground(Background.EMPTY);
        children.getChildren().setAll(root);
    }


}
