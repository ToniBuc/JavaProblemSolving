package main.java.com.github.tonibuc;

import java.util.Scanner;

public class CountVowels {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String x;
        int n[] = {0,0,0,0,0};
        System.out.println("Enter a string to count vowels for:");
        x = scanner.nextLine();
        for (int i = 0; i< x.length(); i++){
            if (x.charAt(i) == 'a' || x.charAt(i) == 'A'){
                n[0]++;
            }
            if (x.charAt(i) == 'e' || x.charAt(i) == 'E'){
                n[1]++;
            }
            if (x.charAt(i) == 'i' || x.charAt(i) == 'I'){
                n[2]++;
            }
            if (x.charAt(i) == 'o' || x.charAt(i) == 'O'){
                n[3]++;
            }
            if (x.charAt(i) == 'u' || x.charAt(i) == 'U'){
                n[4]++;
            }
        }

        System.out.println("Vowel A appearances: " + n[0]);
        System.out.println("Vowel E appearances: " + n[1]);
        System.out.println("Vowel I appearances: " + n[2]);
        System.out.println("Vowel O appearances: " + n[3]);
        System.out.println("Vowel U appearances: " + n[4]);
    }
}
