package com.example.loremIpsum.repository;


import de.svenjacobs.loremipsum.LoremIpsum;
import org.springframework.stereotype.Component;

@Component

public class LoremIpsumGeneratorDao implements loremIpsumGenerator {
   private LoremIpsum loremIpsum = new LoremIpsum();

    @Override
    public String generateParagraphs(int number) {

        return loremIpsum.getParagraphs(number);
    }

    @Override
    public String generateSentence(int number) {
        return loremIpsum.getWords(15);
    }

    @Override
    public String generateWords(int number) {
        return loremIpsum.getWords(number);
    }
}
