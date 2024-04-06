package com.task.task.service;

import com.task.task.dto.request.CountryRequestDto;
import com.task.task.entity.CountryEntity;
import org.springframework.http.ResponseEntity;

public interface CountryService {
    ResponseEntity<?> getCountryDropdown();

    CountryEntity save (CountryEntity countryEntity);

    ResponseEntity<?> saveCountry(CountryRequestDto countryRequestDto);


}
