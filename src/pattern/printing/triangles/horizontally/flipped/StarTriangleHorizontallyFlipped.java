package pattern.printing.triangles.horizontally.flipped;

import java.util.Scanner;

public class StarTriangleHorizontallyFlipped {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();

//-----------:PATTERN:-----------
//        * * * * *
//        * * * *
//        * * *
//        * *
//        *

        for (int i = rows-1; i >= 0; i--) {
            for (int j = i; j >=0; j--) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }

    }
}
