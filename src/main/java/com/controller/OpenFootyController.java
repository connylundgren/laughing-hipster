package com.controller;

import com.service.FootyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by jonas on 2014-11-14.
 */
@RestController
public class OpenFootyController {

    @Autowired
    private FootyService footyService;

     @RequestMapping("/footy")
    public String test(){
        return footyService.test();
    }
}
