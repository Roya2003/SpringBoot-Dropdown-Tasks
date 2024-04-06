package com.task.task.controller;

import com.task.task.dto.request.IdentificationDto;
import com.task.task.service.IdentificationDocService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/identification/api")
public class IdentificationDocController {

    @Autowired
    private IdentificationDocService identificationDocService;

    @GetMapping("/getidenti")
    public ResponseEntity<?> getIdentificationDoc(){
        return identificationDocService.getIdentificationDoc();

    }
    @PostMapping("/postidenti")
    public ResponseEntity<?> save (@Valid @RequestBody IdentificationDto identificationDto){
        return identificationDocService.SaveIdentification(identificationDto);
    }

}
