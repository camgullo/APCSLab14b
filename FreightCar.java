// FreightCar.java

import java.awt.*;


public class FreightCar extends RailCar//This class derives from RailCar
{
	public FreightCar(Color cC, int xPos, int yPos)//Constructor creates and sets position and color
	{

	{
      carColor = cC;
      this.xPos = xPos;
      this.yPos = yPos;
   }

	public void drawCar(Graphics g)
	{
		super.drawCar(g);
		drawFreightDoors(g);
	}
   
	private void drawFreightDoors(Graphics g)
	{
		g.setColor(Color.black);
		g.drawRect(xPos+30,yPos+10,90,60);
      g.drawLine(xPos+75,yPos+10,xPos+75,yPos+70);
      g.drawLine(xPos+30,yPos+10,xPos+75,yPos+70);
      g.drawLine(xPos+30,yPos+70,xPos+75,yPos+10);
      g.drawLine(xPos+75,yPos+10,xPos+120,yPos+70);
      g.drawLine(xPos+75,yPos+70,xPos+120,yPos+10);
      g.fillRect(xPos+66,yPos+35,5,15);
      g.fillRect(xPos+80,yPos+35,5,15);
	}
 }




