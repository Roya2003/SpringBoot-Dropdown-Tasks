package com.task.task.dto.request;

import com.task.task.entity.DistrictEntity;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TalukaRequestDto {

    private Long id;

    @NotNull
    private String talukaName;

    private DistrictEntity district;

}
