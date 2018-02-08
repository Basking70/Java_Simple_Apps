package guessthenumber;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {

    int theNUMBER;
    int max;
    Scanner scanner = new Scanner(System.in); // basically it allows us that the user input with keyboard
    //constractor

    //Getter and setter
    public int getMax(){
        return this.max;
    }
    public void setMax(int newMax){
        this.max = newMax;
    }
    
    public void setTheNumber(int newNumber){
        this.theNUMBER = newNumber;
    }
    
    public GuessTheNumber() {
        Random rand = new Random();
        // max = 100;
        setMax(100);
        
        //theNUMBER = Math.abs(rand.nextInt()) % (max + 1);
        setTheNumber(Math.abs(rand.nextInt()) % (getMax() +1));
        
    }

    public void play() {
        while (true) {
            int move = scanner.nextInt();
            if (move > theNUMBER) {
                System.out.println("Your number is too big");
            } else if (move < theNUMBER) {
                System.out.println("Your number is too small");
            } else {
                System.out.println("You got it BRO");
                break;
            }
        }
    }

    public static void howBigIsMyNumber(int x) {
        if (x >= 0 && x <= 10) {
            System.out.println("Our Number is pretty small");
        } else if (x >= 11 && x <= 100) {
            System.out.println("Our Number is pretty big");
            //Otherwise if the two conditions didnt happen
        } else {
            System.out.println("Our Number is Out Of Range");
        }
    }

    public static void main(String[] args) {
        GuessTheNumber gussGame = new GuessTheNumber(); 
        System.out.println("Welcome to my game. Try and Guess my impossible " + 
                "number. It's between 0 and " + gussGame.getMax() + 
                " inclisive. Just type a number to get Started.");
        gussGame.play();
        
    }

}
