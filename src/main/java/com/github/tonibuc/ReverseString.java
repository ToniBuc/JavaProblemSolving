package main.java.com.github.tonibuc;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String x, y = "";
        System.out.println("Enter a string you want reversed:");
        x = scanner.next();

        for (int i = x.length()-1; i >= 0; i-- ){
            y += x.charAt(i);
        }

        System.out.println(y);
    }
}
