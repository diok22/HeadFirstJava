public class PhraseOMatic {
  public static void main (String[] args) {

    String[] verbs = {"like", "love", "enjoy", "dislike", "hate"};
    String[] actions = {"playing", "watching"};
    String[] sports = {"tennis", "football", "basketball", "table tennis"};


    int verbsLength = verbs.length;
    int actionsLength = actions.length;
    int sportsLength = sports.length;

    int verbsRand = (int) (Math.random() * verbsLength);
    int actionsRand = (int) (Math.random() * actionsLength);
    int sportsRand = (int) (Math.random() * sportsLength);

    String phrase = "I " + verbs[verbsRand] + " " + actions[actionsRand] + " " + sports[sportsRand]+"!";

  System.out.print(phrase);
  }
}
