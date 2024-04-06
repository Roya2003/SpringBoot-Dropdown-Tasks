package com.task.task.controller;

import com.task.task.dto.request.PrefixReqDto;
import com.task.task.entity.HeadingEntity;
import com.task.task.entity.PrefixEntity;
import com.task.task.service.PrefixService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/prefix")
public class PrefixController {

    @Autowired
    private PrefixService prefixService;
    
    @GetMapping("/prefx")
    public ResponseEntity<?> getprefix(){
        return prefixService.getPreficDropdown();
    }

    @PostMapping("/savePrefix")
       public ResponseEntity<?> savePrefix(@Valid @RequestBody PrefixReqDto prefixReqDto){
        return prefixService.save(prefixReqDto);
 }


}
