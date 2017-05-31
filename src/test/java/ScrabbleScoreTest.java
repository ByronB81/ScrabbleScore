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

  @Test
  public void calculateScore_returnScoreFor5PointLetter_5(){
    ScrabbleScore testScrabbleScore = new ScrabbleScore();
    String expectedOutput = "5";
    assertEquals(expectedOutput, testScrabbleScore.calculateScore("k"));
  }

  @Test
  public void calculateScore_returnScoreFor8PointLetters_16(){
    ScrabbleScore testScrabbleScore = new ScrabbleScore();
    String expectedOutput = "16";
    assertEquals(expectedOutput, testScrabbleScore.calculateScore("xj"));
  }

  @Test
  public void calculateScore_returnScoreFor10PointLetters_20(){
    ScrabbleScore testScrabbleScore = new ScrabbleScore();
    String expectedOutput = "20";
    assertEquals(expectedOutput, testScrabbleScore.calculateScore("zq"));
  }

  @Test
  public void calculateScore_returnScoreForFullWord_15() {
    ScrabbleScore testScrabbleScore = new ScrabbleScore();
    String expectedOutput = "15";
    assertEquals(expectedOutput, testScrabbleScore.calculateScore("Howdy"));
  }

}
