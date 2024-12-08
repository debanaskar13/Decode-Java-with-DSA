package pattern.printing.triangles.horizontally.flipped;

import java.util.Scanner;

public class AlphabetTriangleHorizontallyFlipped {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();

//-----------:PATTERN:-----------
//        A B C D E
//        A B C D
//        A B C
//        A B
//        A

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows-i+1; j++) {
                System.out.print((char) ('A'+j-1) + " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();

//-----------:PATTERN:-----------
//        A A A A A
//        B B B B
//        C C C
//        D D
//        E

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows-i+1; j++) {
                System.out.print((char) ('A'+i-1) + " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();

    }

}
