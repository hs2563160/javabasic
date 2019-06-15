package com.interview.javabasic.paixun;

public class BubbleSort {

    public static void sort(int[] attr){

        for(int i= 0;i<attr.length-1;i++){

            for (int j =0;j<attr.length-1-i;j++){

                if(attr[j]>attr[j+1]){
                    int temp = attr[j];
                    attr[j]=attr[j+1];
                    attr[j+1]=temp;
                }
            }

        }

    }

    public static void main(String[] args) {
        int attr[]={2,3,1,8,6,9,23,12,11,3};
        sort(attr);
        for (int a:attr){
            System.out.println(a);
        }
    }
}
