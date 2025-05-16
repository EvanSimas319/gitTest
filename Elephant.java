public class Elephant extends Animal //Step 5
{
  public void trumpet() //Step 6
  {
    System.out.println("The elephant trumpets loudly.");
  }
  public Elephant(String food, boolean nocturnal, double aveLifeSpan)
  {
    super(food, nocturnal, aveLifeSpan); //Step 14
    System.out.println("An elephant arrives"); //Step 16
  }

  public Elephant()
  {
    System.out.println("An elephant arrives"); //Step 24
  }
  public void speak()
  {
    trumpet();
  }

  public String toString()
  {
    return "This is an object of the Elephant class.";
  }
}