/*
 * Activity 4.9.2
 */
public class Gorilla extends Primate
{
  public void grunt()
  {
    System.out.println("The gorilla grunts.");
  }

  public Gorilla() //Step 25
{
  System.out.println("A gorilla arrives.");
}

public void speak()
{
  grunt();
}
}