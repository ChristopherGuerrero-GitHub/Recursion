package recursion;

/**
 *
 * @author Christopher
 */
public class Recursion {

    public static void main(String[] args) {

        /* This program Recursion.java was created with Netbeans IDE with a 
           method countDown that is invoked recursively within the method 
           countDown itself until the base case is true.
        */
        
        System.out.println("Commencing count down.");
        countDown(10);
    }
    
    public static void countDown(int num){
        
        if(num == 0){
            
            System.out.println("Blast off!");
        }
        else{
            
            System.out.println("count is: " + num);
            countDown(num - 1);
        }
        
    }
}
