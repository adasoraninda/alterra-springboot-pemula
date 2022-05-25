import java.util.Scanner;

/**
 * Problem 3 - Faktor Bilangan
 * Faktor suatu bilangan adalah suatu bilangan yang dapat habis membagi bilangan tersebut.
 * Tugas, membuat sebuah program untuk mencetak faktor sebuah bilangan.
 */
public class Problem3 {

    public static void main(String... args){
        Problem3 problem3 = new Problem3();
        System.out.print("Input: ");
        int result = problem3.generateInput();
        System.out.println("Output:");
        problem3.printFactorNumber(result);
    }

    private int generateInput() {
        Scanner scanner = new Scanner(System.in);
        int result = scanner.nextInt();
        scanner.close();
        return result;
    }

    private void printFactorNumber(int number) {
        if (number == 0) System.out.println(number);

        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= number; j++) {
                int result = i * j;
                if (result == number) {
                    System.out.println(i);
                    break;
                }
            }
        }
    }

}
