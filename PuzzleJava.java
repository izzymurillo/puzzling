import java.util.ArrayList;
import java.util.Random;

public class PuzzleJava {

  Random random = new Random();

  void generateRandomInts() {
    for (int i = 1; i <= 10; i++) {
      System.out.println(random.nextInt(21));
    }
  }

  // ======== getTenRolls =========
  // Write a method that will generate and return an array with 10 random numbers
  // between 1 and 20 inclusive.
  int[] getTenRolls() {
    int[] tenRolls = new int[10];
    for (int i = 0; i < 10; i++) {
      tenRolls[i] = random.nextInt(21); // number 21 is exclusive
    }
    return tenRolls;
  }

  // ======== getRandomLetter ========
  // Write a method that will:
  public char getRandomLetter() {
    // 1. Create an array within the method that contains all 26 letters of the
    // alphabet (this array must have 26 values).
    String alphabet = "abcdefghijklmnopqrstuvwxyz";
    // 2. Generate a random index between 0-25 and use it to pull a random letter
    // out of the array.
    System.out.println(alphabet.charAt(random.nextInt(26)));
    // 3. Return the random letter.
    return (alphabet.charAt(random.nextInt(26)));
  }

  // ======== generatePassword ========
  /*
   * Write a method that uses the previous method to create a random string of
   * eight characters and return that string.
   */
  String password;

  public String generatePassword() {
    for (int i = 1; i < 8; i++) {
      password += (getRandomLetter());
    }
    return password;
  }

  // ======== getNewPasswordSet ========
  // Write a method that takes an int length as an argument and creates an array
  // of random eight-character words. The array should be the length passed in as
  // an int. Return the array of passwords.
  public ArrayList<String> getNewPasswordSet(int length) {
    ArrayList<String> passwordSet = new ArrayList<String>();
    for (int i = 0; i < length; i++) {
      passwordSet.add(generatePassword());
    }
    System.out.println(passwordSet);
    return passwordSet;
  }
}