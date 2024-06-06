package Final_Project;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public final class Utils {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_GREEN_BG = "\u001B[42m";
    public static final String ANSI_YELLOW_BG = "\u001B[43m";

    public static void clearScreen() {
        // System.out.print("\033[H\033[2J");
        System.out.flush();
    }
    public static void printGreenBg(String text) {
        System.out.print(ANSI_GREEN_BG + text + ANSI_RESET);
    }
    public static void printYellowBg(String text) {
        System.out.print(ANSI_YELLOW_BG + text + ANSI_RESET);
    }
    public static String getRandomWordFromFile(int numLetters, String filePath) {
        try {
            if (filePath.isEmpty()) {filePath = "words.txt";}
            String fileName = new String(filePath);
            File inFile = new File(fileName);
            Scanner textInput = new Scanner(inFile);
            int numLines = 0;
            while (textInput.hasNextLine()) {
                numLines++;
                textInput.nextLine();
            }
            textInput.close();
            textInput = new Scanner(inFile);
            int randomLine = (int) (Math.random() * numLines);
            for (int lineCount = 0; lineCount < randomLine; lineCount++) {
                textInput.nextLine();
            }
            String randomWord = textInput.nextLine();
            while (randomWord.length() != numLetters) {
                randomLine = (int) (Math.random() * numLines);
                textInput = new Scanner(inFile);
                for (int lineCount = 0; lineCount < randomLine; lineCount++) {
                    textInput.nextLine();
                }
                randomWord = textInput.nextLine();
            }
            textInput.close();
            return randomWord;
        } catch (IOException e) {
            System.out.println("Error reading file.");
            return null;
        }
    }
    public static void displayBoard(ArrayList<Word> guesses, int length, int numRows) {
        int numGuesses = guesses.size();
        for (int i = 0; i < numGuesses; i++) {
            for (int j = 0; j < length; j++) {
                if (guesses.get(i).getLetter(j).isCorrectIdx()) {
                    System.out.print(ANSI_GREEN_BG + guesses.get(i).getLetter(j).getCharector() + " " + ANSI_RESET);
                } else if (guesses.get(i).getLetter(j).isInWord()) {
                    System.out.print(ANSI_YELLOW_BG + guesses.get(i).getLetter(j).getCharector() + " " + ANSI_RESET);
                } else {
                    System.out.print(guesses.get(i).getLetter(j).getCharector() +" ");
                }
            }
            System.out.println();
        }
        for (int i = 0; i < numRows - guesses.size(); i++) {
            for (int j = 0; j < length; j++) {
                    System.out.print("_ ");
            }
            System.out.println();
        }
    }
    public static void guessWord(ArrayList<Word> guesses, Word word, String guess) {
        Word guessWord = new Word(guess);
        guesses.add(guessWord);
        //change the letter properties based on the guess
        for (int i = 0; i < word.getLength(); i++) {
            if (word.getLetter(i).getCharector().equals(guess.substring(i, i + 1))) {
                guesses.get(guesses.size()-1).getLetter(i).setCorrectIdx(true);
            }
            if (word.getWord().contains(guess.substring(i, i + 1))) {
                guesses.get(guesses.size()-1).getLetter(i).setInWord(true);
            }
        }
    }
    
}
