package pattern.printing.special.patterns;

import java.util.Scanner;

public class OddNumberTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();

//-----------:PATTERN:-----------
//        1
//        1 3
//        1 3 5
//        1 3 5 7
//        1 3 5 7 9

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(2*j - 1 + " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();

//-----------:PATTERN:-----------
//        1
//        3 3
//        5 5 5
//        7 7 7 7
//        9 9 9 9 9

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(2*i-1 + " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
    }
}
