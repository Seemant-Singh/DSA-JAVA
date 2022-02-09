package com.company;
import java.util.HashSet;
import java.util.Iterator;

public class Hash {
    public static void main(String[] args) {
        HashSet<String> h=new HashSet<String>();
        h.add("cool");
        h.add("seemant");
        h.add("singh");
        System.out.println(h);
        System.out.println(h.contains("singh"));
        Iterator<String> i= h.iterator();
        while(i.hasNext()){
            System.out.print(i.next()+" ");
        }
        System.out.println(" ");
        System.out.println(h.size());
        h.remove("singh");
        System.out.println(h);
        for(String el:h){
            System.out.print(el+" ");
        }
    }
}
