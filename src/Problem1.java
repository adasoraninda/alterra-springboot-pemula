/**
 * Problem 1 - Voka, Konsonan Menghitung jumlah karakter yang berupa vokal, konsonan dan total
 * karakter dari kalimat "Alterra Indonesia".
 */
public class Problem1 {

  public static void main(String... args) {
    Problem1 pb1 = new Problem1();

    String sentence = "Alterra Indonesia";
    String input = pb1.cleanUpString(sentence);

    int countVocal = pb1.countVocal(input);
    int countConsonant = pb1.countConsonant(input);
    int totalChars = input.length();

    System.out.println("Jumlah Vokal : " + countVocal);
    System.out.println("Jumlah Konsonan : " + countConsonant);
    System.out.println("Total Karakter : " + totalChars);
  }

  private String cleanUpString(String sentence) {
    return sentence.replace(" ", "").toLowerCase().trim();
  }

  private int countVocal(String sentence) {
    int count = 0;

    for (char c : sentence.toCharArray()) {
      if (isVocal(c)) {
        ++count;
      }
    }

    return count;
  }

  private int countConsonant(String sentence) {
    int count = 0;

    for (char c : sentence.toCharArray()) {
      if (!isVocal(c)) {
        ++count;
      }
    }

    return count;
  }

  private boolean isVocal(char character) {
    char[] vocals = {'a', 'i', 'u', 'e', 'o'};

    for (char vocal : vocals) {
      if (vocal == character) {
        return true;
      }
    }

    return false;
  }

}
