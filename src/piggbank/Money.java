package piggbank;


public abstract class Money
{
  //flieds
  public String name;
 // contructor
  public Money(String name)
  {
    this.name = name;
  }
  //abstractmethods
  public abstract double getValue();

}
