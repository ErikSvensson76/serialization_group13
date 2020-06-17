package org.example;

import org.example.data.JsonIO;
import org.example.model.Address;
import org.example.model.AppUser;

import java.io.File;
import java.util.Arrays;
import java.util.List;

public class JsonApp {

    private static JsonIO jsonIO = new JsonIO();

    public static void main(String[] args) {

        List<AppUser> appUsers = Arrays.asList(
                new AppUser("Test", "test@test.com", null, "1234"),
                new AppUser("Erik", "erik@gmail.com", new Address("Friskhetsvägen", 2, "35263", "Växjö"), "javadev")
        );

        jsonIO.serializeToJson(appUsers, new File("serialized_data/users.json"));



    }
}
