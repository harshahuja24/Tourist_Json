package Controller;

import Model.Tourist;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class UserController {
    // Manages all the array dynamic array and all the logic part
    public ArrayList<Tourist> usersArrayList = new ArrayList<>();
    private int lastUserId = 0; // To track the last assigned user ID

    ObjectMapper objectMapper = new ObjectMapper();

    public UserController() {
        try {
            JsonNode jsonNode = objectMapper.readTree(new File("src/User.json"));
            if (jsonNode.isArray()) {
                for (int i = 0; i < jsonNode.size(); i++) {
                    String name = jsonNode.get(i).get("name").asText();
                    String surname = jsonNode.get(i).get("surname").asText();
                    int age = jsonNode.get(i).get("age").asInt();

                    int user_id = ++lastUserId; // Increment the user ID

                    Tourist u = new Tourist(name, surname, age, user_id);
                    usersArrayList.add(u);
                }
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    public void addPatient(Tourist patient) {
        int user_id = ++lastUserId; // Assign a new user ID
        patient.setUser_id(user_id);
        usersArrayList.add(patient);

        try {
            objectMapper.writeValue(new File("src/User.json"), usersArrayList);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    // Rest of your UserController methods...

    public void displayPatient() {
        for (Tourist u : usersArrayList) {
            System.out.println(u);
        }
    }

    public void updatePatient(int user_id, int innerOption, String value) {
        Tourist u = null;
        boolean found = false;
        int i = 0;
        for (i = 0; i < usersArrayList.size(); i++) {
            if (usersArrayList.get(i).getUser_id() == user_id) {
                u = usersArrayList.get(i);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("ID not found!");
            return;
        }
        switch (innerOption) {
            case 1:
                u.setName(value);
                break;
            case 2:
                u.setAge(Integer.parseInt(value));
                break;
            case 3:
                u.setSurname(value);
                break;
        }
        usersArrayList.set(i, u);

        try {
            objectMapper.writeValue(new File("src/User.json"), usersArrayList);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void deletePatient(int user_id) {
        Tourist u = null;
        boolean found = false;
        int i = 0;
        for (i = 0; i < usersArrayList.size(); i++) {
            if (usersArrayList.get(i).getUser_id() == user_id) {
                u = usersArrayList.get(i);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("ID not found!");
            return;
        }
        usersArrayList.remove(i);
        try {
            objectMapper.writeValue(new File("src/User.json"), usersArrayList);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
