package com.task.task.dto.request;

import com.task.task.entity.CityEntity;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PinReqDto {

    @NotNull
    private Long pinCode;

    private CityEntity city;
}
