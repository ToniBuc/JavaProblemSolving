package main.java.com.github.tonibuc;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Pi2TheNth {
    public static void main(String[] args) {
        int x = 0;
        String digitCounter = new String();
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Please enter the number of Pi decimal digits you wish to display (max 15):");
            x = scanner.nextInt();
        } while (x >= 16 || x <= 0);

        for (int i = 0; i < x; i++){
            digitCounter += 0;
        }

        System.out.println("Pi with " + x + " decimal digits displayed:");
        System.out.println(BigDecimal.valueOf(Math.PI).setScale(x, RoundingMode.FLOOR).doubleValue());
    }
}
