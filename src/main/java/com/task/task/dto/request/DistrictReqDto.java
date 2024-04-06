package com.task.task.dto.request;

import com.task.task.entity.StateEntity;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DistrictReqDto {

    private Long id;

    @NotNull
    private String districtName;

    private StateEntity state;
}
