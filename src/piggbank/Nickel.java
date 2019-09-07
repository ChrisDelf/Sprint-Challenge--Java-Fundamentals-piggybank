package piggbank;

public class Nickel extends Money

{
 public Nickel(int amount)
  {
    super(amount); // super is what we use to grab the field from the parents
  }




// overriding abstract methods
  @Override
  public String getName()
  {
   if (amount > 1)
   {
     return amount + "Nickels";
   }
   else
   {
     return amount + "Nickel";
   }
  }
 @Override
  public double getValue()
  {
    return amount * .05;
  }

}
