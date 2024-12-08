package pattern.printing;

import java.util.Scanner;

public class NumberSquare {

    public static void main(String[] args) {
        System.out.println("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        for(int i=1;i<=number;i++){
            for(int j=1;j<=number;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
