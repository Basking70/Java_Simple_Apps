
package animal;

public class Animal {
    
    private int age; // VS private int age
    
    // constructors
    public Animal(int age){
       this.age =  age;
       System.out.println("Animal has been clrearet!");
    }
    
    // methods
    public void eat(){
        System.out.println("An animal is eating!");
    }
    
    // getters
    public int getAge(){
        return age;
    }

    public static void main(String[] args) {
        Animal a = new Animal(5);
        Dog d = new Dog();
        Cat c = new Cat();
        d.ruff();
        System.out.println(d.getAge());
        c.mewo();
        a.eat();
        d.eat();
        c.eat();
        d.run();
        c.prance();
        
        
        // what happends if
        
        
    }
    
} 
