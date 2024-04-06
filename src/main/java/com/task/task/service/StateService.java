package com.task.task.service;

import com.task.task.dto.request.StateReqDto;
import org.springframework.http.ResponseEntity;

public interface
StateService {
    ResponseEntity<?> getStateDropdown(Long countryId);

    ResponseEntity<?> saveState(StateReqDto stateReqDto);

    ResponseEntity<?> getAllstate();



}
