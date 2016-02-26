public class Train
{
  public void addCar(String s, Color c)
  {
    RailCar rc;
    if(s == "Locomotive")
    {
      rc = new Locomotive();
    }
    
    if(s == "PassengerCar")
    {
      rc = new PassengerCar();
    }
    if(s == "FreightCar")
    {
      rc = new FreightCar();
    }
    if(s== "Caboose")
    {
      rc = new Caboose();
    }
    
  }
}
