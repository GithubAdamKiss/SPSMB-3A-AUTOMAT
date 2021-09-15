package cz.spsmb.a3;

import java.util.Scanner;

public class Application {

    public static final int[] CONST_money = {5000, 2000, 1000, 500, 200, 100, 50, 20, 10, 5, 2, 1};
    public static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        ///-------------------------------------------
        /// /* zadání : automat rozmení peníze */
        /// 5129
        /// -----
        /// 1x 5000
        /// 1x 100
        /// atd.....
        ///-------------------------------------------


        System.out.println("zadejte hodnotu");
        int a = sc.nextInt();

        if (a < 0) { System.exit(0);}

        int c;
        for (int i : CONST_money) {
            if (a % i != a) {
                c = a;
                a = a % i;
                System.out.println(i + " *" + c / i);
            }
        }


    }
}
