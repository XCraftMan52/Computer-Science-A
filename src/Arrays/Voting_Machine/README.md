**Voting Machine (VotingMachine.java)** - In a political election where competing candidates are running for office, voting machines are used to count ballots and tally the results of the ballots submitted to determine the winner. Your task will be to write a program that simulates a voting machine using an array to keep track of the number of votes for each candidate. 

To accomplish this, start by making an array of type String representing the names of the candidates. There should be at least 3 candidates running for a particular political office; you can make up the names of the candidates and the position for which they are competing. 

Your program should then repeatedly prompt the user to enter a number, 0 to (n-1), where n is the number of candidates, to cast a vote for the corresponding candidate. Keep track of the number of votes that a candidate receives in an array of type int, with the indices of the array corresponding to the number designated to each campaigning candidate. Any invalid votes not within this range should be discarded. 

Your program should implement a flag to trigger the end of the voting process. In computer programming, a flag is a hardcoded value that falls well outside of the range of expected inputs, but will result in your program performing some operation. For example, you can have the user enter a value such as -999 to end the voting process. 

Once the polling has terminated, your program should display the total number of votes as well as the percentage of the total votes that each candidate received. You can use the percentage method that you created in previous programs to assist with this. After that, your program should display the name(s) of the candidate(s) that received the highest number of votes. It is acceptable for your election to end in a tie; it is not the job of a voting machine to break ties.

The output of your program should match the following format:
```Happy Election Day! Here are the candidates running for the head of the Cumberland Java Society: 
0:	Mark Zuckerberg
1: 	Jeff Bezos
2: 	Elon Musk
3: 	Marissa Mayer
Cast your votes below (enter -999 to stop):

/*user inputs the following values in order: 3, 0, 1, 7, 2, 1, 2, 2, 2, 0, 2, 3, 0, 3, 0, 2, 2, 1, 0, 2, 0, 1, 1, 1, -5, 2, 3, 2, 0, 0, -999*/

The results are in!
Mark Zuckerberg: 8 vote(s) (28.56%)
Jeff Bezos: 6 votes(s) (21.42%)
Elon Musk: 10 vote(s) (35.71%)
Marissa Mayer: 4 vote(s) (14.28%)

/*Note that in the example above, there were 28 valid votes counted and used to calculate the percentages of votes received*/

Election Winner(s):
Elon Musk
```
As an optional extra challenge, you can also try to modify your program such that it prints out the results of the voting in order from most number of votes received to least number of votes received. Be warned that this is fairly challenging!
