package main.java.com.github.tonibuc;

import java.util.Scanner;

public class CheckPalindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string to check if it's a palindrome:");
        String str = scanner.nextLine();
        System.out.println(checkPalindrome(str));
    }

    public static boolean checkPalindrome(String str){

        int x = 0;
        int y = str.length()-1;

        while (x < y){
            if (str.charAt(x++) != str.charAt(y--))
                return false;
        }

        return true;
    }
}
