package Student;

import java.util.Date;
//A modified version of my C# student profile class
public class Student {
   
        //student profile variables
        String StudentName;



        int StudentAge;
        int StudentTUID;
        Date GradDate;
        Boolean UndergradStatus;
        //create student profile
        public Student( String name, int age,  Date graduationDate, int TUID, String email, String major, Boolean isUnderGrad)
        {
            StudentName = name;
            StudentPhone = phoneNum;

            StudentAge = age;
            StudentTUID = TUID;
            GradDate = graduationDate;
            UndergradStatus = isUnderGrad;
        }
        //To String override for the student profile class
        public  String ToString()
    {
        String output = "";
        output += "Student Name: " + StudentName;
        output += " Student Phone: " + StudentPhone;
        output += " Student Age: " + StudentAge;
        output += " Student TUID: " + StudentTUID;
        output += " Student Graduation Date: " + GradDate;
        if (UndergradStatus)
        {
            output += " Student is: " + "undergraduate";
        }
        else
        {
            output += " Student is: " + "not undergraduate";
        }

        return output;
    }

    
}
