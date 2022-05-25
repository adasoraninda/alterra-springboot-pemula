import java.util.Scanner;

/**
 * Problem 8 - Cetak Tabel Perkalian
 * Buat program untuk membuat tabel perkailian.
 * Input bilangan 1 - 30
 */
public class Problem8 {

    public static void main(String... args) {
        Problem8 problem8 = new Problem8();

        System.out.print("Input: ");
        int input = problem8.generateInput();

        if (!problem8.checkInput(input)) return;

        System.out.println("Output: ");
        problem8.printTableMultiply(input);
    }

    private boolean checkInput(int input) {
        return input >= 1 && input <= 30;
    }

    private void printTableMultiply(int input) {
        String[][] results = new String[input][input];

        for (int i = 1; i <= input; i++) {
            for (int j = 1; j <= input; j++) {
                int result = i * j;
                results[i - 1][j - 1] = String.valueOf(result);
            }
        }

        for (String[] strings : results) {
            for (int j = 0; j < strings.length; j++) {
                String result = strings[j];
                String output = result + " ";

                int lastLengthResult = (results[results.length - 1][j]).length();
                int currentLength = result.length();

                if (lastLengthResult > currentLength) {
                    String space = " ".repeat(lastLengthResult - currentLength);
                    output += space;
                }

                System.out.print(output);
            }
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
