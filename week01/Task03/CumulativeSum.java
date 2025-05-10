import java.util.Arrays;
import java.util.Scanner;

public class CumulativeSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements:");
        for(int i = 0; i < n; i++) arr[i] = sc.nextInt();

        Arrays.sort(arr);
        int sum = 0;
        System.out.println("Cumulative sum of sorted array:");
        for(int val : arr) {
            sum += val;
            System.out.print(sum + " ");
        }
    }
}

