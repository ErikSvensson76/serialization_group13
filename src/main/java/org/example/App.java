package org.example;

import org.example.data.ObjectSerializer;
import org.example.model.Address;
import org.example.model.AppUser;

import java.util.Optional;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        String path = "serialized_data/app_user.dat";

        Optional<AppUser> appUser = ObjectSerializer.deserialize(path);
        System.out.println(appUser);

        /*
        //Should already be serialized
            AppUser user = new AppUser(
                "Test Testsson",
                "test@test.com",
                new Address(
                        "Test avenue",
                        1,
                        "135456",
                        "Testville"
                ),
                "testing123"
        );

        ObjectSerializer.serialize(user, path);

         */


    }
}
