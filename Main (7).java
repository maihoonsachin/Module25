import java.util.*;
public class Main 
{
    public static boolean perfectSquare(int num)
    {
        if(num == 1 || num == 0)
        return true;
        int res=1;
        for(int i=1;i<num;i++)
        {
            res=i*i;
            if(res == num)
            {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) 
    {
        Scanner sc= new Scanner(System.in); 
        System.out.print("Enter the number : ");
        int x = sc.nextInt();
        System.out.println(perfectSquare(x));
    }
}
