package com.intercorp.pinapper.controller;


import com.intercorp.pinapper.controller.request.PinapperRequest;
import com.intercorp.pinapper.domain.Pinapper;
import com.intercorp.pinapper.service.impl.PinapperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/pinapper")
public class PinaperController {

    @Autowired
    private PinapperService pinapperService;

    @GetMapping(path = "/{id}")
    public Pinapper retrivePinnaper(@PathVariable("id") Long id) {
        return pinapperService.getPinapper(id);
    }

    @GetMapping(path = "/")
    public List<Pinapper> retrivePinnapers() {
        return pinapperService.getPinappers();
    }

    @PostMapping(path = "/")
    public Pinapper createPinnaper(@Validated @RequestBody PinapperRequest request) {
        return pinapperService.createPinapper(request);
    }

    @PutMapping(path = "/{id}")
    public Pinapper editPinnaper(@Validated @RequestBody PinapperRequest request, @PathVariable("id") Long id) {
        return pinapperService.editPinapper(request, id);
    }

    @DeleteMapping(path = "/{id}")
    public Pinapper deletePinnaper(@PathVariable("id") Long id) {
        return pinapperService.deletePinapper(id);
    }


}
