package PersonAndStudent;

public class Person {
    private String firstName;
    private String lastName;
    private java.time.LocalDate birthDate;

    Person(String firstName, String lastName, java.time.LocalDate birthDate)
    {
        this.firstName=firstName;
        this.lastName=lastName;
        this.birthDate=birthDate;
    }

    String getFirstName()
    {
        return firstName;
    }
    String getLastName()
    {
        return lastName;
    }
    java.time.LocalDate getBirthDate()
    {
        return birthDate;
    }
    void setFirstName(String firstName)
    {
        this.firstName=firstName;
    }
    void setLastName(String lastName)
    {
        this.lastName=lastName;
    }
    void setBirthDate(java.time.LocalDate birthDate)
    {
        this.birthDate=birthDate;
    }

}
