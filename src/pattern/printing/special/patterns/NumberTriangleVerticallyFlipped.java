package pattern.printing.special.patterns;

import java.util.Scanner;

public class NumberTriangleVerticallyFlipped {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();

/*
-----------:PATTERN:-----------
                1
              1 2
            1 2 3
          1 2 3 4
        1 2 3 4 5
*/
        for (int i = 1; i <= rows; i++) {

/*
--------------One Possible Solution:--------------
            int c=0;
            for (int j = 1; j <= rows; j++) {
                if (i + j > rows) {
                    c++;
                    System.out.print(c + " ");
                }else{
                    System.out.print(" " + " ");
                }
            }
            System.out.println();
*/
//--------------Second Possible Solution:--------------
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" "+" ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }

            System.out.println();

        }
        System.out.println();
        System.out.println();
    }
}
