
import java.util.*;
public class prime {
    public static void main(String ags[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        boolean isprime= true;
        for(int i=2; i<=n/2; i++){
            if(n % i==0){
               isprime = false;
                break;
            }

        }
        if(isprime){

            if(n == 1){
                System.out.println("This is not a prime or not a composite number.");
        }else{
            System.out.println("This is prime number.");
        }

        }else{
            System.out.println("This is not a prime number.");
        }

    }
    
}
