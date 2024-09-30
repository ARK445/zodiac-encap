import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;

public class ZodiacApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueApp = true;

        while (continueApp) {
            String name = "";
            int year,month,day ;
            LocalDate birthDate = null;
            boolean validInput = false;

            // Loop until valid inputs are entered
            while (!validInput) {
                try {
                    
                    System.out.print("Enter your name: ");
                    name = scanner.nextLine();

                    
                    if (!name.matches("[a-zA-Z]+")) {
                        System.out.println("Invalid name. Please enter letters only.");  // Skip to the next iteration of the loop
                        continue; 
                    }

                    System.out.print("Enter your year of birth (YYYY): ");// Input year of birth
                    year = Integer.parseInt(scanner.nextLine());
                
                    System.out.print("Enter your month of birth (MM): ");// Input month of birth
                    month = Integer.parseInt(scanner.nextLine());
                
                    System.out.print("Enter your day of birth (DD): ");// Input day of birth
                    day = Integer.parseInt(scanner.nextLine());
             
                    birthDate = LocalDate.of(year, month, day);// Create a LocalDate object from year, month, and day

                    validInput = true;// If no exception is thrown, the input is valid

                    
                    zodiacMethod person = new zodiacMethod(name, birthDate.toString());// Create a Person object
        
                    zodiacSign zodiac = new zodiacSign(birthDate);// Create a ZodiacSign object using the person's birthdate
        
                    System.out.println("\n--- Zodiac Information ---");
                    System.out.println("Your Name: " + person.getName());
                    System.out.println("Your Age: " + person.getAge());
                    System.out.println("Date of Birth: " + person.getDateOfBirth());
                    System.out.println("Zodiac Sign: " + zodiac.getZodiacSign());     // Output the results
                    System.out.println("Lucky Number: " + zodiac.getLuckyNumber());
                    System.out.println("Love Life: " + zodiac.getLoveLife());
                    System.out.println("Destiny: " + zodiac.getDestiny());

                } catch (DateTimeParseException e) {
                    System.out.println("Invalid date. Please try again.");
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input. Please enter valid numeric values for year, month, and day.");
                } catch (Exception e) {
                    System.out.println("An error occurred. Please try again.");
                }
            }

            
            System.out.print("Do you want to enter another person's information? (yes/no): "); // Ask the user if they want to try again
            String response = scanner.nextLine().trim().toLowerCase();

            
            if (!response.equals("yes")) {// Check if the user wants to continue

                continueApp = false; // Exit the loop if the user does not want to continue
            }
        }
        System.out.println("Thank you for using the Zodiac App!");
        scanner.close();
    }
}