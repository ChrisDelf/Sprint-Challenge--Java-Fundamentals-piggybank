package piggbank;

public class Dime extends Money

{
 public Dime(int amount)
  {
    super(amount); // super is what we use to grab the field from the parents
  }




// overriding abstract methods
  @Override
  public String getName()
  {
   if (amount > 1)
   {
     return amount + "Dimes";
   }
   else
   {
     return amount + "Dime";
   }
  }
 @Override
  public double getValue()
  {
    return amount * .10;
  }

}
