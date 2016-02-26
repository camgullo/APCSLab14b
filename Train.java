public class Train
{
  public void addCar(String s, Color c)
  {
    RailCar rc;
    if(s.equals("Locomotive"))
    {
      rc = new Locomotive();
      railCars.add(rc);
    }
    if(s.equals("PassengerCar"))
    {
      rc = new PassengerCar();
      railCars.add(rc);
    }
    if(s.equals("FreightCar"))
    {
      rc = new FreightCar();
      railCars.add(rc);
    }
    if(s.equals("Caboose"))
    {
      rc = new Caboose();
      railCars.add(rc);
    }
    ArrayList<RailCar> railCars = new ArrayList<RailCar>();
    
  }
}

//In main method, put objects of train car types in specific order
