// Locomotive.java

import java.awt.*;


public class Locomotive extends RailCar//This class derives from RailCar
{
	public Locomotive(Color cC, int xPos, int yPos)//Constructor creates and sets position and color
	{

	{
      carColor = cC;
      this.xPos = xPos;
      this.yPos = yPos;
   }

	public void drawCar(Graphics g)
	{
		super.drawCar(g);
		drawScoop(g);
		drawFunnel(g);
	}

	private void drawScoop(Graphics g)
	{
		Polygon scoop = new Polygon();
		scoop.addPoint(xPos,yPos+50);
		scoop.addPoint(xPos,yPos+100);
		scoop.addPoint(xPos-50,yPos+100);
	   g.setColor(Color.black);
	   g.fillPolygon(scoop);
	}

	private void drawFunnel(Graphics g)
	{
		Polygon funnel = new Polygon();
		funnel.addPoint(xPos+20,yPos);
		funnel.addPoint(xPos+20,yPos-30);
		funnel.addPoint(xPos,yPos-50);
		funnel.addPoint(xPos,yPos-60);
		funnel.addPoint(xPos+60,yPos-60);
		funnel.addPoint(xPos+60,yPos-50);
		funnel.addPoint(xPos+40,yPos-30);
		funnel.addPoint(xPos+40,yPos);
	   g.setColor(Color.black);
	   g.fillPolygon(funnel);
	}
}



