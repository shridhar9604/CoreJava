package abstraction;

public abstract class AbstractSubClassEx3 extends AbstractEx2 {
	String name, gender, city, country;

	void getname(String name) {
		this.name = name;
	}

	void getgender(String gender) {
		this.gender = gender;
	}

	void getcity(String city) {
		this.city = city;

	}

	void getcountry(String country) {
		this.country = country;
	}

	void display() {

		System.out.println("name:" + name);
		System.out.println("gender:" + gender);
		System.out.println("city:" + city);
		System.out.println("country:" + country);
	}

}
