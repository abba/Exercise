package utils;

import com.fasterxml.jackson.databind.ObjectMapper;
import core.UserData;

import java.io.InputStream;

public class JsonFileParser {

    public static final String JSON_FILE = "UserData.json";

    public static UserData getData() {

        try (InputStream input = Thread.currentThread().getContextClassLoader().getResourceAsStream(JSON_FILE)) {
            ObjectMapper objectMapper = new ObjectMapper();
            return objectMapper.readValue(input, UserData.class);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {

        System.out.println(getData().getFirstName());
    }

}