import java.util.Scanner;
public class SpaceBoxing {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double venusWeight = 0.78;
    double marsWeight = 0.39; 
    double jupiterWeight = 2.65;
    double saturnWeight = 1.17;
    double uranusWeight = 1.05;
    double neptuneWeight = 1.23;
    
    
    
    System.out.println("Please enter your current weight: ");   
        int weight = sc.nextInt();
    System.out.println("Please enter planet #. ");
        int planNumber = sc.nextInt();
        
    if (planNumber == 1) {
        System.out.println("Your weight is " + weight * venusWeight + " kilograms.");
    } else if (planNumber == 2) {
        System.out.println("Your weight is " + weight * marsWeight + " kilograms. ");  
    } else if (planNumber == 3) {
        System.out.println("Your weight is " + weight * jupiterWeight + " kilograms. ");
    } else if (planNumber == 4) {
        System.out.println("Your weight is " + weight * saturnWeight + " kilograms. ");
    } else if (planNumber == 5) {
        System.out.println("Your weight is " + weight * uranusWeight + " kilograms. ");
    } else if (planNumber == 6) {
        System.out.println("Your weight is " + weight * neptuneWeight + " kilograms. ");
    } else { 
        System.out.println("error ");
    }
  }
}    
   
        
