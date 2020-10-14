/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alexandrulazar.kata2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 *
 * @author Alexandru
 */
public class Main {
    public static void main(String[] args) {
        int[] data = {1,2,14,4,5,6,3,8,9,4,1,2,3,14,5};
        
        Map<Integer, Integer> histogram = new HashMap<Integer, Integer>();
        
        for (int i = 0; i < data.length; i++) {
            if (histogram.containsKey(data[i])) {
                histogram.put(data[i], histogram.get(data[i])+1);
            } else {
                histogram.put(data[i], 1);
            }
            
        }
        
        for (Integer key : histogram.keySet()) {
            System.out.println(key + "==>" + histogram.get(key));
        }
    }
}
