package com;


import java.util.LinkedHashMap;
import java.util.Map;

public class LRU extends LinkedHashMap{
    static final int size = 5;
    static final float load = .75f;
    public static void main(String[] args) {
        Map<String,String> map = new LinkedHashMap<String, String>(size,load,true){

            @Override
            protected boolean removeEldestEntry(Map.Entry<String, String> eldest) {
                boolean toobig = size() > size;
                return toobig;
            }
        };

        map.put("1","1");
        map.put("2","2");
        map.put("3","3");
        map.put("4","4");
        map.put("5","5");
        map.put("6","6");
        map.get("5");
        for (Map.Entry<String, String> e :map.entrySet()
        ) {
            System.out.println(e.getKey() + "  " + e.getValue());
        }
    }
}
