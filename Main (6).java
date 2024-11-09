import java.util.*;
public class Main 
{
    public static int findFirstOccurrence(int[] arr, int target) 
    {
        int left = 0, right = arr.length - 1;
        while (left <= right) 
        {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) 
            {
                if (mid == 0 || arr[mid - 1] != target) 
                {
                    return mid;
                }
                else 
                {
                    right = mid - 1;
                }
            }
            else if (arr[mid] < target) 
            {
                left = mid + 1;
            } 
            else
            {
                right = mid - 1;
            }
        }
        return -1;
    }
    public static int findLastOccurrence(int[] arr, int target) 
    {
        int left = 0, right = arr.length - 1;
        while (left <= right) 
        {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) 
            {
                if (mid == arr.length - 1 || arr[mid + 1] != target) 
                {
                    return mid;
                } 
                else 
                {
                    left = mid + 1;
                }
            }
            else if (arr[mid] < target)
            {
                left = mid + 1;
            } 
            else 
            {
                right = mid - 1;
            }
        }
        return -1;
    }
    public static void countOccurrences(int[] arr, int target)
    {
        int firstIndex = findFirstOccurrence(arr, target);
        if (firstIndex == -1)
        {
            System.out.println("Target " + target + " not found in the array.");
            return;
        }
        int lastIndex = findLastOccurrence(arr, target);
        int count = lastIndex - firstIndex + 1;
        System.out.println("Target " + target + " occurs " + count + " times.");
    }
    public static void main(String[] args) 
    {
        Scanner sc= new Scanner(System.in); 
        System.out.print("Enter the number of elements you want to add : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) 
        {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the element to be searched in the array : ");
        int x = sc.nextInt();
        countOccurrences(arr,x);
    }
}
