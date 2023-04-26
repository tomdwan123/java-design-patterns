package com.phucdevs.structural.adapter;

public class AdapterClient {

    public static void main(String[] args) {
        VietnameseTarget client = new AdapterTranslate(new JapaneseAdaptee());
        client.send("Xin chào!");
    }
}

interface VietnameseTarget {
    void send(String words);
}

class AdapterTranslate implements VietnameseTarget {

    private JapaneseAdaptee japaneseAdaptee;

    public AdapterTranslate(JapaneseAdaptee japaneseAdaptee) {
        this.japaneseAdaptee = japaneseAdaptee;
    }

    @Override
    public void send(String words) {

        System.out.println("Read words ....");
        System.out.println(words);
        String translateJapanese = translale(words);
        System.out.println("Send words ....");
        japaneseAdaptee.receive(translateJapanese);
    }

    private String translale(String words) {
        System.out.println("Translated!");
        return "こんにちは";
    }
}

class JapaneseAdaptee {
    public void receive(String words) {
        System.out.println("Retrieving words from Adapter ...");
        System.out.println(words);
    }
}
