package com.company;

import java.util.Scanner;

public class ReverseString {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println(str);

        char[] arrString = str.toCharArray();

        System.out.println(arrString);

        String result = "";

        for (int i = arrString.length-1; i >= 0; i--)
            result += arrString[i];
        System.out.println(result);
    }

    public boolean isStringPalindrome(String str) {

        char[] arrString = str.toCharArray();

        for (int i = 0; i < str.length() / 2; i++) {
            if(arrString[i] != arrString[arrString.length - 1 - i])
                return false;
        }
        return true;
    }
}
