import java.util.Scanner;
public class app{
    public static void main (String[]args){
        Scanner sc=new Scanner(System.in);
        int st=sc.nextInt();
        int end=sc.nextInt();
        int count =0;
        for(int num=st;num<=end;num++){
                boolean isPrime=true;
        for(int i =2;i<=Math.sqrt(num);i++){
            if(num%i==0){
                isPrime=false;
                break;
            }
        }
        if(isPrime){
              System.out.print(num +" ");
              count++; 
             } 
        }      
    System.out.println("\nCount of prime numbers: "+count); 
    }
}
//reason for checking up to sqrt(n) in prime number checking:
//    ex-36
//     1*36
//     2*18
//     3*12
//     4*9
//     6*6
//     9*4
//     12*3
//     18*2
//     36*1
//factors got repeated after 6 which is the sqrt of 36. Hence we can check only up to sqrt(n) to find all factors of n.
// If a number n = a × b, then the factors always come in pairs. 
// If both a and b were greater than √n, their multiplication would become greater than n,
//  which is not possible because a × b = n. Therefore, at least one of the factors must be less than or equal to √n.
//   That’s why while checking if a number is prime, we only need to test divisibility up to √n.


