package com.company;

import java.util.HashMap;
import java.util.Map;

public class Hashing {
    public static void main(String[] args) {
        HashMap<String,Integer> h=new HashMap<>();
        h.put("gfg",10);
        h.put("ide",15);
        h.put("course",20);
        System.out.println(h);
        System.out.println(h.size());
        for(Map.Entry<String,Integer>el:h.entrySet())//printing key value pairs
            System.out.print(el.getKey()+" "+el.getValue()+" ");
        System.out.println("");
        for(String el:h.keySet())//for printing key
            System.out.println(el);
        for(Integer el:h.values()) //for printing values
            System.out.println(el);
        h.remove("gfg",10);
        if(h.containsKey("gfg"))
            System.out.println("yes");
        else
            System.out.println("no");
        System.out.println(h.get("gfg"));
        System.out.println(h.get("ide"));
    }
}
