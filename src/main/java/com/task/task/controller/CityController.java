package com.task.task.controller;

import com.task.task.dto.request.CityReqDto;
import com.task.task.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/city")

public class CityController {

    @Autowired
    private CityService cityService;

    @GetMapping("/getCity/{talukaId}")
    public ResponseEntity<?>getCity(@PathVariable Long talukaId) {
        return cityService.getCityDropdown(talukaId);
    }

    @PostMapping("/saveCity")
    public ResponseEntity<?> saveCity(@RequestBody CityReqDto cityReqDto){
        return cityService.getCity(cityReqDto);
    }

}
