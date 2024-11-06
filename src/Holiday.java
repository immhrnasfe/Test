import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;

public class Holiday {

    private Date startDate;
    private Date endDate;
    private PersonalInformation personal;


    public static void addHoliday(Scanner scanner) {
        System.out.println("Holiday");

        System.out.print("Enter start date (YYYY-MM-DD): ");
        LocalDate startDate = LocalDate.parse(scanner.nextLine());
        scanner.nextLine();

        System.out.print("Enter end date (YYYY-MM-DD): ");
        LocalDate date = LocalDate.parse(scanner.nextLine());


    }


}
