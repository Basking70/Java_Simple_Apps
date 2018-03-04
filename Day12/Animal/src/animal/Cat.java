
package animal;

public class Cat extends Animal{
    
    //constractor
    
    public Cat(){
        super(7);
        System.out.println("A cat has been created!");
    }
    
    // methods
    public void mewo(){
      System.out.println("A Cat mewo!");  
    }
    
    public void prance(){
        System.out.println("A Cat is pranceing");
    }
}
