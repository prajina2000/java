public class Laptops{

	String brandName;
	float displaySize;
	int batteryCapacity;
	int price;
	int storage;


	public Laptops(){
		System.out.println("no param constructor");
	}

	public Laptops(String brandName,float displaySize,int batteryCapacity,int price,int storage){

		this.brandName=brandName;
		this.displaySize=displaySize;
		this.batteryCapacity=batteryCapacity;
		this.price=price;
		this.storage=storage;
	}

	public void laptopsDetails(){
		System.out.println("Brand name :"+brandName);
		System.out.println("displaySize :"+displaySize);
		System.out.println("batteryCapacity :"+batteryCapacity);
		System.out.println("price :"+price);
		System.out.println("storage :"+storage);
		System.out.println("------------------------------------");
	}
	
}