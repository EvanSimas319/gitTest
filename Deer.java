/*
 * Activity 4.9.2
 */
public class Deer extends Hooved
{
  public void grunt()
  {
    System.out.println("The deer grunts.");
  }

  public Deer(String food, boolean nocturnal, double aveLifeSpan) //Step 27
  {
    //super(food, nocturnal, aveLifeSpan);
    //System.out.println("A deer has arrived to the zoo");
  }

  public void speak()
  {
    grunt();
  }
}