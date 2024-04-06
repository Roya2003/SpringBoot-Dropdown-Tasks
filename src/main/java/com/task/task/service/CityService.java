package com.task.task.service;

import com.task.task.dto.request.CityReqDto;
import com.task.task.entity.CityEntity;
import org.springframework.http.ResponseEntity;

public interface CityService {

     ResponseEntity<?> getCityDropdown(Long talukaId) ;

    ResponseEntity<?> getCity(CityReqDto cityReqDto);
}
