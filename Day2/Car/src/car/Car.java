
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
        numberOFPeopleInCar++;
    }
    
    public void getOut(){
        numberOFPeopleInCar--;
    }
    
    public double howManyMilesTillOutOfGas(){
        
        return currentFoel * mpg;
    }
    
    public double maxMilesPerFillUp(){
        return maxFoel * mpg;
    }
    public static void main(String[] args) {
        Car birtdayPresent = new Car(500, 5000.545, true);
        System.out.println("Birthday Car V1: "); 
        birtdayPresent.printVariables();
        birtdayPresent.getIn();
        birtdayPresent.getIn();
        birtdayPresent.getIn();
        System.out.println("Miles left: " + birtdayPresent.howManyMilesTillOutOfGas());
        System.out.println("Max Miles: " + birtdayPresent.maxMilesPerFillUp());
        System.out.println("Birthday Car V2: "); 
        birtdayPresent.printVariables();
        
        birtdayPresent.getOut();
        System.out.println("Birthday Car V2: ");
        birtdayPresent.printVariables();
        
//        System.out.println("Cristmas Present: ");
//        Car cristmasPresent = new Car(550, 2000, false);
//        cristmasPresent.printVariables(); 
    }
    
}
