package com.intercorp.pinapper.service;

import com.intercorp.pinapper.controller.request.PinapperRequest;
import com.intercorp.pinapper.domain.Pinapper;
import com.intercorp.pinapper.domain.PinapperMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PinapperService {

    @Autowired
    private PinapperMapper pinapperMapper;

    @Qualifier("pinappers")
    @Autowired
    private List<Pinapper> pinappers;

    public Pinapper getPinapper(){
        return Pinapper.builder().id(1L).name("Rodolfo").lastName("Aguirre").build();
    }

    public List<Pinapper> getPinappers(){
        return pinappers;
    }

    public Pinapper createPinapper(PinapperRequest request){
        return pinapperMapper.apply(request);
    }


}
