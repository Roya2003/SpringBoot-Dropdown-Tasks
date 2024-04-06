package com.task.task.dto.request;

import com.task.task.entity.TalukaEntity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CityReqDto {

    private Long id;

    private String cityName;

    private TalukaEntity taluka;
}
