package exception;

import java.io.IOException;

public class ThrowEx1 {

	//public static void main [String( )args]
      void mymethod(int num)throws IOException,
    
      ClassNotFoundException
{
if (num==1)
	throw new IOException("Exception Massage1");
else
	throw new ClassNotFoundException("Exception Massage 2");


	}

}
