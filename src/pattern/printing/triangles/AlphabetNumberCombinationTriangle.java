package pattern.printing.triangles;

import java.util.Scanner;

public class AlphabetNumberCombinationTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();

//-----------:PATTERN:-----------
//        1
//        A B
//        1 2 3
//        A B C D
//        1 2 3 4 5

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j <= i; j++) {
                if(i%2==0)
                    System.out.print((char) ('1'+j) + " ");
                else
                    System.out.print((char) ('A'+j) + " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
    }
}
