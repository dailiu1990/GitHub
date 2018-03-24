package com.xyly.controller.system;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by daichao on 2018/3/13.
 */
@Controller
public class BlacklistController {
    @RequestMapping("/blacklist")
    public String getBlacklist(Model model) {
        model.addAttribute("menu","menu");
        return "xyly/blacklist";
    }
}
