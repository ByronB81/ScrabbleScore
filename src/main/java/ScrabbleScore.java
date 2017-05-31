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
      } else if (letter.matches(".*[dg].*")){
        score += 2;
      } else if (letter.matches(".*[bcmp].*")) {
        score += 3;
      } else if (letter.matches(".*[fhvwy].*")){
        score += 4;
      } else if (letter.matches("k")){
        score += 5;
      }
    }
    System.out.println(score);
    return Integer.toString(score);
  }

}
