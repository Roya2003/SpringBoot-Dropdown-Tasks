package com.task.task.dto.request;

import com.task.task.entity.CountryEntity;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class StateReqDto {

    private Long Id;

    @NotNull
    private String stateName;

    private CountryEntity country;

}
