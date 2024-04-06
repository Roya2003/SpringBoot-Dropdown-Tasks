package com.task.task.service;

import com.task.task.dto.request.MaritalDto;
import com.task.task.entity.MaritalSEntity;
import org.springframework.http.ResponseEntity;

public interface MaritalStatusService {

    ResponseEntity<?> getMaritalStatusDropdown();

    ResponseEntity<?> saveMarital(MaritalDto maritalDto);

}
