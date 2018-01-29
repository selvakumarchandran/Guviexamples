package com.guvi.examples;

import java.awt.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Findlargestnumber {

    public static ArrayList getLargestNumber()
    {
        Scanner scanner =new Scanner(System.in);
        Set set = new HashSet();
        ArrayList list = new ArrayList();
        int fiValue = Integer.valueOf(scanner.nextLine());
        String[] siValue = scanner.nextLine().split(" ");
        for (int i = 0; i <siValue.length ; i++) {
            set.add(siValue[i]);

        }

        list.addAll(set);
        return list;

    }
    public static void main(String[] args) {
        ArrayList arrayList = getLargestNumber();
        for (int i = arrayList.size()-1; i>=0 ; i--) {
            System.out.print(arrayList.get(i));
        }
    }
}
