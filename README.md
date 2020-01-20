# program-1: money, money, money!
Congratulations and welcome to the software engineering world of GitHub and your first CS1 programming assignment. This readme file contains the details of the problem you are asked to solve on this assignment. Of course, you are to solve this using the Java programming language. 


5 tens
5 ones
0 quarters
2 dimes
0 nickles
4 pennies

7 tens
4 ones
0 quarters
1 dimes
0 nickels
3 pennies

Title: Money, money, money
Terms: currency format - 0 hundreds, 5 tens, 2 ones, 1 quarter, 1 dime, 0 nickels, 0 pennies
  dollar format - $52.35
  float format - 52.35
  check format - fifty two dollars and 35 cents
  
Problem: Money can be represented in various formats. For example, $52.35, fifty two dollars and thirty five cents or even 5 tens, 2 ones, 1 quarter and 10 cents. All of these formats represent the same amount, 52.35. Fast food restaurants have an ongoing challenge of training young employees how to handle dealing with money in its various formats - making change, knowing how much to charge for something, understanding the relationship between a number, like 52.35, and the various ways of representing that amount using the US monetary system. They need your help training the next generation of workers until these somewhat simplistic jobs are turned over to robots. 

1. take in the currency format, output in dollar format
2. take in the float format, output in currency format
3. take in the float format, output in check format
4. take in the amount given by the customer in either float or currency format and the cost of the transaction in float format, output the change to be given to the customer in currency format

Here is some sample test data:

currency 0 5 2 1 1 0 0

currency 3 8 0 0 99 1 3

float 427.99

float 25.33

word 32.18

word 100

change 100.00 52.17

currency 1 1 1 1 1 1 1

change 5 .99

change 100 .01

The output should be:

$52.35

$389.98

4 hundreds 2 tens 7 dollars 3 quarters 2 dimes 0 nickels 4 pennies

0 hundreds 2 tens 5 dollars 1 quarters 0 dimes 1 nickels 3 pennies

32 dollars and 18 cents

100 dollars and 0 cents

0 hundreds 4 tens 7 dollars 3 quarters 0 dimes 1 nickels 3 pennies

$111.41

0 hundreds 0 tens 4 dollars 0 quarters 0 dimes 0 nickels 1 pennies

0 hundreds 9 tens 9 dollars 3 quarters 2 dimes 0 nickels 4 pennies


- [ ] For a grade of A your program must support currency, float, change
- [ ] For a grade of B your program must support currency, float
- [ ] For a grade of C your program must support float
- [ ] For extra credit your program must support everything

