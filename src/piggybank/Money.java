package piggybank;


public abstract class Money
{
//   //fields

     public int amount;
//  // contructor
 public Money(int amount)
 {
   this.amount = amount;
 }

 public Money()
 {
   this.amount += 1;
 }

  //abstractmethods
  public abstract double getValue();
  public abstract String getName();

}
