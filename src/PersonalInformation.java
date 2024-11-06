import java.time.LocalDate;
import java.util.Scanner;

public class PersonalInformation {

    private String firstName;
    private String lastName;
    private int age;
    private String email;
    private String nationalCode;
    private Holiday holiday;


    public static PersonalInformation personalInformation(Scanner scanner) {
        PersonalInformation info = new PersonalInformation();
        System.out.println("Personal Information");

        System.out.print("Enter your firstName: ");
        info.firstName = scanner.next();
        scanner.nextLine();

        System.out.print("Enter your lastName: ");
        info.lastName = scanner.nextLine();

        System.out.print("Enter your age: ");
        info.age = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter your Email: ");
        info.email = scanner.nextLine();

        System.out.print("Enter your nationalCode: ");
        info.nationalCode = scanner.nextLine();

        System.out.println("Enter your holiday: ");
        LocalDate.parse(scanner.nextLine());
        return info;
    }


    @Override
    public String toString() {
        return "PersonalInformation{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                ", nationalCode='" + nationalCode + '\'' +
                ", holiday=" + holiday +
                '}';
    }
}



