package com.task.task.service;

import com.task.task.dto.request.NationalityReqDto;
import com.task.task.entity.NationalityEntity;
import org.springframework.http.ResponseEntity;

public interface NationalityService {

    ResponseEntity<?> getNationalityDropdown();

    ResponseEntity<?> saveNationality(NationalityReqDto nationalityReqDto);
}