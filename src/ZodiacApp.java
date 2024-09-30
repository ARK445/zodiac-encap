import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;

public class ZodiacApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueApp = true;

        while (continueApp) {
            String name = "";
            int year = 0, month = 0, day = 0;
            LocalDate birthDate = null;
            boolean validInput = false;

            
            while (!validInput) {
                try {
                    
                    System.out.print("Enter your name: ");
                    name = scanner.nextLine();

                    // Adjusted regex to allow letters, spaces, hyphens, and apostrophes
                    if (!name.matches("[a-zA-Z\\s'-]+")) {
                        System.out.println("Invalid name. Please enter only letters, spaces, hyphens, or apostrophes.");
                        
                    }

                   
                    boolean validYear = false;
                    while (!validYear) {
                        System.out.print("Enter your year of birth (YYYY): ");
                        String yearInput = scanner.nextLine();
                        
                        
                        if (yearInput.matches("\\d{4}")) {
                            year = Integer.parseInt(yearInput);
                            if (year >= 1900 && year <= LocalDate.now().getYear()) {
                                validYear = true; // Valid year, proceed
                            } else {
                                System.out.println("Invalid year. Please enter a year between 1900 and " + LocalDate.now().getYear() + ".");
                            }
                        } else {
                            System.out.println("Invalid input. Please enter a valid 4-digit year.");
                        }
                    }

                    
                    boolean validMonth = false;
                    while (!validMonth) {
                        try {
                            System.out.print("Enter your month of birth (MM): ");
                            month = Integer.parseInt(scanner.nextLine());
                            if (month < 1 || month > 12) {
                                System.out.println("Invalid month. Please enter a number between 1 and 12.");
                            } else {
                                validMonth = true; 
                            }
                        } catch (NumberFormatException e) {
                            System.out.println("Invalid input. Please enter a valid number for the month.");
                        }
                    }

                    
                    boolean validDay = false;
                    while (!validDay) {
                        try {
                            System.out.print("Enter your day of birth (DD): ");
                            day = Integer.parseInt(scanner.nextLine());

                            
                            birthDate = LocalDate.of(year, month, day);

                           
                            validInput = true;
                            validDay = true; 
                        } catch (DateTimeParseException e) {
                            System.out.println("Invalid date. The day you entered is not valid for the given month and year. Please try again.");
                        } catch (NumberFormatException e) {
                            System.out.println("Invalid input. Please enter a valid number for the day.");
                        }
                    }

                    
                    zodiacMethod person = new zodiacMethod(name, birthDate.toString());

                    
                    zodiacSign zodiac = new zodiacSign(birthDate);

                    
                    System.out.println("\n--- Zodiac Information ---");
                    System.out.println("Your Name: " + person.getName());
                    System.out.println("Your Age: " + person.getAge());
                    System.out.println("Date of Birth: " + person.getDateOfBirth());
                    System.out.println("Zodiac Sign: " + zodiac.getZodiacSign());
                    System.out.println("Lucky Number: " + zodiac.getLuckyNumber());
                    System.out.println("Love Life: " + zodiac.getLoveLife());
                    System.out.println("Destiny: " + zodiac.getDestiny());

                } catch (Exception e) {
                    System.out.println("An unexpected error occurred. Please try again.");
                }
            }

            
            System.out.print("Do you want to enter another person's information? (yes/y/no): ");
            String response = scanner.nextLine().trim().toLowerCase();

            
            if (!response.equals("yes") && !response.equals("y")) {
                continueApp = false; 
            }
        }
        System.out.println("Thank you for using the Zodiac App!");
        scanner.close();
    }
}
