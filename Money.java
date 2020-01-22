/********
 Author:
 Program: Money class - program assignment #1
 Due Date:
 Purpose:
 ********/

import java.util.*;
import java.text.*;

public class Money
{
    // declare class variables
    double total; // used to store the Money value as a double precision floating point number like 34.2
    // you will need more variables declared here to handle each of the currency types; for example int hundreds to keep track of how many hundred dollar bills 
    
    // this one will help you print floating point values in US currency format like $10.50
    NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.US);

    // convert current currency values to a string
    public String toString()
    {
    }

    // converts amount to US currency format
    public String toCurrency(double amount)
    {
      return nf.format(Math.round(amount * 100.0) / 100.0);
    }
    
    // convert currency to float
    // read currency values from Scanner s and compute value
    // output results
    public void processChange(Scanner s)
    {
    }

    // read from Scanner s and process float command
    // convert float to change
    // output results
    public void processFloat(Scanner s)
    {
    }

    // read from Scanner s and process check command
    // convert float to dollar words & cents
    // output results
    public void processCheck(Scanner s)
    {

    }

    // read from Scanner s and process change-float command
    // read float of customer payment
    // read float of transaction cost
    // calculate difference and compute change values
    // output the results
    public void processChangeFloat(Scanner s)
    {

    }

    // read from Scanner s and process change-change command
    // read change of customer payment
    // read float of transaction cost
    // calculate difference and compute change values
    // output the results
    public void processChangeChange(Scanner s)
    {

    }
}
