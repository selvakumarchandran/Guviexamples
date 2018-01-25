package com.guvi.examples;

import java.awt.*;
import java.util.*;
import java.util.List;

public class Duplicateremove {


    public static Set getValues()
    {
        Scanner scanner = new Scanner(System.in);
        Set list = new HashSet();
        Integer firstTot = Integer.valueOf(scanner.nextLine());
        String[] secondaryvalue = scanner.nextLine().split(" ");
        for (int i = 0; i <secondaryvalue.length ; i++) {
            list.add(secondaryvalue[i]);
        }
        return list;
    }
    public static void main(String[] args) {
        Set list = new HashSet();
        list = getValues();
        Iterator iterator = list.iterator();
        while (iterator.hasNext())
        {
            System.out.print(iterator.next());
        }
        }
}
