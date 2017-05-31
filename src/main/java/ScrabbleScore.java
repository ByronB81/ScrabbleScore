import java.util.ArrayList;
import java.util.List;

public class ScrabbleScore {
  int score = 0;
  String[] wordArray;

  public String calculateScore(String userWord) {
    String lowerCaseWord = userWord.toLowerCase();
    wordArray = lowerCaseWord.split("");

    for (String letter : wordArray) {
      if (letter.matches(".*[aeioulnrst].*")) {
        score += 1;
      }
    }
    System.out.println(score);
    return Integer.toString(score);
  }

}
