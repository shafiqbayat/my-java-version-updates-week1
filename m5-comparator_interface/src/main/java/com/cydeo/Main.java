package com.cydeo;


import java.util.*;

public class Main {

    public static void main(String[] args) {


        List<Integer> list = Arrays.asList(10, 20, 50, 4, 22, 31);

        Collections.sort(list);

        System.out.println(list);

        Collections.sort(list, new MyComparator());
        System.out.println(list);

        Collections.sort(list, ((o1, o2) -> (o1 > o2) ? -1 : (o1 < o2) ? 1 : 0));


    }
}
