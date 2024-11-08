package com.test.model.repository;

import com.test.model.entity.Personal;

import java.util.ArrayList;
import java.util.List;

public class PersonalRepository {

    private List<Personal> personalList = new ArrayList<>();

    // Add a new Personal
    public void add(Personal personal) {
        personalList.add(personal);
    }

    // Update
    public void update(Personal personal) {
        for (int i = 0; i < personalList.size(); i++) {
            if (personalList.get(i).getId() == personal.getId()) {
                personalList.set(i, personal);
                return;
            }
        }
    }

    // Get the list of all Personal
    public List<Personal> getPersonalList() {
        return personalList;
    }

    // Delete a Personal
    public void delete(Personal personal) {
        personalList.remove(personal);
    }

    // Find a Personal by ID
    public Personal findById(int id) {
        for (Personal personal : personalList) {
            if (personal.getId() == id) {
                return personal;
            }
        }
        return null;
    }

    public List<Personal> findAll() {
        return personalList;
    }
}
