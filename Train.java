public class Train
{
  public void addCar(String s, Color c)
  {
    RailCar rc;
    if(s.equals("Locomotive"))
    {
      rc = new Locomotive();
      trainArray.add(rc);
    }
    if(s.equals("PassengerCar"))
    {
      rc = new PassengerCar();
      trainArray.add(rc);
    }
    if(s.equals("FreightCar"))
    {
      rc = new FreightCar();
      trainArray.add(rc);
    }
    if(s.equals("Caboose"))
    {
      rc = new Caboose();
      trainArray.add(rc);
    }
    ArrayList<RailCar> trainArray = new ArrayList<RailCar>();
  }
}

//In main method, put objects of train car types in specific order
