import org.junit.*;
import static org.junit.Assert.*;

public class ScrabbleScoreTest {

  @Test
  public void calculateScore_returnScoreForSingleLetter_1() {
    ScrabbleScore testScrabbleScore = new ScrabbleScore();
    String expectedOutput = "1";
    assertEquals(expectedOutput, testScrabbleScore.calculateScore("a"));
  }

  @Test
  public void calculateScore_returnScoreFor_MultiLetters_2() {
    ScrabbleScore testScrabbleScore = new ScrabbleScore();
    String expectedOutput = "2";
    assertEquals(expectedOutput, testScrabbleScore.calculateScore("ae"));
  }

  @Test
  public void calculateScore_returnScoreForMultiPointLetter_2(){
    ScrabbleScore testScrabbleScore = new ScrabbleScore();
    String expectedOutput = "4";
    assertEquals(expectedOutput, testScrabbleScore.calculateScore("dg"));
  }

  @Test
  public void calculateScore_returnScoreFor3PointLetters_9(){
    ScrabbleScore testScrabbleScore = new ScrabbleScore();
    String expectedOutput = "9";
    assertEquals(expectedOutput, testScrabbleScore.calculateScore("bmp"));
  }

  @Test
  public void calculateScore_returnScoreFor4PointLetters_12(){
    ScrabbleScore testScrabbleScore = new ScrabbleScore();
    String expectedOutput = "12";
    assertEquals(expectedOutput, testScrabbleScore.calculateScore("hvy"));
  }

}
