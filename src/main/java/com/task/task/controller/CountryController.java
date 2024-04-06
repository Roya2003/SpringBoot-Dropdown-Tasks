package com.task.task.controller;

import com.task.task.dto.request.CountryRequestDto;
import com.task.task.service.CountryService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/country")
public class CountryController {
    @Autowired
    private CountryService countryService;

    @GetMapping("/getcountry")
    public ResponseEntity<?> getCountry(){
        return countryService.getCountryDropdown();
    }

    @PostMapping("/saveCountry")
    public ResponseEntity<?> saveCountry( @Valid @RequestBody CountryRequestDto countryRequestDto){
        return countryService.saveCountry(countryRequestDto);
    }
}
