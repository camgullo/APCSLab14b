// RailCar.java


import java.awt.*;


public class RailCar//This is the superclass from which the car types different types 
//of cars inherit from	
   protected Color carColor;
	protected int xPos;//X coordinate of beginning of the car
	protected int yPos;//Y coordinate of beginning of the car

  public void setxPos(int xPos)//Set method for X coordinate
  {
    this.xPos = xPos;
  }
  
  public int getxPos()//Get method for X coordinate
  {
    return xPos;
  }


	public void drawCar(Graphics g)
	{
      drawContainer(g);
      drawRailWheels(g);
      drawLink(g);
	}
   
   private void drawContainer(Graphics g)
   {
   	g.setColor(carColor);
   	g.fillRect(xPos,yPos,150,100);
   }
   
   private void drawRailWheels(Graphics g)
   {
   	g.setColor(Color.black);
		g.fillOval(xPos+5,yPos+75,50,50);
		g.fillOval(xPos+95,yPos+75,50,50);  
	}
    
   private void drawLink(Graphics g)
   {
      g.setColor(Color.black);
      g.fillRect(xPos-25,yPos+80,25,5);
   } 
}
