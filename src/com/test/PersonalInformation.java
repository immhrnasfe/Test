package com.test;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PersonalInformation {

    private String firstName;
    private String lastName;
    private int age;
    private String email;
    private String nationalCode;
    //@OneToMany
    private List<Holiday> holiday;


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

//        System.out.println("Enter your holiday: ");
//        String dateString = scanner.next();
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
//        LocalDate date = LocalDate.parse(dateString, formatter);
//        List<LocalDate> dates = new ArrayList<>();
//        dates.add(date);
//        info.holiday = dates;

        Holiday holiday1 = new Holiday();
        List<Holiday> holidayList = new ArrayList<>();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate date;
        System.out.println("Enter your startDate: ");
        String dateString = scanner.next();
        date = LocalDate.parse(dateString, formatter);
        holiday1.setStartDate(date);
        System.out.println("Enter your endDate: ");
        String dateString1 = scanner.next();
        date = LocalDate.parse(dateString1, formatter);
        holiday1.setEndDate(date);
        holidayList.add(holiday1);
        info.holiday = holidayList;
        return info;
    }


    @Override
    public String toString() {
        return "com.test.PersonalInformation{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                ", nationalCode='" + nationalCode + '\'' +
                ", holiday=" + holiday +
                '}';
    }
}



