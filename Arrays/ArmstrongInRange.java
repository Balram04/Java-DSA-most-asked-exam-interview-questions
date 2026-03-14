import java.util.Scanner;

public class ArmstrongInRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int start = sc.nextInt();  // start of range
        int end = sc.nextInt();    // end of range

        for (int num = start; num <= end; num++) {
            int original = num;

            // count digits  
            int count = 0;
            int temp = num;
            while (temp != 0) {
                count++;
                temp /= 10;
            }

            // sum of powers of digits
            int sum = 0;
            temp = num;
            while (temp != 0) {
                int digit = temp % 10;
                sum += (int) Math.pow(digit, count);
                temp /= 10;
            }

            if (sum == original) {
                System.out.print(original + " ");
            }
        }

        sc.close();
    }
}
