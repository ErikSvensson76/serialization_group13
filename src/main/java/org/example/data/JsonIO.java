package org.example.data;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.example.model.AppUser;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

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

    public Collection<AppUser> deserializeFromFile(File file){
        List<AppUser> appUserList = new ArrayList<>();
        try{
            appUserList = objectMapper.readValue(file, new TypeReference<List<AppUser>>(){});
        } catch (IOException e) {
            e.printStackTrace();
        }
        return appUserList;
    }


}
