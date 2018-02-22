
package arraypractice;

import java.lang.reflect.Array;
import java.util.Arrays;


public class ArrayPractice {

    public static void printArray(int[] array){
        
        System.out.print("[");
        for(int i=0; i<array.length; i++){
            int item = array[i];
            System.out.print(item);
            if(i < array.length - 1){
               System.out.print(", "); 
            }
            
        }
        System.out.println("]");
    }
   
    public static void printArray(String[] array){
        
        System.out.print("[");
        for(int i=0; i<array.length; i++){
            String item = array[i];
            System.out.print(item);
            if(i < array.length - 1){
               System.out.print(", "); 
            }
            
        }
        System.out.println("]");
    }
        
    public static void main(String[] args) {
      
       
      //Declaring, Allocating and Initiating
      int[] intArray1;
      int[] intArray2 = new int [4];
      printArray(intArray2);
      int[] intArray3 = {5,2,4,2,8};
      
      String[] shoppingList = {"Bannana", "Apples", "pears"};
      
      
      intArray2[0] = 10;
      intArray2[1] = 8;
      intArray2[2] = 5;
      intArray2[3] = 10;
      
      System.out.println(Array.get(intArray2,3));
      // custom print array
      printArray(intArray2);
      printArray(intArray3);
      
      // print our arrays
      System.out.println(Arrays.toString(intArray2));
      System.out.println(Arrays.toString(intArray3));
      
      // Given functions
      Arrays.sort(intArray3);
      System.out.println("Sorted array 3");
      printArray(intArray3);
      
      
      // Print String Array
      printArray(shoppingList);
      
     //Special for Loop
     for(String s: shoppingList){
         System.out.print(s + ", ");
     }
    }
    
}
