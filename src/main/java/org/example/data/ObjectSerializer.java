package org.example.data;

import org.example.model.AppUser;

import java.io.*;
import java.util.Optional;

public class ObjectSerializer {

    public static AppUser serialize(AppUser appUser, String filePath){
        try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(filePath))){

            out.writeObject(appUser);

        }catch (IOException ex){
            ex.printStackTrace();
        }
        return appUser;
    }

    public static Optional<AppUser> deserialize(String filePath) {
        Optional<AppUser> optional = Optional.empty();
        try(ObjectInputStream in = new ObjectInputStream(new FileInputStream(filePath))){

            optional = Optional.ofNullable((AppUser)in.readObject());

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return optional;
    }



}
