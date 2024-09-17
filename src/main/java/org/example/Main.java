package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }


    public static boolean isPalindrome(int num) {
        num = Math.abs(num);
        String numStr = String.valueOf(num);
        String reversedStr = new StringBuilder(numStr).reverse().toString();
        return numStr.equals(reversedStr);
    }


    public static boolean isPerfectNumber(int num) {
        if (num < 0) {
            return false;
        }

        int sum = 0;
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        return sum == num;
    }

    public static String numberToWords(int num) {
        if (num < 0) {
            return "Invalid Value";
        }
        StringBuilder result = new StringBuilder();
        String strNum = String.valueOf(num);
        String[] names = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};

        for (int i = 0; i < strNum.length(); i++) {
            char digit = strNum.charAt(i);
            int digitIndex = Character.getNumericValue(digit);
            result.append(names[digitIndex]).append(" ");
        }
        return result.toString().trim();


    }
}