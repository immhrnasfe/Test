package com.test.model.entity;

import java.time.LocalDate;

public class Holiday {

    private LocalDate startDate;
    private LocalDate endDate;
    //@ManyToOne
    private Personal personal;

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }
    public void setPersonal(Personal personal) {
        this.personal = personal;
    }

    public Personal getPersonal() {
        return personal;
    }

    @Override
    public String toString() {
        return "Holiday{" +
                "startDate=" + startDate +
                ", endDate=" + endDate +
                ", personal=" + personal.getId() + " (" + personal.getId() + ")" +
                '}';
    }
}

//    public static void addHoliday(Scanner scanner) {
//        System.out.println("com.test.Holiday");
//
//        System.out.print("Enter start date (YYYY-MM-DD): ");
//        LocalDate startDate = LocalDate.parse(scanner.nextLine());
//        scanner.nextLine();
//
//        System.out.print("Enter end date (YYYY-MM-DD): ");
//        LocalDate date = LocalDate.parse(scanner.nextLine());
//
//
//    }
//
//    @Override
//    public String toString() {
//        return "Holiday{" +
//                "startDate=" + startDate +
//                ", endDate=" + endDate +
//                '}';
//    }
//}