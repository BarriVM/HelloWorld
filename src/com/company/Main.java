package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) throws IOException {

        String str = "mama mila ramu ramu mila mama rima mama";
        String[] words = str.split(" ");


        Map<String, Integer> freqMap = new HashMap<>();
        for (String word:words) {
            if (!freqMap.containsKey(word))
                freqMap.put(word, 1);
            else freqMap.put(word, freqMap.get(word)+1);
        }
        System.out.println(freqMap);
        System.out.println(freqMap.keySet());
    }
}
