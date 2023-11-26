package org.example.zadanie6;

import lombok.Data;
import lombok.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@Data
@Component
@Configuration
@ConfigurationProperties(prefix = "pl.sdacademy.zad6")
@Validated
public class ExampleValidation {

    @Email
    private String email;

    private String firstName;
    @Size(min=3,max = 20)
    private String lastName;
    private String address;
    @Min(value = 18)
    private int age;
    @NotEmpty
    private List<String> values;
    @NotEmpty
    private Map<String,String> customAttributes;

    @AssertTrue(message = "one field id empty")
    public boolean isNotEmpty() {
        return Objects.nonNull(firstName) && Objects.nonNull(email);
    }
}
