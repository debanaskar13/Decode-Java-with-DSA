package pattern.printing.special.patterns;

import java.util.Scanner;

public class StarTriangleVerticleFlipped {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();

/*
-----------:PATTERN:-----------
                *
              * *
            * * *
          * * * *
        * * * * *
*/
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows; j++) {
                if (i + j > rows) {
                    System.out.print("*" + " ");
                }else{
                    System.out.print(" " + " ");
                }
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
    }
}
