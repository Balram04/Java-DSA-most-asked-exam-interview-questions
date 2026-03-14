import java.util.*;

public class ParkingLot {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int r = sc.nextInt();
        int c = sc.nextInt();

        int[][] arr = new int[r][c];

        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        int maxCount = 0;
        int rowIndex = 0;

        for(int i = 0; i < r; i++){

            int count = 0;

            for(int j = 0; j < c; j++){
                if(arr[i][j] == 1){
                    count++;
                }
            }

            if(count > maxCount){
                maxCount = count;
                rowIndex = i + 1; // row number
            }
        }

        System.out.println("Row " + rowIndex + " have maximum number of 1");
    }
}