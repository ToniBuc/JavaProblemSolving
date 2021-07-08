package main.java.com.github.tonibuc;

import java.util.Scanner;

public class NextPrimeNumber {
    public static void main(String[] args) {
        String x = "temp";
        int n = 2, counter = 0;
        Scanner scanner = new Scanner(System.in);

        while (!x.matches("yes|no")){
            System.out.println("Do you wish to display the first prime number? (yes/no)");
            x = scanner.next();
        }

        if (x != "yes") {
            while (x.equalsIgnoreCase("yes")){
                x = "temp";
                boolean checker = true;
                do {
                    if (IsPrime(n)){
                        counter++;
                        System.out.println(counter + ". prime number: " + n);
                        n++;
                        checker = false;
                    }
                    else{
                        n++;
                    }
                }
                while (checker == true);
                System.out.println("Do you wish to display the next prime number? (yes/no)");
                x = scanner.next();
                while (!x.matches("yes|no")){
                    System.out.println("Do you wish to display the next prime number? (yes/no)");
                    x = scanner.next();
                }
            }
        }

        System.out.println("You have displayed " + counter + " prime numbers in total.");
    }

    static boolean IsPrime(int x){
        for (int i = 2; i < x; i++){
            if (x % i == 0)
                return false;
        }
        return true;
    }
}
