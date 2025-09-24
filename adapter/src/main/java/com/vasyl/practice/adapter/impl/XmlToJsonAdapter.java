package com.vasyl.practice.adapter.impl;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.vasyl.practice.adapter.Adapter;
import java.util.Map;

public class XmlToJsonAdapter implements Adapter<String, String> {

    private final XmlMapper xmlMapper = new XmlMapper();
    private final ObjectMapper objectMapper = new ObjectMapper();

    @Override
    public String adapt(String input) throws Exception {
        Map<String, Object> response = xmlMapper.readValue(input, new TypeReference<>() {
        });

        return objectMapper.writeValueAsString(response);
    }
}
