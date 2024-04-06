package com.task.task.dto.request;

import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CountryRequestDto {

    private Long Id;
    private String countryName;

}
