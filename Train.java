import java.awt.*;
import java.applet.*;
import java.util.ArrayList;


public class Train
{
  ArrayList<RailCar> railCars = new ArrayList<RailCar>();
  int lastX;//X - Coordinate of right side of the last car
  int yPos = 150;//Y coordinate remains constant
  
  /* The addCar function adds a car after the current last car (to the end of the train).*/
  public void addCar(String s, Color c)//Initial, two parameter addCar method
  {
    //The if blocks below are responsible for adding the correct type car based on the entered string 
    // parameter of the created object in the runner class   
    RailCar rc;//RailCar object is used to place the appropriate type of car into the array based on 
                 //the objects created in the runner class   
    if(s.equals("Locomotive"))
    {
      rc = new Locomotive(c,lastX, yPos);
      railCars.add(rc);
    }
    else if(s.equals("PassengerCar"))
    {
      rc = new PassengerCar(c,lastX,yPos);
      railCars.add(rc);
    }
    else if(s.equals("FreightCar"))
    {
      rc = new FreightCar(c,lastX,yPos);
      railCars.add(rc);
    }
    else if(s.equals("Caboose"))
    {
      rc = new Caboose(c,lastX,yPos);
      railCars.add(rc);
    }
    
    lastX += 150 + 25;//Car length plus link length
   }
  
   /*Inserts passenger/freight cars at specified locations for 100pt version*/
   public void insertCar(int loc, String s, Color c)
   {
    //The if blocks below are responsible for inserting the correct car based on the entered string parameter of the created object in the runner class
    RailCar rc;     
    if(s.equals("Locomotive"))
    {
      rc = new Locomotive(c,lastX, yPos);
      railCars.add(loc,rc);
    }
    else if(s.equals("PassengerCar"))
    {
      rc = new PassengerCar(c,lastX,yPos);
      railCars.add(loc,rc);
    }
    else if(s.equals("FreightCar"))
    {
      rc = new FreightCar(c,lastX,yPos);
      railCars.add(loc,rc);
    }
    else if(s.equals("Caboose"))
    {
      rc = new Caboose(c,lastX,yPos);
      railCars.add(loc,rc);
    }
    
   }
  
   /*Overloaded addCar method which takes in 3 parameters - The location, type, and color of the car */
   public void addCar(int loc, String s, Color c)
   {
      RailCar currentCar = railCars.get(loc);//Getting the current car at the appropriate locaton
      int xPosCurrent = currentCar.getxPos();//X coordinate of the current ca
      int lastXold = lastX;
      lastX = xPosCurrent;
      insertCar(loc,s,c);
      
      //The X coordinate of all the cars from this point until the last car have to be 
      //shifted by the length of the car plus the link
      for(int k = loc + 1; k < railCars.size(); k++)
      {
         RailCar locCar = railCars.get(k);//Car at location k
         int x = locCar.getxPos();//Current X coordinate of that car 
         x += 175;//Increment X coordinate by length of the car
         locCar.setxPos(x);               
      }
      lastX  = lastXold + 175;//lastX is incremented by 1 carlength    
    }
  
   public Train(int xStart, int yStart)//Constructors initialize these variables
   {
      lastX = xStart;
      yPos = yStart;     
   }
   
   public void showCars(Graphics g)//Carries out polymorphic drawcar(g) method for all cars in the Railcar arraylist
   {
      for(RailCar r : railCars)
      {
         r.drawCar(g);
      }
   }
   
}
