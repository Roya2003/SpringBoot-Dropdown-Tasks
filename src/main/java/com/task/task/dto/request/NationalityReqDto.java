package com.task.task.dto.request;

import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class NationalityReqDto {

    @NotNull
    private String Nationality;
}
