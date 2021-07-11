package main.java.com.github.tonibuc;

import java.util.Scanner;

public class CheckPalindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String x, y = "";
        System.out.println("Enter a string to check if it's a palindrome:");
        x = scanner.nextLine();

        for(int i = x.length()-1; i >= 0; i--){
            y += x.charAt(i);
        }

        if (x.equalsIgnoreCase(y)){
            System.out.println("The entered string is a palindrome");
        }
        else{
            System.out.println("The entered string is not a palindrome");
        }
    }
}
