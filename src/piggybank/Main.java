package piggybank;

import java.util.*;
import java.text.DecimalFormat;

public class Main
{

  public static void main(String[] args)
  {
    DecimalFormat fp = new DecimalFormat("$###,###.00");
    ArrayList<Money> piggyBank = new ArrayList<>();

    piggyBank.add(new Dollar(2));
    piggyBank.add(new Quarter(1));



    double total = 0;
    for(Money m : piggyBank)
		{
			total += m.getValue();
		}
  // print out the results;
    System.out.println();
    System.out.println();
    System.out.println("This is what is inside the piggBank" + fp.format(total));
    System.out.println();


  }

}
