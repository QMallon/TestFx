package sample;

import Student.Student;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class Controller {
    private List<Student> studentList = new ArrayList<Student>();

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
    void Close(ActionEvent event)
    {
        Platform.exit();
    }

    @FXML
    void SaveStudent(ActionEvent event) {
        if(checkBlank())
        {

            Student newStudent = new Student("Quinn",24, 12346, true  );
            studentList.add(newStudent);
        }

    }

    @FXML
    void SaveToText(ActionEvent event) {
            printList();
    }
    //Check for blanks will implement later
    public Boolean checkBlank(){
        return true;
    }


    public void printList(){
        for(Student s :studentList){
            System.out.println(s.ToString());
        }
    }

}
