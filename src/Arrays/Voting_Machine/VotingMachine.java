package Arrays.Voting_Machine;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class VotingMachine {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        NumberFormat myFormatter = new DecimalFormat("#.##");

        System.out.println("Happy Election Day! Here are the canidates running fot the head of the Cumberland Java Society:");
        String[] canidates = {"Avi", "Skirka", "Mr. R", "Georgio"};
        for (int i = 0; i < canidates.length; i++) {
            System.out.println((i + 1) + ":  " + canidates[i]);
        }
        System.out.println("Cast your votes below (enter -999 to stop)");
        int[] votes = new int[canidates.length];
        int vote = input.nextInt();
        while (vote != -999) {
            if (vote < 1 || vote > (int) canidates.length) {
                System.out.println("Invalid input. Please enter a value 1-4." + canidates.length);
            } else votes[vote - 1]++;
            vote = input.nextInt();
        }
        int totalVotes = 0;
        for (int i = 0; i < votes.length; i++) {
            totalVotes += votes[i];
        }        
        System.out.println("The results are in!");
        for (int i = 0; i < canidates.length; i++) {
            System.out.println(canidates[i] + ": " + votes[i] + " vote(s) " + "(" +  myFormatter.format(((double)votes[i] / totalVotes)*100) + "%)");
        }
        input.close();
    }
}
