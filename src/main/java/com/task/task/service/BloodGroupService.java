package com.task.task.service;

import com.task.task.dto.request.BloodGroupDto;
import org.springframework.http.ResponseEntity;

public interface BloodGroupService {

    ResponseEntity<?> getBloodGroupDropdown();
    ResponseEntity<?> saveBloodGroup(BloodGroupDto bloodGroupDto);

 }
