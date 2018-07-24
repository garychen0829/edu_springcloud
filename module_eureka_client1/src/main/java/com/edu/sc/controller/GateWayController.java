package com.edu.sc.controller;

import com.alibaba.druid.support.json.JSONUtils;
import com.edu.sc.service.GateWayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by garychen on 2018/4/19.
 */
@RestController(value = "/ry")
public class GateWayController {

    @Autowired
    private GateWayService gateWayService;

    @RequestMapping(value = "/hi", method = RequestMethod.POST)
    public String sayHi(HttpServletRequest request){
        System.out.println(request);
        System.out.println("sayHi()");
        return gateWayService.hello("chenh");
    }

//    @RequestMapping(value = "/getToken", method = RequestMethod.POST)
//    public String getToken(HttpServletRequest request){
//        System.out.println(request);
//        System.out.println("getToken()");
//        return gateWayService.hello("chenh getToken");
//    }

    @RequestMapping(value = "/getBatches", method = RequestMethod.POST)
    public String getBatches(HttpServletRequest request){
        System.out.println(request);
        System.out.println("getBatches()");
        Map map = new HashMap();
        map.put("aa","sdsds");
        return JSONUtils.toJSONString(map);
    }


}
