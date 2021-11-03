package com.intercorp.pinapper.controller.request;

import lombok.Builder;
import lombok.Data;

import javax.validation.constraints.NotNull;

@Builder
@Data
public class PinapperRequest {

    @NotNull(message = "El campo id no puede ser null.")
    private Long id;

    private String name;

    private String lastName;

}
