package com.project.kall.controller;

import com.project.kall.service.MileageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/mypate/mileage")
public class MileageController {

    @Autowired
    MileageService mileageService;

//    @GetMapping("/{userId}")
//    public String[] mileageList(@PathVariable String id) {
//        return mileageService.List(id);
//    }


}
