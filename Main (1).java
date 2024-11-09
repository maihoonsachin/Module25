import java.io.*;
public class Main
{
    public static int iter=0;
    public static void bubbleSort(int arr[])
    {
        for(int i=0;i<arr.length-1;i++)
        {
            for(int j=0;j<arr.length-1-i;j++)
            {
                if(arr[j]<arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    public static void bubbleSortSwaps(int arr[])
    {
        int count=0;
        for(int i=0;i<arr.length-1;i++)
        {
            int k=0;
            for(int j=0;j<arr.length-1-i;j++)
            {
                if(arr[j]<arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    k=1;
                }
            }
            if(k == 1)
            count++;
            else
            break;
        }
        System.out.println("Number of passes = "+count);
    }
    public static void selectionSort(int arr[])
    {
        int max;
        for(int i=0;i<arr.length-1;i++)
        {
            max=i;
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[max]<arr[j])
                {
                    max=j;
                }
            }
            if(i!=max)
            {
                int temp=arr[max];
                arr[max]=arr[i];
                arr[i]=temp;
            }
            iter++;
        }
    }
    public static void insertionSort(int arr[])
    {
        int key;
        for(int i=1;i<arr.length;i++)
        {
            key=arr[i];
            int j=i-1;
            while(j>=0 && key>arr[j])
            {
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
        }
    }
    public static void display(int arr[])
    {
        for(int x:arr)
        {
            System.out.print(x+" ");
        }
        System.out.println();
    }
    public static void displayNoOfIterations(int arr[])
    {
        iter=0;
        selectionSort(arr);
        System.out.println("No of iterations = "+iter);
    }
	public static void main(String[] args) 
	{
	    
	    int arr1[]={3,5,1,6,0};
		bubbleSort(arr1);
		display(arr1);
		int arr2[]={3,5,1,6,0};
		selectionSort(arr2);
		display(arr2);
		int arr3[]={3,5,1,6,0};
		insertionSort(arr3);
		display(arr3);
		int arr4[]={3,5,1,6,0};
		bubbleSortSwaps(arr4);
		int arr5[]={3,5,1,6,0};
		displayNoOfIterations(arr5);
	}
}
