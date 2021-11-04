package com.intercorp.pinapper.service.impl;

import com.intercorp.pinapper.controller.request.PinapperRequest;
import com.intercorp.pinapper.domain.Pinapper;
import com.intercorp.pinapper.domain.PinapperMapper;
import com.intercorp.pinapper.exceptions.PinapperExistException;
import com.intercorp.pinapper.exceptions.PinapperNotExistException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Slf4j
@Service
public class PinapperService {

    @Autowired
    private PinapperMapper pinapperMapper;

    private Map<Long, Pinapper> pinapperMap = new HashMap<>();

    @Qualifier("pinappers")
    @Autowired
    private List<Pinapper> pinappers;

    public Pinapper getPinapper(Long id) {
        return pinapperMap.get(id);
    }

    public Pinapper deletePinapper(Long id) {
        return pinapperMap.remove(id);
    }

    public Pinapper editPinapper(PinapperRequest request, Long id) {
        Pinapper pinapper = null;
        if (pinapperMap.get(id) != null) {
            pinapper = pinapperMapper.apply(request);
            pinapperMap.remove(request.getId());
            pinapperMap.put(request.getId(), pinapper);
        } else {
            log.error("El Pinnaper NO existe");
            throw new PinapperNotExistException("El Pinnaper NO existe");
        }
        return pinapper;
    }


    public List<Pinapper> getPinappers() {
        return (List<Pinapper>) pinapperMap.values();
    }

    public Pinapper createPinapper(PinapperRequest request) {
        Pinapper pinapper = pinapperMapper.apply(request);
        if (pinapperMap.get(request.getId()) == null) {
            pinapperMap.put(request.getId(), pinapperMapper.apply(request));
        } else {
            log.error("El Pinnaper ya existe");
            throw new PinapperExistException("El Pinnaper ya existe");
        }
        return pinapper;
    }


}
