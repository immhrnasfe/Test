package com.test.controller;


import com.test.model.entity.Personal;
import com.test.model.service.PersonalService;

import java.util.List;

// PersonalController.java
public class PersonalController {

    private final PersonalService personalService = new PersonalService();

    public void save(Personal personal) {
        personalService.add(personal);
    }

    public boolean update(Personal personal) {
        personalService.update(personal);
        return true;
    }

    public String delete(Long id) {
        return personalService.delete(id);
    }

    public List<Personal> getAll() {
        return personalService.getPersonalList();
    }

    public Personal findById(Long id) {
        Personal personal = personalService.findById(id);
        if (personal == null) {
            System.out.println("Personal with ID " + id + " not found.");
        }
        return personal;
    }

    public List<Personal> findAll() {
        return personalService.findAll();
    }
}

