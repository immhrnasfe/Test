package com.test.model.service;

import com.test.model.entity.Holiday;
import com.test.model.entity.Personal;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class HolidayService {


    public static LocalDate addDate() {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        return LocalDate.parse(str, dtf);
    }
    public static void addHoliday(Scanner scanner, Personal personal) {
        System.out.println("Registering new holiday:");

        System.out.print("star date (dd-MM-yyyy)");
        LocalDate startDate = addDate();
        scanner.nextLine();

        System.out.print("end date (dd-MM-yyyy)");
        LocalDate endDate = addDate();

        Holiday holiday = new Holiday();
        holiday.setStartDate(startDate);
        holiday.setEndDate(endDate);
        holiday.setPersonal(personal);

        System.out.println("holiday register: " + holiday);
    }
}

