public class MyAnimalList {
  private Animal[] animals = new Animal[5];
  private int nextIndex = 0;

  public void addAnimal(Animal a) {
    if (index < animals.length) {
      animals[nextIndex] = a;
      System.out.println("Animal added at " + nextIndex);
      nextIndex++;
    }
  }

}
