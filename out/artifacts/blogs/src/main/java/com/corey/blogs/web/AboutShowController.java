package com.corey.blogs.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by corey on 2021/4/30
 **/
@Controller
public class AboutShowController {

    @GetMapping("/about")
    public String about(Model model) {
        return "about";
    }
}
