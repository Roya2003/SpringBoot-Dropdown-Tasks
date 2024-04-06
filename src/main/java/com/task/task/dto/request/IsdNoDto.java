package com.task.task.dto.request;

import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class IsdNoDto {

    @NotNull
    private Long IsdNo;
}
