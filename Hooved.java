/*
 * Activity 4.9.2
 */
public class Hooved extends Animal
{
  public void forage()
  {
    System.out.println("The hooved animal forages for food.");
  }

  public Hooved(String food, boolean nocturnal, double aveLifeSpan) //Step 27
  {
    super(food, nocturnal, aveLifeSpan);
    System.out.println("A hooved animal arrives");
  }

  public Hooved() //Step 27
  {
    System.out.println("A hooved animal has arrives");
  }
}