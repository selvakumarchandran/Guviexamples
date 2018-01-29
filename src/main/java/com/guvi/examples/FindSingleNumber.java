package com.guvi.examples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class FindSingleNumber {


    public static List<String> getSingleNumber()
    {

        Scanner scanner = new Scanner(System.in);
        int countNum = Integer.parseInt(scanner.nextLine());
        String s[] = scanner.nextLine().split(" ");
        List<String> list = new ArrayList<String>();
        for (int i = 0; i <s.length; i++) {
            list.add(s[i]);
        }

        return list;
    }
    public static void main(String[] args) {
        List<String> stringList=getSingleNumber();
        for (int i = 0; i <stringList.size() ; i++) {
            int countValue = Collections.frequency(stringList,stringList.get(i));
            if(countValue==1)
            {
                System.out.print(stringList.get(i));
            }
        }
     }
}
