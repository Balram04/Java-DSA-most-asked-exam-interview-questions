//By Scanner
import java.util.*;

public class inputWithoutSize {  // Class definition
    public static void main(String[] args) {  // Main method to execute the program
        Scanner sc = new Scanner(System.in);  // Create a Scanner object to read input

        String line = sc.nextLine();     // Read full line of input
        String[] parts = line.split(" "); // Split line into parts based on space

        int[] arr = new int[parts.length];    // Create an integer array of the same length as the number of parts

        for (int i = 0; i < parts.length; i++) {    // Loop through each part and convert it to an integer
            arr[i] = Integer.parseInt(parts[i]);  // Convert string to integer
        }
           for (int num : arr) {
            System.out.print(num + " "); // Print the array elements
        }
        System.out.println("Size of array: " + arr.length); // Print the size of the array
    }
}

//By BufferReader 
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String line = br.readLine();
        String[] parts = line.split(",");    //split based on comman sepration 

        int arr[] = new int[parts.length];

        for(int i = 0; i < parts.length; i++){
            arr[i] = Integer.parseInt(parts[i]);
        }

        for(int x : arr){
            System.out.println(x);
        }
    }
}