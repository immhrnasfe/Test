package com.test.view;

import com.test.controller.PersonalController;
import com.test.model.entity.Personal;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {


    private static Scanner scanner;
    private static PersonalController personalController;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PersonalController personalController = new PersonalController();


        while (true) {
            showMenu();

            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter your username:");
                    String username = scanner.next();
                    System.out.println("Enter your nationalCode :");
                    String nationalCode = scanner.next();
                    System.out.println("Enter your email");
                    String email = scanner.next();
                    System.out.println("Enter your holiday");
                    String holiday = scanner.next();
                    Personal personal = new Personal();
                    Long id = null;
                    personal.setId(id);
                    personal.setUsername(username);
                    personal.setNationalCode(nationalCode);
                    personal.setEmail(email);
                    personal.setHoliday(holiday);

                    personalController.save(personal);

                    System.out.println("Personal information saved successfully.");
                    break;
                case 2:
                    List<Personal> personalList = personalController.findAll();
                    if (personalList.isEmpty()) {
                        System.out.println("No personal information found.");
                    } else {
                        System.out.println("Personal Information List:");
                        for (Personal info : personalList) {
                            System.out.println(info);
                        }
                    }
                    break;
                case 3:
                    System.out.println("Enter the ID :");
                    int idToUpdate = scanner.nextInt();
                    scanner.nextLine();

                    List<Personal> allPersonal = personalController.findAll();
                    Personal updatePersonal = null;
                    for (Personal p : allPersonal) {
                        if (p.getId() == idToUpdate) {
                            updatePersonal = p;
                            break;
                        }
                    }
                    if (updatePersonal == null) {
                        System.out.println("Personal information not found.");
                    } else {
                        System.out.println("Enter new username (current: " + updatePersonal.getUsername() + "):");
                        updatePersonal.setUsername(scanner.nextLine());
                        System.out.println("Enter new nationalCode (current: " + updatePersonal.getNationalCode() + "):");
                        updatePersonal.setNationalCode(scanner.nextLine());
                        System.out.println("Enter new email (current: " + updatePersonal.getEmail() + "):");
                        updatePersonal.setEmail(scanner.nextLine());
                        System.out.println("Enter new holiday (current: " + updatePersonal.getHoliday() + "):");
                        updatePersonal.setHoliday(scanner.nextLine());

                        boolean updated = personalController.update(updatePersonal);
                        if (updated) {
                            System.out.println("Personal information updated successfully.");
                        } else {
                            System.out.println("Failed to update personal information.");
                        }
                    }
                    break;
                case 4:
                    System.out.println("Enter the ID :");
                    Long idToDelete = scanner.nextLong();
                    if (false) {
                        System.out.println("Personal not found.");
                    } else {
                        personalController.delete(idToDelete);
                        System.out.println("Personal deleted successfully.");
                    }
                    break;
                case 5:
                    System.out.println("Enter the ID :");
                    Long findById = scanner.nextLong();
                    Personal personal1 = personalController.findById(findById);
                    if (personal1 != null) {
                        System.out.println("Personal found successfully.");
                    }
                    break;
                case 6:
                    System.out.println("Exiting program.");
            }
        }


    }

    public static void showMenu() {
        System.out.println("1.add personal " +
                "\n2.list personal" +
                "\n3.update personal" +
                "\n4.delete personal" +
                "\n5.Find Personal by ID" +
                "\n6.Exit");


    }


    //    static ArrayList<Personal> personalList = new ArrayList<>();
    //    static ArrayList<Holiday> holidayArrayList = new ArrayList<>();
    //
    //
    //    public static void main(String[] args) {
    //
    //        PersonalController personalController = new PersonalController();
    //        Scanner scanner = new Scanner(System.in);
    //
    //        while (true) {
    //            showMenu();
    //            create(scanner, personalController);
    //        }
    //    }
    //
    //    public static void create(Scanner scanner, PersonalController personalController) {
    //     while (true) {
    //            int chooseNumber = scanner.nextInt();
    //            Personal information = null;
    //            switch (chooseNumber) {
    //                case 1:
    ////                    System.out.println("you select personal information");
    ////                    information = PersonalService.addPersonal(scanner);
    ////                    if (information != null) {
    ////                        personalList.add(information);
    ////                        System.out.println("personal added successfully");
    ////                    } else {
    ////                        System.out.println("personal not added");
    ////                    }
    ////                    break;
    //                    Personal personal = new Personal();
    //                    System.out.print("Enter your firstName: ");
    //                    personal.setFirstName(scanner.nextLine());
    //                    scanner.nextLine();
    //
    //                    System.out.print("Enter your lastName: ");
    //                    personal.setLastName(scanner.nextLine());
    //
    //                    System.out.print("Enter your Email: ");
    //                    personal.setEmail(scanner.nextLine());
    //
    //                    System.out.print("Enter your nationalCode: ");
    //                    personal.setNationalCode(scanner.nextLine());
    //                    scanner.nextLine();
    //
    //                    personalController.save(personal);
    //                    break;
    //
    //                case 2:
    //
    //                    break;
    //                case 3:
    //                    System.out.println("you select holiday ");
    //                    Holiday.addHoliday(scanner);
    //                    if (!(information != null)) {
    //                        System.out.println("No personal information available to associate with the holiday.");
    //                    } else {
    ////                        holidayArrayList.add(holiday);
    //                        System.out.println("Processing holiday for: " + information.getClass().getSimpleName() );
    //                    }
    //                    break;
    //
    //                case 4:
    //                    System.out.println("you select confirm holiday ");
    //                    break;
    //                case 5:
    //                    System.out.println("back to the main menu");
    //
    //                    return;
    //                default:
    //            }
    //        }
    //
    //    }


}