package com.test.model.service;

import com.test.model.entity.Personal;
import com.test.model.repository.PersonalRepository;

import java.util.ArrayList;
import java.util.List;

// PersonalService.java
public class PersonalService {
    private final PersonalRepository personalRepository = new PersonalRepository();
    private List<Personal> personalList = new ArrayList<>();


    public void add(Personal personal) {
        personalRepository.add(personal);  // Add personal to the repository
    }

    public boolean update(Personal updatedPersonal) {
        for (int i = 0; i < personalList.size(); i++) {
            Personal personal = personalList.get(i);
            if (personal.getId() == updatedPersonal.getId()) {
                // Update fields
                personal.setUsername(updatedPersonal.getUsername());
                personal.setNationalCode(updatedPersonal.getNationalCode());
                personal.setEmail(updatedPersonal.getEmail());
                personal.setHoliday(updatedPersonal.getHoliday());
                return true;  // Update successful
            }
        }
        return false;  // No Personal object with that ID was found
    }
    public List<Personal> getPersonalList() {
        return personalRepository.getPersonalList();  // Get all personals
    }

    public String delete(Long id) {
        List<Personal> personalList = personalRepository.getPersonalList();
        for (Personal personal : personalList) {
            if (personal.getId() == id) {
                personalRepository.delete(personal);  // Delete personal from repository
                return "Personal with ID " + id + " deleted successfully.";
            }
        }
        return "Personal with ID " + id + " not found.";  // Return error message if not found
    }

    public Personal findById(Long id) {
        List<Personal> personalList = personalRepository.getPersonalList();
        for (Personal personal : personalList) {
            if (personal.getId() == id) {
                return personal;  // Return the personal if found
            }
        }
        return null;  // Return null if no matching personal found
    }

    public List<Personal> findAll() {
        return personalRepository.findAll();

    }
}

//    public static Personal save(Scanner scanner) {
//        Personal info = new Personal();
//        System.out.println("Personal Information");
//
//        System.out.print("Enter your firstName: ");
//        info.setFirstName(scanner.nextLine());
//        scanner.nextLine();
//
//        System.out.print("Enter your lastName: ");
//        info.setLastName(scanner.nextLine());
//
//        System.out.print("Enter your Email: ");
//        info.setEmail(scanner.nextLine());
//
//        System.out.print("Enter your nationalCode: ");
//        info.setNationalCode(scanner.nextLine());
//
//        Holiday holiday = HolidayService.addHoliday(scanner);
//        List<Holiday> holidayList = new ArrayList<>();
//        holidayList.add(holiday);
//        info.setHoliday(holidayList);
//
//
//        return info;
    //        System.out.println("Enter your holiday: ");
//        String dateString = scanner.next();
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
//        LocalDate date = LocalDate.parse(dateString, formatter);
//        List<LocalDate> dates = new ArrayList<>();
//        dates.add(date);
//        info.holiday = dates;



