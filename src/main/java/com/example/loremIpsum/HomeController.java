package com.example.loremIpsum;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {


    @GetMapping("/")
    public String add(ModelMap modelMap) {
        return "lorem";
    }
        @GetMapping("/result")
            public String result (ModelMap modelMap){
                return "result";
        }
    }

