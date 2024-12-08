package pattern.printing.special.patterns;

import java.util.Scanner;

public class NumberBridge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();

/*
-----------:PATTERN:-----------
        1 2 3 4 5 6 7 8 9
        1 2 3 4   6 7 8 9
        1 2 3       7 8 9
        1 2           8 9
        1               9
*/

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j < 2 * rows; j++) {
                if(i > 1 && (j > rows - i + 1 && j < rows + i - 1) ) {
                    System.out.print(" "+" ");
                }else {
                    System.out.print(j + " ");
                }
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();
    }
}
