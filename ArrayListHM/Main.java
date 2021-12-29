package com.company;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();  // 2, 67, 201, 0     --->  0, 201, 67, 2
        arrayList.add(2);
        arrayList.add(67);
        arrayList.add(201);
        arrayList.add(0);

        Iterator<Integer> it = arrayList.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        System.out.println("====================");

        ArrayList<Integer> reAList = reverse(arrayList);
        System.out.println(reAList);

       /* Iterator<Integer> itRAList = reAList.iterator();
        while(itRAList.hasNext()){
            System.out.println(itRAList.next());
        }*/

    }
    public static ArrayList<Integer> reverse(ArrayList<Integer> alist){

        ArrayList<Integer> reverseArrayList  = new ArrayList<>();
        for(int i = alist.size() - 1 ; i >=  0 ;  i--  ){   /// 2, 67, 201, 0
            reverseArrayList.add(alist.get(i));
        }
        return reverseArrayList;
    }
}
