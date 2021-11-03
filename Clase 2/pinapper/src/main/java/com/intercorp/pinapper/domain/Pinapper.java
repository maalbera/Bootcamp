package com.intercorp.pinapper.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class Pinapper {

    private Long id;
    private String name;
    private String lastName;

}
