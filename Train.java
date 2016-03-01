import java.awt.*;
import java.applet.*;
import java.util.ArrayList;


public class Train
{
  ArrayList<RailCar> railCars = new ArrayList<RailCar>();
  int lastX;
  int yPos = 150;
 
  
  public void addCar(String s, Color c)
  {
    
    RailCar rc;     
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
  
   public void insertCar(int loc, String s, Color c)
   {
    
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
  
   
   public void addCar(int loc, String s, Color c)
    {
      RailCar currentCar = railCars.get(loc);
      int xPosCurrent = currentCar.getxPos();
      int lastXold = lastX;
      lastX = xPosCurrent;
      insertCar(loc,s,c);
      
      for(int k = loc + 1; k < railCars.size(); k++)
      {
         RailCar locCar = railCars.get(k);
         int x = locCar.getxPos(); 
         x += 175;
         locCar.setxPos(x);               
      }
      lastX = lastXold + 175;
    
    }
  
   public Train(int xStart, int yStart)//Constructors initialize these variables
   {
      lastX = xStart;
      yPos = yStart;     
   }
   
   public void showCars(Graphics g)
   {
      for(RailCar r : railCars)
      {
         r.drawCar(g);
      }
   }
   
}
