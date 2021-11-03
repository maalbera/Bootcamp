package com.intercorp.pinapper.controller;


import com.intercorp.pinapper.controller.request.PinapperRequest;
import com.intercorp.pinapper.domain.Pinapper;
import com.intercorp.pinapper.service.PinapperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/pinapp")
public class PinaperController {

    @Autowired
    private PinapperService pinapperService;

    @GetMapping(path = "/}")
    public Long retrivePinnaper(@PathVariable Long id){
        return id;
    }

    @GetMapping(path = "/pinappers/")
    public List<Pinapper> retrivePinnapers(){
        return pinapperService.getPinappers();
    }

    @PostMapping(path = "/pinapper")
    public Pinapper createPinnaper(@Validated @RequestBody PinapperRequest request){
        return pinapperService.createPinapper(request);
    }





}
