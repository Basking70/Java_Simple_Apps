
package javaapplication3;

import java.util.Random;


public class CoinToss {

    public String tossAcoin(){
        Random rand = new Random();
        //Math.abs means absolote values
        // % call Mod
        // rand.nextInt() : gives us a random number it could be negative or positive
        // Math.abs(rand.nextInt()) : makes the number possitive;
        // % 2: it means that the mod of the number from 2 could be 1 or 0 which we want
        int toss = Math.abs(rand.nextInt()) % 2;
        if(toss == 0 ){
            return "Heads";
        }else{
            return "Telse";
        }
        
    } 
    
    public static void main(String[] args) {
        CoinToss game = new CoinToss();
        for(int i = 0; i<10; i++){
            System.out.println(game.tossAcoin());
        }
        
        
    }
    
}
