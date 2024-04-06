package com.task.task.controller;

import com.task.task.dto.request.MaritalDto;
import com.task.task.service.MaritalStatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/maritalstatus/api")

public class MaritalStatusController {

    @Autowired
    private MaritalStatusService maritalStatusService;

    @GetMapping("/getmarital")
    public ResponseEntity<?> getMaritalStatusDropdown(){
        return maritalStatusService.getMaritalStatusDropdown();
    }
    @PostMapping("/postmarital")
  public ResponseEntity<?> saveMarital(@RequestBody MaritalDto maritalDto){
       return maritalStatusService.saveMarital(maritalDto);
    }

}
