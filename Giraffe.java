/*
 * Activity 4.9.2
 */
public class Giraffe extends Hooved
{
  public void hum()
  {
    System.out.println("The giraffe hums.");
  }

  public Giraffe(String food, boolean nocturnal, double aveLifeSpan) //Step 27
  {
    super(food, nocturnal, aveLifeSpan);
    System.out.println("A giraffe arrives");
  }

  public void speak()
  {
    hum();
  }
}