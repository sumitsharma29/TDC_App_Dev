import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements:");
        for(int i = 0; i < n; i++) arr[i] = sc.nextInt();

        Arrays.sort(arr);
        System.out.print("Enter target value: ");
        int target = sc.nextInt();

        int left = 0, right = n - 1, mid, index = -1;
        while(left <= right) {
            mid = (left + right) / 2;
            if(arr[mid] == target) {
                index = mid;
                break;
            }
            if(arr[mid] < target) left = mid + 1;
            else right = mid - 1;
        }

        if(index != -1) System.out.println("Target found at index: " + index);
        else System.out.println("Target not found.");
    }
}

