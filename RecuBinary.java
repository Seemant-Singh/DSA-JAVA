package com.company;

public class RecuBinary {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,55,67,98};
        int tar=9;
        System.out.println(BS(arr,tar,0,arr.length-1));
    }
    static int BS(int[] arr,int tar,int s,int e){
        int m=s+(e-s)/2;
        if(s>e)return -1;
        if(tar==arr[m])return m;
        if(tar<arr[m])return BS(arr,tar,s,m-1);
        return BS(arr,tar,m+1,e);
    }
}
