import java.time.LocalDate;
import java.time.Period;

public class zodiacMethod {
    private String name;
    private String dateOfBirth;
    private int age;

    // Constructor
    public zodiacMethod(String name, String dateOfBirth) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.age = calculateAge(LocalDate.parse(dateOfBirth));
    }

    // Method to calculate age
    private int calculateAge(LocalDate birthDate) {
        LocalDate currentDate = LocalDate.now();
        return Period.between(birthDate, currentDate).getYears();
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public int getAge() {
        return age;
    }
}