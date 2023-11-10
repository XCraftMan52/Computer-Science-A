# Distance, Midpoint & Slope (DistanceMidpointSlope.java)

#### Recall that when we learned about the basics of Java Programming, one of the programs that you completed before even touching Dr. Java for the first time was to accurately calculate the distance between, midpoint of, and slope of a line passing through two coordinates ((x1, y1) and (x2, y2)) provided by the user.

Write a revised version of this program that performs each of these calculations within methods and returns the result of each calculation back to your main method. The following methods should be present in your program:

`double distance(double x1, double y1, double x2, double y2)` - returns the distance between two points: (x1, y1) and (x2, y2)
`double midpoint(double a, double b)` - returns the arithmetic mean (average) of two values, a and b
`double slope(double x1, double y1, double x2, double y2)` - returns the slope of a line connecting two points: (x1, y1) and (x2, y2)

Like before, the distance should be expressed as a double, the midpoint should be expressed as a coordinate (x, y), and the slope should be expressed as a double. Note that you will need to call upon your method to do the midpoint twice: once to find the midpoint of the x-coordinates and once to find the midpoint of the y-coordinates.

The output of your program should match the following format:
```
Enter the x-coordinate of the first point:
//user inputs -1 
Enter the y-coordinate of the first point: 
//user inputs 2
Enter the x-coordinate of the second point: 
//user inputs 3
Enter the y-coordinate of the second point:
//user inputs 5

The coordinates you entered are: (-1, 2) and (3, 5)
The distance between these points is: 5 units
The midpoint of these points is: (1, 3.5)
The slope of the line connecting these points is: 0.75
```