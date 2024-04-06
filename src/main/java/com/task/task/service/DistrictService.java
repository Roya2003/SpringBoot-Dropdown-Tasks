package com.task.task.service;

import com.task.task.dto.request.DistrictReqDto;
import com.task.task.entity.DistrictEntity;
import org.springframework.http.ResponseEntity;

public interface DistrictService {

    ResponseEntity<?> getDistrictDropdown(Long stateId) ;

    ResponseEntity<?> getDistrict(DistrictReqDto districtReqDto);
}

