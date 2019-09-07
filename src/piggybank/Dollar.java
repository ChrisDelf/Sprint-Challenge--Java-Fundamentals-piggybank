package piggybank;

public class Dollar extends Money

{
 public Dollar(int amount)
  {
    super(amount); // super is what we use to grab the field from the parents
  }




// overriding abstract methods
  @Override
  public String getName()
  {
   if (amount > 1)
   {
     return amount + "Dollars";
   }
   else
   {
     return amount + "Dollar";
   }
  }
 @Override
  public double getValue()
  {
    return amount * 1.00;
  }

}
