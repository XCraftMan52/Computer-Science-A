# Mathematics Redefined (MathRedefined.java)
### Four useful methods that exist in Java’s Math class are:

`Math.max(double a, double b)` //Returns a double value equal to the greater of the two values that it receives, a and b.

`Math.min(double a, double b)` //Returns a double value equal to the lesser of the two values that it receives, a and b.

`Math.abs(double a)` //Returns a double value equal to the absolute value of the value, a, that it receives

`Math.pow(double a, double b)` //Returns a double value equal to ab.

Although these methods may have been utilized in the past to assist with other programs, they will not be able to be used when completing this assignment. Write a program that contains custom methods to perform these actions without actually calling any of these four methods. These methods should pass the results back to your main method before they are printed. Note that they should be named differently than their default names in the Math class (for instance, name the method that returns the lowest of the two numbers provided minimum() instead of the default min()). 

At the start of your program, the user should be prompted with a choice as to which of these four operations your program executes. Once the user makes their choice, your program prompts for and outputs the proper information. Note that your program should check to make sure that they actually input one of these four choices and, if they do not, prompt the user again and not allow them to proceed until valid data is received. 

The output of your program should match the following format:
```
Welcome! This program will perform one of four operations depending on your selection (1 - 4):
1. Calculate the maximum of two numbers
2. Calculate the minimum of two numbers
3. Calculate the absolute value of a number
4. Calculate the value of a^b for any two values, a and b
Indicate your choice (1-4) below:
//user inputs 6
Invalid selection. Please indicate your choice (1-4) below:
//user inputs 1
Enter the first number: //user inputs -3.14
Enter the second number: //user inputs 2.71
The maximum of -3.14 and 2.71 is: 2.71
```