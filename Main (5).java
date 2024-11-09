import java.util.*;
public class Main 
{
    public static int totalNoOfOnes(int[] arr) 
    {
        int sum=0;
        for (int i=0; i<arr.length;i++)
        {
            sum+=arr[i];
        }
        return sum;
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
        // System.out.print("Enter the element to be searched in the array : ");
        // int x = sc.nextInt();
        int result = totalNoOfOnes(arr);
        System.out.println(result);
      
    }
}
