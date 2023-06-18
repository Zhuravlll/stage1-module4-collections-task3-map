package com.epam.mjc.collections.map;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class FunctionValueFinder {
    public boolean isFunctionValuePresent(List<Integer> sourceList, int requiredValue) {
        Map<Integer, Integer> functionMap = calculateFunctionMap(sourceList);
        return functionMap.containsValue(requiredValue);
    }

    private Map<Integer, Integer> calculateFunctionMap(List<Integer> sourceList) {
        Map<Integer, Integer> myMap = new LinkedHashMap<>();
        for (Integer e : sourceList) {
            myMap.put(e, 5 * e + 2);
        }
        return myMap;
    }
}
