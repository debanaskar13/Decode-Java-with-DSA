package pattern.printing.special.patterns;

import java.util.Scanner;

public class FloydsTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();

/*
-----------:PATTERN:-----------
        1
        2 5
        3 6 8
        4 7 9 10
*/

        for (int i = 1; i <= rows; i++) {
            int d = i;
            for (int j = 1; j <= i; j++) {
                System.out.print(d + " ");
                d += rows - j;
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();

/*
-----------:PATTERN:-----------
        1
        2 3
        4 5 6
        7 8 9 10
*/


        int c = 1;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(c + " ");
                c++;
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
    }
}
