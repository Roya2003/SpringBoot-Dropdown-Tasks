package com.task.task.controller;

import com.task.task.dto.request.TalukaRequestDto;
import com.task.task.entity.TalukaEntity;
import com.task.task.service.TalukaService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/taluka")
public class TalukaController {
@Autowired
    private TalukaService talukaService;

    @GetMapping("/getTaluka/{districtId}")
    public ResponseEntity<?> getTalukaDropdown(@PathVariable Long districtId){
       return talukaService.getTalukaDropdown(districtId);
    }

    @PostMapping("/saveTaluka")
    public ResponseEntity<?> getTaluka(@Valid @RequestBody TalukaRequestDto talukaRequestDto){
        return talukaService.saveTaluka(talukaRequestDto);
    }

}
