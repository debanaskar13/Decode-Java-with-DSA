package pattern.printing.triangles;

import java.util.Scanner;

public class AlphabetTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();

//-----------:PATTERN:-----------
//        A
//        A B
//        A B C
//        A B C D
//        A B C D E

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print((char) ('A'+j) + " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();

//-----------:PATTERN:-----------
//        A
//        B B
//        C C C
//        D D D D
//        E E E E E

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print((char) ('A'+i) + " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();

    }

}
