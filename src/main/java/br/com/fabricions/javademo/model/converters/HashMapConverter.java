package br.com.fabricions.javademo.model.converters;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import javax.persistence.AttributeConverter;
import java.io.IOException;
import java.util.Map;

public class HashMapConverter implements AttributeConverter<Map<String, Object>, String> {

    ObjectMapper objectMapper = new ObjectMapper();

    public String convertToDatabaseColumn(Map<String, Object> model) {
        String modelJson = null;
        try {
          modelJson = objectMapper.writeValueAsString(model);
        } catch (final JsonProcessingException e) {
            e.printStackTrace();
        }
        return modelJson;
    }

    public Map<String, Object> convertToEntityAttribute(String modelJson) {
        Map<String, Object> model = null;
        try {
            model = objectMapper.readValue(modelJson, Map.class);
        } catch (final IOException e) {
            e.printStackTrace();
        }
        return model;
    }
}
