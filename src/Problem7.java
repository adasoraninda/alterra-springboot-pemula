import java.util.Scanner;

/**
 * Problem 7 - Play With Asterisk
 * Buatlah program untuk mencetak segitiga asterik seperti pohon.
 */
public class Problem7 {

    public static void main(String... args) {
        Problem7 problem7 = new Problem7();
        System.out.print("Input: ");
        int input = problem7.generateInput();
        System.out.println("Output: ");
        problem7.printThree(input);
    }

    private void printThree(int input) {
        int max = input * 2;
        int counterLeft = input;
        int counterRight = input;

        for (int i = 1; i <= input; i++) {
            for (int j = 1; j <= max; j++) {
                if (j < counterLeft) {
                    System.out.print(" ");
                    continue;
                }

                if (j > counterRight) {
                    System.out.print(" ");
                    continue;
                }

                if (i % 2 == 0) {
                    if (j % 2 == 0) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                } else {
                    if (j % 2 == 0) {
                        System.out.print(" ");
                    } else {
                        System.out.print("*");
                    }
                }
            }

            counterLeft--;
            counterRight++;
            System.out.println();
        }
    }

    private int generateInput() {
        Scanner input = new Scanner(System.in);
        int result = input.nextInt();
        input.close();
        return result;
    }

}
