import java.util.*;

public class DotComBust {

  // declare and initialize the variables we'll need
  private GameHelper helper = new GameHelper();
  private ArrayList<DotCom> dotComsList = new ArrayList<DotCom>();
  private int numOfGuesses = 0;
  //

  private void setUpGame() {
    // first make some dot coms and give them locations
    // make three DotCom objects, give them names and stick them
    // in the ArrayList
    DotCom one = new DotCom();
    DotCom two = new DotCom();
    DotCom three = new DotCom();
    one.setName("Pets.com");
    two.setName("eToys.com");
    three.setName("Go2.com");
    dotComsList.add(one);
    dotComsList.add(two);
    dotComsList.add(three);

    // print brief instructions for the user
    System.out.println("Your goal is to sink three dot coms.");
    System.out.println("Pets.com, eToys.com, Go2.com");
    System.out.println("Try to sink them all in the fewest number of guesses");

    for (DotCom dotComToSet : dotComsList) { // repeat with each DotCom in the list
      ArrayList<String> newLocation = helper.placeDotCom(3); // ask the helper for DotCom location
      dotComToSet.setLocationCells(newLocation); // give DotCom location from helper
    }
  }

  private void startPlaying() {
    while (!dotComsList.isEmpty()) { // as long DotCom list is NOT empty
      String userGuess = helper.getUserInput("Enter a guess");
      checkUserGuess(userGuess);
    }
    finishGame();
  }

  private void checkUserGuess(String userGuess) {

    numOfGuesses++; // increment the number of guesses the user has made
    String result = "miss"; // assume it's a miss unless told otherwise
    // repeat with all DotComs in the list
    for (int x = 0; x < dotComsList.size(); x++) {
      // ask the DotCom to check the user guess, looking for hit or miss
      result = dotComsList.get(x).checkYourself(userGuess);
      if (result.equals("hit")) {
        break; // get out of the loop early
      }
      if (result.equals("kill")) {
        dotComsList.remove(x); // dead, so take out of the list and remove
        break;
      }
    }
    System.out.println(result);
  }

  private void finishGame() {
    // print message to user how he did in game
    System.out.println("All Dot Coms are dead! Your stock is now worthless.");
    if (numOfGuesses <= 18) {
      System.out.println("It only took you " + numOfGuesses + " guesses.");
      System.out.println(" You got out before your options sank.");
    } else {
      System.out.println("Took you long enough. " + numOfGuesses + " guesses.");
      System.out.println("Fish are dancing with your options");
    }
  }
    //

  public static void main (String[] args) {
    DotComBust game = new DotComBust(); // create game object
    game.setUpGame(); // set up game
    game.startPlaying(); // start the main game loop
  }


}
