import java.util.*;
public class Main 
{
    public static int linearSearch(int[] arr, int x) 
    {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) 
            {
                return i;
            }
        }
        return -1;
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
        int result = linearSearch(arr, x);
        
        // Output the result
        if (result == -1) {
            System.out.println("Element not found in array.");
        }
        else 
        {
            System.out.println("Element " + x + " found at index " + result + ".");
        }
    }
}
