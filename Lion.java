public class Lion extends Feline{
    public void huntInPack()
  {
    System.out.println("The lion hunts alone");
  }

  public Lion(String food, boolean nocturnal, double aveLifeSpan)
  {
    super(food, nocturnal, aveLifeSpan); //Step 14
    System.out.println("A lion arrives"); //Step 16
  }

  public void roar()
  {
    System.out.println( "The lion roars.");
  }

  public void speak()
  {
    roar();
  }
}
