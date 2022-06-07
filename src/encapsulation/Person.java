package encapsulation;

public class Person {     //private field
private int age;          //getter method
public int getage() {
	return age;
}
public void setage(int age) {
	this.age=age;
}


class main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Person p1=new Person();// create an object of person
p1.setage(24);//change age using setter
System.out.println("My agee  is"+p1.getage() );//access age using getter



	}

}}
