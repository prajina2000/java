public class LaptopRunner{
	static Laptops[] laptopsData =new Laptops[10];

	 public static void main(String[] args) {
	 	

	 	Laptops laptops=new Laptops("HP",48.2f,1000,4000,256);
	 	Laptops laptops1=new Laptops("DELL",28.2f,3000,3000,256);
	 	Laptops laptops2=new Laptops("ASUS",48.2f,1000,4000,256);
	 	Laptops laptops3=new Laptops("LENOVO",28.2f,3000,3000,256);
	 	Laptops laptops4=new Laptops("ACER",48.2f,1000,4000,256);
	 	Laptops laptops5=new Laptops("APPLE",28.2f,3000,3000,256);
	 	Laptops laptops6=new Laptops("MICROSOFT",48.2f,1000,4000,256);
	 	Laptops laptops7=new Laptops("MSI",28.2f,3000,3000,256);
	 	


	 	saveLaptops(laptops);
	 	saveLaptops(laptops1);
	 	saveLaptops(laptops2);
	 	saveLaptops(laptops3);
	 	saveLaptops(laptops4);
	 	saveLaptops(laptops5);
	 	saveLaptops(laptops6);
	 	saveLaptops(laptops7);

	 	for(int i=0;i<laptopsData.length;i++){
	 		if(laptopsData[i]!=null){
	 			laptopsData[i].laptopsDetails();
	 		}
	 	}
	 	
		
	}
	public static boolean saveLaptops(Laptops laptops){
		for(int i=0;i<laptopsData.length;i++){
			if(laptopsData[i]==null){
				laptopsData[i]=laptops;
				return true;

			}
		}
		System.out.println("no space in the array");
		return false;

	}

	
}