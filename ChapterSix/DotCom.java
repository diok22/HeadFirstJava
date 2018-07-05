import java.util.*;

public class DotCom {
  // instance variables
  private ArrayList<String> locationCells;
  private String name;

  // setter method for the DotCom's locations
  public void setLocationCells(ArrayList<String> loc) {
    locationCells = loc;
  }

  // basic setter method
  public void setName(String n) {
    name = n;
  }

  public String checkYourself(String userInput) {
    String result = "miss";
    int index = locationCells.indexOf(userInput);
    if (index >= 0) {
      locationCells.remove(index); // delete entry

      if (locationCells.isEmpty()) { // if location has been guessed
        result = "kill";
        System.out.println("Ouch! You sunk " + name + "  : ( ");
      } else {
        result = "hit";
      }

    }
    return result;
  }

}
