import java.util.Scanner;

/**
 * Problem 6 - Exponentiation
 * Membuat fungsi pangkat
 */
public class Problem6 {

    public static void main(String... args){
        Problem6 problem6 = new Problem6();
        Scanner input = new Scanner(System.in);

        System.out.print("x= ");
        int x = input.nextInt();

        System.out.print("n= ");
        int n = input.nextInt();

        input.close();

        long result = problem6.exponent(x, n);
        System.out.print("Output: " + result);
    }

    private long exponent(int x, int n) {
        int result = x;

        if(n == 0) return 1;

        for (int i = 2; i <= n; i++) {
            result *= x;
        }

        return result;
    }

}
