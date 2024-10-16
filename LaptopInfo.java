public class LaptopInfo
{
	public static void main(String[] args)
	{
	Laptop lap=new Laptop("apple",12.9f,3000,128);
	Laptop lap1=new Laptop("acer",14.6f,5000,256);
	Laptop lap2=new Laptop("dell",13f,11200,512);
	Laptop lap3=new Laptop("Lenovo",11.2f,8600,128);
	Laptop lap4=new Laptop("vivobook",10.1f,10050,256);
	Laptop lap5=new Laptop("hp",11f,8600,128);
	Laptop lap6=new Laptop("Asus",9.7f,5900,512);
	Laptop lap7=new Laptop();
	Laptop lap8=new Laptop();
	Laptop lap9=new Laptop();
	lap.printDetails();
	lap1.printDetails();
	lap2.printDetails();
	lap3.printDetails();
	lap4.printDetails();
	lap5.printDetails();
	lap6.printDetails();
	lap7.printDetails();
    lap8.printDetails();
    lap9.printDetails();
}
}