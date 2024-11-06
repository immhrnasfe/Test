import java.util.ArrayList;
import java.util.Scanner;

import static java.awt.SystemColor.info;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or

// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    static ArrayList<PersonalInformation> personalList = new ArrayList<>();
    static ArrayList<Holiday> holidayArrayList = new ArrayList<>();


    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        while (true) {
            createMenu(scanner);
        }
    }



    public static void createMenu(Scanner scanner) {
        while (true) {
            System.out.println("Create menu" +
                    " \n 1.personal  " +
                    "\n 2.showAll  " +
                    "\n 3.holiday " +
                    "\n 4.confirm holiday " +
                    "\n 5.main menu");

            int create = scanner.nextInt();
            PersonalInformation information = null;
            switch (create) {
                case 1:
                    System.out.println("you select personal information");
                     information = PersonalInformation.personalInformation(scanner);
                    if (information != null) {
                        personalList.add(information);
                        System.out.println("personal added successfully");
                    } else {
                        System.out.println("personal not added");
                    }
                    break;
                case 2:
                    showAll();
                    break;
                case 3:
                    System.out.println("you select holiday ");
                    Holiday.addHoliday(scanner);
                    if (!(information != null)) {
                        System.out.println("No personal information available to associate with the holiday.");
                    } else {
//                        holidayArrayList.add(holiday);
                        System.out.println("Processing holiday for: " + information.getClass().getSimpleName() );
                    }
                    break;

                case 4:
                    System.out.println("you select confirm holiday ");
                    break;
                case 5:
                    System.out.println("back to the main menu");

                    return;
                default:
            }
        }

    }

    public static void showAll() {
        if (personalList.isEmpty()) {
            System.out.println("No personal information found");
        } else {
            for (PersonalInformation info : personalList) {
                System.out.println(info);
            }
        }
    }


}

