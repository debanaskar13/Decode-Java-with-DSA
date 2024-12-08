package pattern.printing.special.patterns;

import java.util.Scanner;

public class NumberPyramidPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();

/*
-----------:PATTERN:-----------
                1
              1 2 1
            1 2 3 2 1
          1 2 3 4 3 2 1
        1 2 3 4 5 4 3 2 1
*/
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" "+" ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }

            for (int j = i-1; j >= 1; j--) {
                System.out.print(j+" ");
            }

            System.out.println();

        }
        System.out.println();
        System.out.println();
    }
}
