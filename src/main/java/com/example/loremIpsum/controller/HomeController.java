package com.example.loremIpsum.controller;

import com.example.loremIpsum.repository.LoremIpsumGeneratorDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
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
    public String result(@RequestParam String type, int number) {
        switch (type) {
            case "paragraph":
                loremIpsumGeneratorDao.generateParagraphs(number);
                break;
            case "words":
                loremIpsumGeneratorDao.generateWords(number);
                break;
            case "sentenses":
                loremIpsumGeneratorDao.generateSentence(number);
                break;
        }
        return "result";

    }
}