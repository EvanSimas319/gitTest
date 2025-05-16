

/*
 * Activity 4.9.2
 */
public class ZooKeeperRunner
{
public static void hearTheAnimal(Animal currentAnimal)
{
  currentAnimal.speak(); //You try
}
  public static void main(String[] args)
  { 
    Animal a = new Elephant("leaves, grasses, roots", false, 60.0); //Step 1
    a.isNocturnal(); //Step 2
    //a.trumpet(); *This method only calls the animal as an elephant, not guaranteeing the animal is an elephant//Step 3
    //Animal a1 = new Animal();
    //a1.sleep();
    //Object 2a = new Animal();
    //a2.sleep();
    Object o = new Object(); //Step 9
    System.out.println(o.toString());//Step 9
    Elephant e = new Elephant("leaves, grasses, roots", false, 60.0);//Step 9
    System.out.println(e.toString());//Step 9

    Animal a3 = new Animal(); //Step 11
    System.out.println(a3.toString()); //Step 11
    
    Animal a4 = new Elephant("leaves, grasses, roots", false, 60.0); //Step 13
    System.out.println(a4.toString()); //Step 13

    //Step 15
    Object o2 = new Elephant("leaves, grasses, roots", false, 60.0);
    System.out.println(o2.toString());
  
  }
}