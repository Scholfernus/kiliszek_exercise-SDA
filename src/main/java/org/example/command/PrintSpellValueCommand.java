package org.example.command;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Map;

@Slf4j
@Component
public class PrintSpellValueCommand implements CommandLineRunner {

    @Value("#{systemProperties['priority']}")
    private String spellValue;

    @Value("#{systemProperties['unknown'] ?: 'some default'}")
    private String spellSomeDefault;

    @Value("#{number.number}")
    private Integer someBeanValue;

    @Value("#{${valuesMap}}")
    private Map<String, Integer> valuesMap;

    // nie ma klucza to null
    @Value("#{${valuesMap}.key1}")
    private Integer valuesMapKey1;

    //null jak nie ma klucza
    @Value("#{${valuesMap}['unknownKey']}")
    private Integer unknownMapKey;

    //od razu mapa
    @Value("#{${unknownKey : {key1: '1231231', key2: '241241'}}}")
    private Map<String, Integer> unknownMap;

    //nie ma klucza to 5
    @Value("#{${valuesMap}['unknownKey'] ?: 5}")
    private Integer unknownMapKeyWithDefaultValue;

    //filtrowanie > od 1
    @Value("#{${valuesMap}.?[value>'1']}")
    private Map<String, Integer> valuesMapFiltered;

    //wszystkie zmienne srodowiskowe
    @Value("#{systemProperties}")
    private Map<String, String> systemPropertiesMap;

    @Override
    public void run(String... args) throws Exception {
        log.info("Injected first: {}", spellValue);
        log.info("Injected second: {}", spellSomeDefault);
        log.info("Injected third: {}", someBeanValue);
        log.info("Injected fourth: {}", valuesMap);
        log.info("Injected five: {}", valuesMapKey1);
        log.info("Injected siz: {}", unknownMapKey);
        log.info("Injected seven: {}", unknownMap);
        log.info("Injected eight: {}", unknownMapKeyWithDefaultValue);
        log.info("Injected: {}", valuesMapFiltered);
        log.info("Injected: {}", systemPropertiesMap);
    }
}
