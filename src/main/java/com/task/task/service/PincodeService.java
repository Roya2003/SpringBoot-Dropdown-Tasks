package com.task.task.service;

import com.task.task.dto.request.PinReqDto;
import com.task.task.entity.PincodeEntity;
import org.springframework.http.ResponseEntity;

public interface PincodeService {

    ResponseEntity<?> getPincode(Long pinCode);

    ResponseEntity<?>getAllPincode();

    ResponseEntity<?> savePin (PinReqDto pinReqDto);



}

