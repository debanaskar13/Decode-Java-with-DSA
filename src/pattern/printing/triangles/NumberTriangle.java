package pattern.printing.triangles;

import java.util.Scanner;

public class NumberTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();

//-----------:PATTERN:-----------
//        1
//        1 2
//        1 2 3
//        1 2 3 4
//        1 2 3 4 5

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();

//-----------:PATTERN:-----------
//        1
//        2 2
//        3 3 3
//        4 4 4 4
//        5 5 5 5 5

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
    }
}
