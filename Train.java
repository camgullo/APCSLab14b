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
    if(s.equals("PassengerCar"))
    {
      rc = new PassengerCar(c,lastX,yPos);
      railCars.add(rc);
    }
    if(s.equals("FreightCar"))
    {
      rc = new FreightCar(c,lastX,yPos);
      railCars.add(rc);
    }
    if(s.equals("Caboose"))
    {
      rc = new Caboose(c,lastX,yPos);
      railCars.add(rc);
    }
    
    lastX += 150 + 25;//Car length plus link length
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
