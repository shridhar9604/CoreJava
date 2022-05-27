package inheritance;

public class Car1 {
public Car1() {
	System.out.println("name of class car");
}

	
    public void  vehicleType() {
	System.out.println("vehicle Type :car");
    }
}
class Maruti extends Car1{
	public Maruti() {
		System.out.println("name of class maruti");
	}

		public void Brand() {
			System.out.println("Brand: maruti");
		}
		

				public void speed1() {
					System.out.println("max speed 90 kmph");
	}
				}
				class Maruti800 extends Maruti{
					public Maruti800() {
						System.out.println("name of class maruti800");
					}
				
					public void speed2() {
						System.out.println("max speed 80 kmph");
						}
					
	
	}
	


