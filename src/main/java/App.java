import java.io.Console;

public class App {
  public static void main(String[] args) {
    Console console = System.console();
    ScrabbleScore userScrabble = new ScrabbleScore();

    System.out.println("Let's figure out your Scrabble score!");
    System.out.println("please enter a word");
    String userWord = console.readLine();
    String finalScore = userScrabble.calculateScore(userWord);

    System.out.println("The word " + userWord + " is worth " + finalScore + " points.");

  }
}
