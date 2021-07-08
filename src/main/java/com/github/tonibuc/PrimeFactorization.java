package main.java.com.github.tonibuc;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrimeFactorization {
    public static void main(String[] args) {
        int x = 0;
        List<Integer> factors = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number you wish to display prime factors for:");
        x = scanner.nextInt();
        while (x <= 1){
            System.out.println("Please enter a number greater than 1:");
            x = scanner.nextInt();
        }

        if (IsPrime(x)){
            System.out.println("The entered number is a prime number.");
        }
        else{
            int y = 1, f2 = x, z = 2;
            do {
                if (IsPrime(z)){
                    if (f2 % z == 0){
                        f2 = f2/z;
                        factors.add(z);
                        for(int i = 0; i < factors.size(); i++){
                            y *= factors.get(i);
                        }
                    }
                    else{
                        z++;
                    }
                }
                else {
                    z++;
                }

                if (x != y){
                    y = 1;
                }
            } while (x != y);

            for (int i = 0; i < factors.size(); i++){
                System.out.println(factors.get(i));
            }
        }
    }

    static boolean IsPrime(int x){
        for (int i = 2; i < Math.sqrt(x); i++){
            if (x % i == 0)
                return false;
        }
        return true;
    }
}
