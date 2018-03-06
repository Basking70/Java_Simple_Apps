
package arraylist;

import java.util.Scanner;

public class ArrayList {

    public int[] items = new int[8];
    public int size = 0;
    public boolean contune = true;
    public int index = 0;
    
    //getters
    public int size(){
        return size;
    }
    public int index(){
        return index;
    }
    //methods
    public void set(int index, int item){
        // carefull about out banders
        if(index < 0 || index >= size){
            throw new ArrayIndexOutOfBoundsException(index);
        }
        items[index] = item;
    }
    
    // make sure the extra capacity
    public void append(int item){
        ensureExtraCapacity();
        items[size] = item;
        size++;
    }
    
    private void ensureExtraCapacity(){
        if(size == items.length ){ // if the current array is full then create another array with double size
            int[] copy = new int [size*2];
            System.arraycopy(items, 0, copy, 0, size); // copy all the elements over
            items = copy;
            
        }
    }
    
    public int get(int index){
                // carefull about out banders
        if(index < 0 || index >= size){
            throw new ArrayIndexOutOfBoundsException(index);
        }
        return items[index];
    }
    public static void main(String[] args) {
        
    }
    
}
