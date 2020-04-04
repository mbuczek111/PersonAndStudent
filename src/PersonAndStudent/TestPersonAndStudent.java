package PersonAndStudent;

import java.time.LocalDate;

public class TestPersonAndStudent {
    public static void main(String[] args) {

        Person ja = new Person("Mikolaj", "Buczek", LocalDate.parse("1992-03-11"));
        Student ona = new Student("Grazyna", "Syrtek", LocalDate.parse("1992-09-24"), "FMI", 2015);
        System.out.println(ona.getBirthDate());
        ona.setGraduateYear(2011);
        System.out.println(ona.getGraduateYear());
        
    }
}