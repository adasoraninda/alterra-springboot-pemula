import java.util.Locale;
import java.util.Scanner;

/**
 * Problem 2 - X dan O
 * Program akan menerima satu variabel string, program tersebut akan
 * menghasilkan output true jika jumlah karakter x sama dengan jumlah karakter o, dan false jika tidak.
 */
public class Problem2 {

    public static final String X_ID = "x";
    public static final String O_ID = "o";

    public static void main(String... args) {
        Problem2 problem2 = new Problem2();

        System.out.print("Input: ");
        String resultInput = problem2.generateInput();

        if (!problem2.checkInput(resultInput)) return;

        boolean result = problem2.calculateInput(resultInput);
        System.out.println("Output: " + result);
    }

    private boolean calculateInput(String input) {
        int countX = 0;

        for (String s : input.split("")) {
            if(s.equals(X_ID)) ++countX;
            if(s.equals(O_ID)) --countX;
        }

        return countX == 0;
    }

    private String generateInput() {
        Scanner input = new Scanner(System.in);

        String result = input.next();

        input.close();

        return result.trim().toLowerCase(Locale.ROOT);
    }

    private boolean checkInput(String input) {
        if (input == null) return false;

        for (String s : input.split("")) {
            if (s.equals(X_ID)) continue;
            if (s.equals(O_ID)) continue;
            return false;
        }

        return true;
    }

}
