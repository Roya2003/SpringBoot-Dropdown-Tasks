package com.task.task.service;

import com.task.task.dto.request.TalukaRequestDto;
import com.task.task.entity.TalukaEntity;
import org.springframework.http.ResponseEntity;

public interface TalukaService {
    ResponseEntity<?> getTalukaDropdown(Long districtId);
    ResponseEntity<?> saveTaluka(TalukaRequestDto talukaRequestDto);

}
