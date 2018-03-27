import java.util.Random;

public class DiceDoubles {
    public static void main(String[] args) {
        Random rng = new Random();
        
        System.out.println("HERE COMES THE DICE! ");
        
        int A = 1 + rng.nextInt(10);
        int B = 1 + rng.nextInt(10);
       
        while(A != B){ 
            System.out.println(A + " and " + B + " and then total is " + (A + B) + " roll again... ");
            
            A = 1 + rng.nextInt(6);
            B = 1 + rng.nextInt(6); 
        } 
        System.out.println(A + " and " + B + " Doubles! With a total of " + + (A + B));
        
    } 
}
