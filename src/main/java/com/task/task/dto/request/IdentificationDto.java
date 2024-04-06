package com.task.task.dto.request;

import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class IdentificationDto {
    @NotNull
    private String IdentificationName;
}
