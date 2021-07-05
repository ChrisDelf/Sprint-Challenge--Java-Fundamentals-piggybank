package piggybank;

import java.util.*;
import java.text.DecimalFormat;

public class Main
{

  public static void main(String[] args)
  {
    DecimalFormat fp = new DecimalFormat("$###,###.00");
    ArrayList<Money> piggyBank = new ArrayList<>();

      piggyBank.add(new Quarter(1));

      piggyBank.add(new Dime(1));

       piggyBank.add(new Dollar(5));

      piggyBank.add(new Nickel(3));

      piggyBank.add(new Dime(7));

      piggyBank.add(new Dollar(1));

      piggyBank.add(new Penny(10));


    double total = 0;
    for(Money m : piggyBank)
		{
			total += m.getValue();
		}
  // print out the results;
    System.out.println();
    System.out.println();
    System.out.println("The piggy bank holds " + fp.format(total));
    System.out.println();

  // print out what is inside of the piggyBank
    for(Money m : piggyBank)
		{
			double value = m.getValue();
			System.out.println(m.getName() + ": " + fp.format(value));
		}


  }

}
