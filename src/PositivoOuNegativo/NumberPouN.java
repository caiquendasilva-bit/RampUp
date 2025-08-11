package src.PositivoOuNegativo;

import java.util.Scanner;

public class NumberPouN {

    public void checkNumber() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (number < 0) {
            System.out.println("Negative number");
        }else if (number > 0) {
            System.out.printf("Positive number: %d\n", number);
        }else {
            System.out.printf("Number is zero: %d\n", number);
        }
    }
}
