package com.example.loremIpsum.controller;

import com.example.loremIpsum.repository.LoremIpsumGeneratorDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

    @Autowired
    private LoremIpsumGeneratorDao loremIpsumGeneratorDao;

    @GetMapping("/")
    public String form() {
        return "lorem";
    }


    @GetMapping("/result")
    public String result(@RequestParam String type, int number, ModelMap modelMap) {
        switch (type) {
            case "Paragraphs":
               modelMap.put("result",loremIpsumGeneratorDao.generateParagraphs(number));
                break;
            case "Words":
                modelMap.put("result",loremIpsumGeneratorDao.generateWords(number));
                break;
            case "Sentences":
               modelMap.put("result",loremIpsumGeneratorDao.generateSentence(number));
                break;
        }
        return "result";

    }

}
