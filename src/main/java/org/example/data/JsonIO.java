package org.example.data;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.example.model.AppUser;

import java.io.File;
import java.io.IOException;
import java.util.Collection;

public class JsonIO {

    private ObjectMapper objectMapper;

    public JsonIO() {
        objectMapper = ObjectMapperSupplier
                .getInstance()
                .getObjectMapper();
    }

    public Collection<AppUser> serializeToJson(Collection<AppUser> appUsers, File file){
        try{
            if(!file.exists()){
                file.createNewFile();
            }

            objectMapper.writeValue(file, appUsers);

        } catch (IOException e) {
            e.printStackTrace();
        }
        return appUsers;
    }


}
