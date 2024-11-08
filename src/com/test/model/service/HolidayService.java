//package com.test.model.service;
//
//import com.test.model.entity.Holiday;
//
//import java.time.LocalDate;
//import java.time.format.DateTimeFormatter;
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Scanner;
//
//public class HolidayService {
//
//    public static Holiday addHoliday(Scanner scanner) {
//
//        Holiday holiday1 = new Holiday();
//        List<Holiday> holidayList = new ArrayList<>();
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
//        LocalDate date;
//        System.out.println("Enter your startDate: ");
//        String dateString = scanner.next();
//        date = LocalDate.parse(dateString, formatter);
//        holiday1.setStartDate(date);
//        System.out.println("Enter your endDate: ");
//        String dateString1 = scanner.next();
//        date = LocalDate.parse(dateString1, formatter);
//        holiday1.setEndDate(date);
//        holidayList.add(holiday1);
//        return holiday1;
//
//
//    }
//}
