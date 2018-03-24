package com.xyly.controller;

import com.xyly.entity.ScenicEntity;
import com.xyly.service.ScenicServieImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by daichao on 2018/1/17.
 */
@Controller
@RequestMapping("/scenic")
public class ScenicController {

    @Autowired
    ScenicServieImpl scenicServie;
@RequestMapping("/save")
    public ScenicEntity save(@RequestBody ScenicEntity scenicEntity){
        return scenicServie.save(scenicEntity);

    }
    @RequestMapping("/scenic")
    public String index(@RequestBody ScenicEntity scenicEntity){
        return "scenic";
    }

}
