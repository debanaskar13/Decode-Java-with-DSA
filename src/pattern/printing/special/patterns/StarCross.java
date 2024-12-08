package pattern.printing.special.patterns;

import java.util.Scanner;

public class StarCross {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();

/*
-----------:PATTERN:-----------
        *           *
          *       *
            *   *
              *
            *   *
          *       *
        *           *
*/
        if(rows % 2 == 0){
            rows = rows + 1;
        }
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows; j++) {
                if(i == j || (i + j == rows + 1)){
                   System.out.print("*" + " ");
                }else{
                    System.out.print(" " + " ");
                }
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
    }
}
