public class Bird extends Animal
{
  public Bird()
  {
    System.out.println("A bird has arrived to the zoo"); //Step 24
  }

  public Bird(String food, boolean nocturnal, double aveLifeSpan) //Step 27
  {
    super(food, nocturnal, aveLifeSpan);
    System.out.println("A bird has arrived to the zoo");
  }

}
