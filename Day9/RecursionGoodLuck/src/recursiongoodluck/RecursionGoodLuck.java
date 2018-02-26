
package recursiongoodluck;

public class RecursionGoodLuck {

    //3
public static int Summation(int n){
    // we are at the end
    if(n<=0){
        return 0; // additive identent property
    }
    // recursive case  --> Keep going
    else {
        // 3 + Summation(2)
        // 3 + 2 + Summation(1)
        // 3 + 2 + 1 + Summation(0)
        // 3 + 2 + 1 + 0
        return n + Summation(n-1);
    }
}
// 5! --> 5*4*3*2*1
public static int Factorial(int n){
    // Base Cse
    if(n<=1){
        return 1;
    }
    //Recursive case
    else{
        // Factorial(4) = 4 * Factorial(3)
        // 4 * 3 * Factorial(2)
        // 4 * 3 * 2 * Factorial(1)
        // 4 * 3 * 2 * 1
        return n * Factorial(n-1);
    }
}
// 5^3 = 5*5*5
public static int Exponentiation(int n, int p){
    // Base Case
    if(p<=0){// milt identity
        return 1;
    }
    //recursive
    else{
        return n * Exponentiation(n,p-1);
    }
    
}

    public static void main(String[] args) {
        System.out.println(Summation(3));
        System.out.println(Factorial(3));
        System.out.println(Exponentiation(5,3));
        
    }
    
}
