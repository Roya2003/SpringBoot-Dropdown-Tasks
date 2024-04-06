package com.task.task.service;

import com.task.task.dto.request.PrefixReqDto;
import com.task.task.entity.PrefixEntity;
import org.springframework.http.ResponseEntity;

public interface PrefixService {
    ResponseEntity<?> getPreficDropdown();
    ResponseEntity<?> save(PrefixReqDto prefixReqDto);

}
