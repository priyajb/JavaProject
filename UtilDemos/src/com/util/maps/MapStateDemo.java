package com.util.maps;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapStateDemo {
    public static void main(String[] args) {
        Map<String, List<String>> stateMap = new HashMap<>();
        stateMap.put("karnataka", Arrays.asList("bangalore", "davangere", "gulbarga"));
        stateMap.put("tamilnadu", Arrays.asList("chennai", "vellur", "selum"));
        stateMap.put("kerala", Arrays.asList("kochi", "kannur", "kollam"));
        stateMap.put("delhi", Arrays.asList("karawal nagar", "madhu vihar", "firozabad"));

     //   System.out.println(stateMap);
        System.out.println(stateMap.get("karnataka"));
        System.out.println(stateMap.get("tamilnadu"));
        System.out.println(stateMap.get("kerala"));
        System.out.println(stateMap.get("delhi"));


        for(Map.Entry<String,List<String>> stateentries:stateMap.entrySet()) {
            System.out.println(stateentries.getKey());
            List<String> cities = stateentries.getValue();
            for (String city : cities) {
                System.out.println(city);
            }
        }
        System.out.println(".......................");
           for(String stateName:stateMap.keySet()){
               System.out.println("state:"+stateName);
               List<String> cities1=stateMap.get(stateName);
               for(String city:cities1)
               {
                   System.out.println(city);
               }
           }
        }

    }

