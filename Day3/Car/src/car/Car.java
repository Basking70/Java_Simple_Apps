
package car;


public class Car {
    
    int maxSpeed = 100;
    int minSpeed = 0;
    
    double weight = 4079;
    
    boolean isTheCarOn = false; 
    char condition = 'A';
    String nameOfCar = "Lucy";
            
    double maxFoel = 16;
    double currentFoel = 8;
    double mpg = 26.4;
    
    int numberOFPeopleInCar = 1;
    int maxNumberOFPeopleInCar = 6;
    
    public Car (){
        
        
    }
    public Car (int customMaxSpeed, double customWeight, boolean customIsTheCarOn){
        
        maxSpeed = customMaxSpeed;
        weight = customWeight;
        isTheCarOn = customIsTheCarOn;
    }   
            
    public void printVariables(){
        System.out.println("This is the Max Speed " + maxSpeed);
        System.out.println(minSpeed);
        System.out.println(weight);
        System.out.println(isTheCarOn);
        System.out.println(condition);
        System.out.println("name of car: " + nameOfCar);
        System.out.println("Number of people in the car: " + numberOFPeopleInCar);
    }
    public void  upgradeMinSpeed(){
         minSpeed = maxSpeed;
         maxSpeed++;
    }
    
    public void getIn(){
        // if there arent too many people in the car
        if(numberOFPeopleInCar < maxNumberOFPeopleInCar){
        // someone can get in
        numberOFPeopleInCar++;
        System.out.println("Someone Got In: ");
        }else{
            //otherwise print the fact that the car is full
            System.out.println("The Car Is Full!! " + numberOFPeopleInCar + " = "+ maxNumberOFPeopleInCar);
        }
    }
    
    public void getOut(){
        //if the people in the car
        if(numberOFPeopleInCar > 0){
            //then tell one person to get out
            numberOFPeopleInCar--;
        }else{
            //otherwise no one can get out and we will print that
            System.out.println("No one is in the Car!");
        }
    }
    
    public double howManyMilesTillOutOfGas(){
        
        return currentFoel * mpg;
    }
    
    public void turnTheCarOn() {
        // if the car isnt on turn it on otherwise print out the fact it's on
        if(!isTheCarOn){
           isTheCarOn = true; 
        }else{
            System.out.println("The Car Is Already On " + isTheCarOn);
        }
    }
    public double maxMilesPerFillUp(){
        return maxFoel * mpg;
    }
    public static void main(String[] args) {
        Car tommyCar = new Car();
        tommyCar.getOut();
        tommyCar.getOut();
        tommyCar.getIn();
        tommyCar.getIn();
        tommyCar.getIn();
        tommyCar.getIn();
        tommyCar.getIn();
        tommyCar.getIn();
        tommyCar.getIn();
        tommyCar.getIn();
        tommyCar.turnTheCarOn();
        tommyCar.turnTheCarOn(); 
//        System.out.println("Cristmas Present: ");
//        Car cristmasPresent = new Car(550, 2000, false);
//        cristmasPresent.printVariables(); 
    }
    
}
