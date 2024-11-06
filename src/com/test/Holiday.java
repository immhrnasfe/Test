package com.test;

import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;

public class Holiday {

    private LocalDate startDate;
    private LocalDate endDate;
    //@ManyToOne
//    private PersonalInformation personal;

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public static void addHoliday(Scanner scanner) {
        System.out.println("com.test.Holiday");

        System.out.print("Enter start date (YYYY-MM-DD): ");
        LocalDate startDate = LocalDate.parse(scanner.nextLine());
        scanner.nextLine();

        System.out.print("Enter end date (YYYY-MM-DD): ");
        LocalDate date = LocalDate.parse(scanner.nextLine());


    }

    @Override
    public String toString() {
        return "Holiday{" +
                "startDate=" + startDate +
                ", endDate=" + endDate +
                '}';
    }
}
