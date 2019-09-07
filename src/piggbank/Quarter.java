package piggbank;

public class Quarter extends Money

{
 public Quarter(int amount)
  {
    super(amount); // super is what we use to grab the field from the parents
  }




// overriding abstract methods
  @Override
  public String getName()
  {
   if (amount > 1)
   {
     return amount + "Quarters";
   }
   else
   {
     return amount + "Quarter";
   }
  }
 @Override
  public double getValue()
  {
    return amount *  .25;
  }

}
