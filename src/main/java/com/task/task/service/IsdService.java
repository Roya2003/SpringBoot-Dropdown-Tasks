package com.task.task.service;

import com.task.task.dto.request.IsdNoDto;
import com.task.task.entity.ISDEntity;
import org.springframework.http.ResponseEntity;

public interface IsdService {

    ResponseEntity<?> getISdDropdown();

    ResponseEntity<?>save(IsdNoDto isdNoDto);
}
