package PersonAndStudent;

import java.time.LocalDate;

public class Student extends Person {
    private String faculty;
    private int graduateYear;

    Student(String firstName, String lastName, LocalDate birthDate, String faculty, int graduateYear) {
        super(firstName, lastName, birthDate);
        this.faculty=faculty;
        this.graduateYear=graduateYear;
    }
    String getFaculty()
    {
        return faculty;
    }
    int getGraduateYear()
    {
        return graduateYear;
    }
    void setFaculty(String faculty)
    {
        this.faculty=faculty;
    }
    void setGraduateYear(int graduateYear)
    {
        this.graduateYear=graduateYear;
    }
}
