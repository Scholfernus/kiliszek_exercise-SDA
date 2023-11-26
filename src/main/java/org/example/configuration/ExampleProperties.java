package org.example.configuration;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Data
@Component
@ConfigurationProperties(prefix = "test.example", ignoreUnknownFields = false)
public class ExampleProperties {
    private String first;
    private int second;
    private List<String>names;
    private Map<String,String> customAttributes;
}
