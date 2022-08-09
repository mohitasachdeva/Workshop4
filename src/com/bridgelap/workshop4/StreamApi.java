package com.bridgelap.workshop4;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamApi {
    public static void main(String[] args) {
        List<Integer>list1 = new ArrayList<>();
        list1.add(20);
        list1.add(15);
        list1.add(30);
        list1.add(35);
        list1.add(40);
        list1.add(45);
        System.out.println(list1);

        List<Integer> newlist = list1.stream().filter(i->i%2 ==0).collect(Collectors.toList());
        System.out.println(newlist);
        List<Integer> list2= list1.stream().map(x->x*x+2).collect(Collectors.toList());
        System.out.println(list2);
        List<Integer> list3= list1.stream().sorted().collect(Collectors.toList());
        System.out.println(list3);
        List<Integer> list4;
        list1.stream().forEach(x-> System.out.println(x));
        Boolean list5 = list1.stream().allMatch(n-> n%3==0);
        System.out.println(list5);



    }
}
