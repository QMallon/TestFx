package Student;



//A modified version of my C# student profile class
public class Student {
   
        //student profile variables
        String StudentName;



        int StudentAge;
        int StudentTUID;
        //LocalDateTime GradDate;
        Boolean UndergradStatus;
        //create student profile
        public Student( String name, int age,  int TUID, Boolean isUnderGrad)
        {
            StudentName = name;


            StudentAge = age;
            StudentTUID = TUID;

            UndergradStatus = isUnderGrad;
        }
        //To String override for the student profile class
        public String ToString()
    {
        String output = "";
        output += "Student Name: " + StudentName;

        output += " Student Age: " + StudentAge;
        output += " Student TUID: " + StudentTUID;

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
