package com.edu.sc.service;

import org.springframework.stereotype.Service;

/**
 * Created by garychen on 2018/4/19.
 */
@Service
public class GateWayServiceImpl implements GateWayService {

    @Override
    public String hello(String name) {
        return "GateWay hello: " + name;
    }
}
