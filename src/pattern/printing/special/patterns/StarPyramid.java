package pattern.printing.special.patterns;

import java.util.Scanner;

public class StarPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();

/*
-----------:PATTERN:-----------
                *
              * * *
            * * * * *
          * * * * * * *
        * * * * * * * * *
*/

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" "+" ");
            }

            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*" + " ");
            }

            System.out.println();

        }
        System.out.println();
        System.out.println();
    }
}
