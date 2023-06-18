package com.epam.mjc.collections.map;

import java.util.*;

public class WordRepetitionMapCreator {
    public Map<String, Integer> createWordRepetitionMap(String sentence) {
        Map<String, Integer> myMap = new LinkedHashMap<>();
        List<String> tempList = new ArrayList<>();
        String tempString = sentence.replace(",", "");
        StringTokenizer str = new StringTokenizer(tempString);
        Integer value = 1;
        while (str.hasMoreElements()) {
            tempList.add(str.nextToken().toLowerCase(Locale.ENGLISH).replace(".", ""));
        }
        for (String e :
                tempList) {
            if (myMap.containsKey(e)) {
                myMap.replace(e, value+1);
            }
            myMap.putIfAbsent(e, value);
        }
        return myMap;
    }
}
