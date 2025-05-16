

public class Feline extends Animal //Step 5
{
  
  public void growl()
  {
    System.out.println("Grrrrrrrrrrrr");
  }

  public Feline(String food, boolean nocturnal, double aveLifeSpan) //Step 23
  {
    super(food, nocturnal, aveLifeSpan); 
    System.out.println("A feline arrives"); 
  }

  public Feline()
  {
    System.out.println("A feline arrives"); //Step 24
  }
}