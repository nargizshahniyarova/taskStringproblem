package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String hackerRank = "hackerrank";
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();


        for (int k = 0; k < q; k++) {
            String s = in.next();
            int j = 0;
            for (int i = 0; i < s.length(); i++) {
                if (j < hackerRank.length() && s.charAt(i) == hackerRank.charAt(j)) {
                    j++;
                }
            }


            if (j == hackerRank.length())
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
