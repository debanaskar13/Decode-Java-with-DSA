package pattern.printing.square;

import java.util.Scanner;

public class AlphabetSquare {
    public static void main(String[] args) {
        System.out.println("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

//-----------:PATTERN:-----------
//        A B C D E
//        A B C D E
//        A B C D E
//        A B C D E
//        A B C D E

        for(int i=0;i<number;i++){
            for(int j=0;j<number;j++){
                System.out.print((char)('A'+j) + " ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();
//-----------:PATTERN:-----------
//        A A A A A
//        B B B B B
//        C C C C C
//        D D D D D
//        E E E E E

        for(int i=0;i<number;i++){
            for(int j=0;j<number;j++){
                System.out.print((char)('A'+i) + " ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();

//-----------:PATTERN:-----------
//        a b c d e
//        a b c d e
//        a b c d e
//        a b c d e
//        a b c d e

        for(int i=0;i<number;i++){
            for(int j=0;j<number;j++){
                System.out.print((char)('a'+j) + " ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();

//-----------:PATTERN:-----------
//        a a a a a
//        b b b b b
//        c c c c c
//        d d d d d
//        e e e e e

        for(int i=0;i<number;i++){
            for(int j=0;j<number;j++){
                System.out.print((char)('a'+i) + " ");
            }
            System.out.println();
        }
    }
}
