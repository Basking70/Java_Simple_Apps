
package looppractice;

public class LoopPractice {

public static void practiceWhileLoop(){
    int x=0;
    while(x<5){
        System.out.println(" The Value of x is " + x);
        x++;
    }
    ///
    System.out.println(" The End Bitch!!");
    
}

public static void practiceDoWhileLoop(){
    int x = 0;
    do{
        System.out.println(" The Value of x is " + x);
        x++;
    }while(x<10);
}
public static void practiceForLoop(){
    for(int x=0 ; x<=20; x++){
        System.out.println(" The Value of x is " + x);
    }
}
    public static void main(String[] args) {
        practiceForLoop();
    }
    
}
