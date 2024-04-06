package com.task.task.service;

import com.task.task.dto.request.IdentificationDto;
import com.task.task.entity.IdentificationDEntity;
import org.springframework.http.ResponseEntity;

public interface IdentificationDocService {

    ResponseEntity<?> getIdentificationDoc();

    ResponseEntity<?>SaveIdentification(IdentificationDto identificationDto);
}
