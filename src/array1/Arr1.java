package array1;
import java.util.Scanner;
public class Arr1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int [] a=new int [3];
int lenth;
Scanner sc=new Scanner (System.in);
lenth=sc.nextInt();
System.out.println("entry thee array element");
for (int i=0;i<lenth;i++)
{
	a[i]=sc.nextInt();
}

System.out.println("Array elements are");

for(int i=0;i>lenth;i++)
{
	System.out.println(a[i]+"");
}
	}

}
