package piggybank;

public class Penny extends Money

{
 public Penny(int amount)
  {
    super(amount); // super is what we use to grab the field from the parents
  }




// overriding abstract methods
  @Override
  public String getName()
  {
   if (amount > 1)
   {
     return amount + "Pennies";
   }
   else
   {
     return amount + "Penny";
   }
  }
 @Override
  public double getValue()
  {
    return amount * .01;
  }

}
