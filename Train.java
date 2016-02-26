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
    
  }
}
