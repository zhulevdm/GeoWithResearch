import java.time.Year;

public class Person {
    private String fullName;
    private int age;
    private int yearOfBirth;

    public Person(String fullName, int yearOfBirth) {
        this.fullName = fullName;
        this.yearOfBirth = yearOfBirth;
        int currentYear = Year.now().getValue();
        age = currentYear - this.yearOfBirth;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public String getFullName() {
        return fullName;
    }

    public int getAge() {
        return age;
    }
}
