import java.util.*;

public class rotate {
    public static int[] Swap(int arr[], int i, int j) {
        while (j>i) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Size of array");
        int size = sc.nextInt();

        System.out.println("elements of array");
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("number of rotation");
        int k = sc.nextInt();
        sc.close();

        k = k % size;   // handle k > size

        // Right rotation using reverse
        Swap(arr, 0, size - k - 1);
        Swap(arr, size - k, size - 1);
        Swap(arr, 0, size - 1);

        for (int x = 0; x < size; x++) {
            System.out.print(arr[x] + " ");
        }
    }
}