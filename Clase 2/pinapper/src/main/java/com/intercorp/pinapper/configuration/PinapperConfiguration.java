package com.intercorp.pinapper.configuration;

import com.intercorp.pinapper.domain.Pinapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;
import java.util.List;

@Configuration
public class PinapperConfiguration {

    @Bean(name = "pinappers")
    public List<Pinapper> getPinnapers(){
        return Arrays.asList(Pinapper.builder().id(2L).name("Maria").lastName("Gomez").build(),Pinapper.builder().id(4L).name("Agustin").lastName("Diaz").build(),Pinapper.builder().id(3L).name("Miguel").lastName("Perez").build());
    }

}
