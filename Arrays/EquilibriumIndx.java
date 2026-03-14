import java.util.*;
public class EquilibriumIndx {
    public static void main (String[]args){
        Scanner sc=new Scanner (System.in);

         String Line =sc.nextLine();

         String parts[]=Line.split(" ");
         int arr[]=new int[parts.length];

         for(int i=0;i<parts.length;i++){
            arr[i]=Integer.parseInt(parts[i]);
         }

         int totalSum=0;
         for(int x:arr){
            totalSum+=x;
         }

         int leftSum=0;
         int RightSum=totalSum;
         for(int i=0;i<arr.length;i++){
         RightSum-=arr[i];
         if(leftSum==RightSum){
            System.out.println("Equlibrium index Found");
            return;
         }
         leftSum+=arr[i];
         }
            System.out.println(" NO Equlibrium index");

    }
}