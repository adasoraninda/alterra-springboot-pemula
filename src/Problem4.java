import java.util.Scanner;

/**
 * Problem 4 - Bilangan Prima
 * Dalam matematika, bilangan prima adalah bilangan asli yang lebih besar dari angka 1,
 * yang faktor pembaginya adalah 1 dan bilangan itu sendiri. 2 dan 3 adalah bilangan prima. 4 bukan
 * bilangan prima karena 4 bisa dibagi 2. Tugas membuat fungsi untuk menentukan bahwa sebuah bilangan termasuk
 * bilangan prima atau bukan.
 */

public class Problem4 {

    public static void main(String... args) {
        Problem4 problem4 = new Problem4();
        System.out.print("Input: ");
        int resultInput = problem4.generateInput();
        boolean isPrime = problem4.checkPrimeNumber(resultInput);
        String result = isPrime? "Bilangan Prima" : "Bukan Bilangan Prima";
        System.out.print("Output: " + result);
    }

    private int generateInput() {
        Scanner input = new Scanner(System.in);
        int result = input.nextInt();
        input.close();
        return result;
    }

    private boolean checkPrimeNumber(int number) {
        if (number <= 0) return false;

        int counter = 0;

        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                counter++;
            }

            if (counter > 2) {
                return false;
            }
        }

        return true;
    }

}
