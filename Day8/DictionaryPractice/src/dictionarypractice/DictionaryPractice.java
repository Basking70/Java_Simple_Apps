
package dictionarypractice;

import java.util.HashMap;
import java.util.Map;


public class DictionaryPractice {


    public static void main(String[] args) {
        // English to Spanish Dictionary
        Map<String,String> englSpanDictionary = new HashMap<String,String>();
        //inserting things in our Dictionary
        englSpanDictionary.put("Monday","Lunes");
        englSpanDictionary.put("Tuseday","Mice");
        englSpanDictionary.put("Wendesday","Juves");
        englSpanDictionary.put("thursday","Piperr");
        englSpanDictionary.put("Friday","Viven");
        // retriving things from our Dictionary
        System.out.println(englSpanDictionary.get("Monday"));
        System.out.println(englSpanDictionary.get("Tuseday"));
        System.out.println(englSpanDictionary.get("Wendesday"));
        System.out.println(englSpanDictionary.get("thursday"));
        System.out.println(englSpanDictionary.get("Friday"));
        // Print all Keys
        System.out.println(englSpanDictionary.keySet());
        // Print all Values
        System.out.println(englSpanDictionary.values());
        // pritn Size
        System.out.println("This size of our Dictionary " + englSpanDictionary.size());
        
        System.out.println();
        System.out.println();
        System.out.println();
        
        // Shopping List
        Map<String,Boolean> shoppingList = new HashMap<String,Boolean>();
        // put something in the Shopping List
        shoppingList.put("Ham", true);
        shoppingList.put("Bread", Boolean.TRUE);
        shoppingList.put("Oreas",Boolean.TRUE);
        shoppingList.put("eggs",Boolean.FALSE);
        shoppingList.put("Suger",false);
        // retrive items
        System.out.println(shoppingList.get("Ham"));
        System.out.println(shoppingList.get("Shuger"));
        //key-vale pairs print out
        System.out.println(shoppingList.toString());
        //clear our dictoroy
        //shoppingList.clear();
        System.out.println(shoppingList.toString());
        /// is empty
        System.out.println(shoppingList.isEmpty());
        shoppingList.remove("eggs");
        System.out.println(shoppingList.toString());
        
        
    
    
    }   
    
    
}
