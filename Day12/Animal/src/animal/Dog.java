
package animal;


public class Dog extends Animal {
    
    //constructor
    public Dog(){
        
        // before pringitng this out we need to set our dog to an animal
        // it means that everytime that we create a constructor for Dog we need to call constructor for animal as well
        // and the code for that is -- super();
        super(15); // this suoer refenence to Animal constructor in animal class
        System.out.println("A dog has been created.");
    }
    
    // methods
    public void ruff(){
        System.out.println("The dog says ruff");
    }
    
    public void run(){
        System.out.println("A dog is running");
    }
}
