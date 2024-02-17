import java.util.Scanner;

public class App {
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of x: ");
        double x = sc.nextDouble();
        System.out.print("Enter the value of y: ");
        double y = sc.nextDouble();
        System.out.println(/*Just an empty line*/);
        if ( x > y )
          System.out.println(x +" is bigger than " + y) ;
        else if (y > x)
          System.out.println(y +" is bigger than "+ x);
        else 
          System.out.println("Both x and y are equal");
        

    }
}

