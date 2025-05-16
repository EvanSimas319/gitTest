/*
 * Activity 4.9.2
 */
public class Animal
{
  private String food;
  private boolean nocturnal;
  private double aveLifeSpan;
  
  public void eat() 
  {
    System.out.println("This animal's diet consists of " + food + ".");
  }
  
  public void isNocturnal()
  {
    if (nocturnal)
      System.out.println("This animal is active at night.");
    else
      System.out.println("This animal is active during the day.");
  }
  
  public void getLifeSpan()
  {
     System.out.println("This animal's life span is " + aveLifeSpan + " years.");
  }
  
  public void sleep()
  {
    System.out.println("zzzzz");
  }

  public Animal(String food, boolean nocturnal, double aveLifeSpan) //Step 12
{
  this.food = food;
  this.nocturnal = nocturnal;
  this.aveLifeSpan = aveLifeSpan;

  
}

  public void speak()
  {
    System.out.println("The animal makes an unearthly sound.");
  }

public Animal()   //Step 12
{

}

}