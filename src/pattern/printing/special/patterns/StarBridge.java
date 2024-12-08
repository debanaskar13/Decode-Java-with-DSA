package pattern.printing.special.patterns;

import java.util.Scanner;

public class StarBridge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();

/*
-----------:PATTERN:-----------
        * * * * * * * * *
        * * * *   * * * *
        * * *       * * *
        * *           * *
        *               *
*/
/*
--------------One Possible Solution:--------------
        for (int j = 1; j < 2 * rows; j++) {
            System.out.print("*"+" ");
        }
        System.out.println();

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows - i; j++) {
                System.out.print("*" + " ");
            }

            for (int j = 1; j < 2 * i; j++) {
                System.out.print(" " + " ");
            }

            for (int j = rows - i; j >= 1; j--) {
                System.out.print("*" + " ");
            }

            System.out.println();

        }
 */
//--------------Second Possible Solution:--------------

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j < 2 * rows; j++) {
                if(i > 1 && (j > rows - i + 1 && j <= rows + i - 2) ) {
                    System.out.print(" "+" ");
                }else {
                    System.out.print("*" + " ");
                }
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();
    }
}
