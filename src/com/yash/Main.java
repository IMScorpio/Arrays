package com.yash;

import java.util.ArrayList;

class Main{
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(500);
        list.add(500);
        list.add(500);
        list.add(500);
        list.add(500);
        list.add(500);
        list.add(500);
        list.add(500);

        System.out.println(list);

        for(int i = 0; i < 5; i++){
            System.out.println(list.get(i));
        }

    }
}