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


