package com.task.task.controller;

import com.task.task.dto.request.NationalityReqDto;
import com.task.task.entity.NationalityEntity;
import com.task.task.service.NationalityService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/nation/api")
public class NationalityController {

    @Autowired
    private NationalityService nationalityService;

    @GetMapping("/getnationality")
    public ResponseEntity<?> getNationalityDropdown() {
        return nationalityService.getNationalityDropdown();
    }

    @PostMapping("/postnationality")
    public ResponseEntity<?> savenationality(@Valid @RequestBody NationalityReqDto nationalityReqDto) {
        return nationalityService.saveNationality(nationalityReqDto);
    }

}