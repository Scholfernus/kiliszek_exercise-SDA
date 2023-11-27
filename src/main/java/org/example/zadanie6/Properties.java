package org.example.zadanie6;

import lombok.Data;
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
public class Properties {

    @Email
    private String email;
    private String firstName;
    @Size(min = 3, max = 20)
    private String lastName;
    @Pattern(regexp = "\\w+ \\d")
    private String address;
    @Min(value = 18)
    private int age;
    @NotEmpty
    private List<String> value;
    @NotEmpty
    private Map<String, String> customAttributes;

    /*można użyć asercji, która będzie nam sprawdzać poprawność adresu lub skorzystać z adnotacji nad polem address*/
    @AssertTrue
    public boolean isCorrectAddress() {
        return address != null && address.split(" ").length == 2;
    }

}
