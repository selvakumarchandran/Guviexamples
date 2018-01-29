package com.guvi.examples;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class FindSerialNumbers {


    public static Set getCalculateNumbers(String[] Secondvalue)
    {
        Set set = new HashSet();
        for (int i = 0; i <Secondvalue.length ; i++) {
            set.add(Secondvalue[i]);
        }
        return set;
    }
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int number = Integer.valueOf(scanner.nextLine());
        String[] Secondvalue =scanner.nextLine().split(" ");
        Set set =  getCalculateNumbers(Secondvalue);
        Iterator iterator = set.iterator();
        while (iterator.hasNext())
        {
            String findValue = iterator.next().toString();
            if(Integer.parseInt(findValue)<number)
            {
                System.out.print(" "+findValue);
            }
        }
    }
}
