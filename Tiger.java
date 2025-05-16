public class Tiger extends Feline{
    public void huntAlone()
  {
    System.out.println("The tiger hunts alone.");
  }

  public void swim()
  {
    System.out.println("Splish splash");
  }

  public Tiger(String food, boolean nocturnal, double aveLifeSpan) //Step 21
  {
    super(food, nocturnal, aveLifeSpan);
    System.out.println("A tiger arrives");
  }

  public Tiger()
  {
    System.out.println("A tiger arrives"); //Step 24
  }

  public void roar()
  {
    System.out.println( "The tiger roars.");
  }

  public void speak()
  {
    roar();
  }
}
