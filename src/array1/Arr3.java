package array1;

import java.util.*;

public class Arr3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<String> list=new ArrayList<String>();

    list.add("shridhar");
    list.add("swapnil");
   list.add("suraj");
   list.add("nilesh");
   list.add("shridhar");
list.remove(1);
   Iterator itr  =list.iterator ();   
while(itr.hasNext())
{
System.out.println(itr.next());
	}

}
	}
