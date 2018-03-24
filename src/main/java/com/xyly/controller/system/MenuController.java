package com.xyly.controller.system;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by daichao on 2018/3/13.
 */
public class MenuController {
    @RequestMapping("/menu")
    public String getMenu(Model model) {
        model.addAttribute("menu","menu");
        return "xyly/menu";
    }
}
