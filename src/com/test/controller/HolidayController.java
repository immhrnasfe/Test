package com.test.controller;

import com.test.model.entity.Personal;
import com.test.model.service.HolidayService;

import java.util.Scanner;

public class HolidayController {

    private static HolidayService holidayService;

    public void addHoliday(Scanner scanner, Personal personal) {
        holidayService.addHoliday(scanner, personal);


    }
}
