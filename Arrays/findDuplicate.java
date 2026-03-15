import java.util.Scanner;

public class findDuplicate{
    public static void main(String[]args){
        Scanner sc =new Scanner (System.in);
        System.out.print("Enter the size of array: ");
        int size =sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter " + size + " elements:");
        for(int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }
        boolean found = false;
        int count =0;
        for(int i=0; i<size; i++){
            for(int j=i+1; j<size; j++){
                if(arr[i] == arr[j]){
                    System.out.println(arr[i]);
                    found = true;
                    count++;
                    break;
                }
            }
        }
        if(found){
             System.out.println("total duplicte elements in the array:"+count);
       } 

        if(!found){
            System.out.println("No duplicates found");
        }
        
        sc.close();
    }
}