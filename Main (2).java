import java.io.*;
public class Main
{
    public void decimalToBinary(int number)
    {
        if (number == 0) 
        {
            System.out.println("0");
            return;
        }
        StringBuilder binaryRepresentation = new StringBuilder();
        while (number > 0) {
            int remainder = number % 2; 
            binaryRepresentation.append(remainder); 
            number = number / 2; 
        }
        binaryRepresentation.reverse();
        System.out.println(binaryRepresentation.toString());
    }
    public boolean power(int num)
    {
        int k=0;
        if(num == 0)
        return false;
        for(int i=1;i<=num;)
        {
            i=i*2;
            if(i == num)
            {
                k=1;
                break;
            }
        }
        if(k==1)
        return true;
        else
        return false;
    }
    public void checkOddOrEven(int number) {
        if ((number & 1) == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");   
        }
    }
     public static int countSetBits(int n) 
     {
        int count = 0;
        while (n > 0) 
        {
            n = n & (n - 1);
            count++; 
        }
        return count;
    }
    public int findOddOccurringElement(int[] arr) {
        int result = 0;
        for (int num : arr) 
        {
            result ^= num;  // XOR the current number with the result
        }
        return result;
    }
	public static void main(String[] args) 
	{
	    Main obj=new Main();
	    obj.decimalToBinary(5);
	    System.out.println(obj.power(12));
	    obj.checkOddOrEven(15);
	    System.out.println(obj.countSetBits(12));
	    int arr[]={4, 3, 6, 2, 6, 4, 2, 3, 4, 3, 3};
	    System.out.println(obj.findOddOccurringElement(arr));
	}
}
