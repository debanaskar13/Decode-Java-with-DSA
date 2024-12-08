package pattern.printing.square;

import java.util.Scanner;

public class NumberSquare {

    public static void main(String[] args) {
        System.out.println("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

//-----------:PATTERN:-----------
//        1 2 3 4 5
//        1 2 3 4 5
//        1 2 3 4 5
//        1 2 3 4 5
//        1 2 3 4 5

        for(int i=1;i<=number;i++){
            for(int j=1;j<=number;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();

//-----------:PATTERN:-----------
//        1 1 1 1 1
//        2 2 2 2 2
//        3 3 3 3 3
//        4 4 4 4 4
//        5 5 5 5 5

        for(int i=1;i<=number;i++){
            for(int j=1;j<=number;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
