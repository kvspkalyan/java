import java.util.*;
class Decimaltohexa
{
    public static void main(String args[])
    {
    	char ch[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
	int rem,num;
	String hexadecimal=""; 
        Scanner s = new Scanner(System.in);   
        System.out.println("Enter a Decimal number: ");
        num=s.nextInt();
        System.out.println("Hexadecimal number is : ");
        while(num != 0)
        {
	rem=num%16;
	hexadecimal= ch[rem] + hexadecimal;
               num= num/16;
        }   
       System.out.print(hexadecimal);   
    }
}