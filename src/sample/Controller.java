package sample;

import Student.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class Controller {
    private ArrayList<Student> studentList = new ArrayList<Student>();

    @FXML
    private Button btnExit;

    @FXML
    private DatePicker dpDOB;

    @FXML
    private DatePicker dpEG;

    @FXML
    private TextField txtFirstName;

    @FXML
    private TextField txtLastName;

    @FXML
    private TextField txtMidName;

    @FXML
    void Close(ActionEvent event) {

    }

    @FXML
    void SaveStudent(ActionEvent event) {
//String output = txtLastName.getText() + " " + txtFirstName.getText();
    if(checkBlank()){
        //int age = LocalDateTime.now().Year - dpDOB.value.Year - (DateTime.Now.DayOfYear < dpDOB.Value.DayOfYear ? 1 : 0);
    Student newStudent = new Student("Quinn",24,);
    }
    }

    @FXML
    void SaveToText(ActionEvent event) {

    }
    //Check for blanks will implement later
    public Boolean checkBlank(){
        return true;
    }

}
