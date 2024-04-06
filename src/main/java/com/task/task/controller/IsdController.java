package com.task.task.controller;

import com.task.task.dto.request.IsdNoDto;
import com.task.task.entity.ISDEntity;
import com.task.task.service.IsdService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/isd/api")
public class IsdController {
    @Autowired
    private IsdService isdService;

    @GetMapping("/getisd")
    ResponseEntity<?> getIsd (){
        return isdService.getISdDropdown();
    }

    @PostMapping("SaveIsd")
    public ResponseEntity<?>saveIsd (@Valid @RequestBody IsdNoDto isdNoDto){
        return isdService.save(isdNoDto);
    }


}
