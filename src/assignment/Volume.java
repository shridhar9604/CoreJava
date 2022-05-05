package assignment;

public class Volume {
public int volume (int s)

{
	int volc=s*s*s;
	return volc;
}
public int volume (int l, int b, int h)

{
	int volcb=l*b*h;
	return volcb;
}
public double volume (double r)

{
	double vols=(4/3)*3.14*r*r*r;
	return vols;
}	
	
	
	public static void main(String[] args) {
	Volume obj=new Volume();	
System.out.println(obj.volume(3));
System.out.println(obj.volume(3,4,5));
System.out.println(obj.volume(5.4));
	}
}
