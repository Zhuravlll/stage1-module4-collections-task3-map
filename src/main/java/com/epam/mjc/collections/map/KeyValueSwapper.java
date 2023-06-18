package com.epam.mjc.collections.map;

import java.util.LinkedHashMap;
import java.util.Map;

public class KeyValueSwapper {
    public Map<String, Integer> swap(Map<Integer, String> sourceMap) {
        Map <String, Integer> myMap = new LinkedHashMap<>();
        for (Map.Entry<Integer, String> entry: sourceMap.entrySet()) {
            myMap.putIfAbsent(entry.getValue(), entry.getKey());
            if (myMap.containsKey(entry.getValue()) && myMap.get(entry.getValue()) > entry.getKey()) {
                myMap.replace(entry.getValue(), entry.getKey());
            }
        }
        return myMap;
    }
}
