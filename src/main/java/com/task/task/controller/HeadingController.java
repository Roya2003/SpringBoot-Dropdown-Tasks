package com.task.task.controller;

import com.task.task.entity.HeadingEntity;
import com.task.task.service.HeadingService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/request/map")
public class HeadingController {

    @Autowired
    private HeadingService headingService;

    @GetMapping("/get")
   public List<HeadingEntity> findAll(){
       return headingService.findAll();
   }

    @PostMapping("/post")
    public HeadingEntity save(@Valid @RequestBody HeadingEntity headingEntity) {
        return headingService.save(headingEntity);
    }
   @PutMapping("/put")
   public HeadingEntity update(@RequestBody HeadingEntity headingEntity){
        return headingService.update(headingEntity);
   }

   @DeleteMapping("{id}")
   public void delete(@PathVariable("id")Long id){
        headingService.delete(id);

   }


}
