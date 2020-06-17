package org.example.data;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

public class ObjectMapperSupplier {
    private static final ObjectMapperSupplier INSTANCE;
    private final ObjectMapper objectMapper;

    static {
        INSTANCE = new ObjectMapperSupplier();
    }

    private ObjectMapperSupplier(){
        objectMapper = new ObjectMapper(); //Instantiation
        objectMapper.enable(SerializationFeature.INDENT_OUTPUT); //For making pretty JSON
        objectMapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false); //No LocalDates as timestamps
        objectMapper.registerModule(new JavaTimeModule()); //Register JSR310
    }

    public static ObjectMapperSupplier getInstance(){
        return INSTANCE;
    }

    public ObjectMapper getObjectMapper(){
        return objectMapper;
    }
}
