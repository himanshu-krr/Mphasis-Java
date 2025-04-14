package Constructor;

public class Car {
	String model;
	String brand;
	int price;
	
	public Car()
	{
		model = "Unknown";
		brand = "Unknown";
		price = 0;
		
	}
	
	public Car(String modelName, String brandName, int carPrice)
	{
		model = modelName;
		brand = brandName;
		price = carPrice;
	}
	
	public void displayDetails()
	{
		System.out.println(model);
		System.out.println(brand);
		System.out.println(price);
	}

	public static void main(String[] args) {
		Car c = new Car();
		c.displayDetails();
		
		Car c1 = new Car("X1", "BMW", 50000000);
		c1.displayDetails();
	}

}
