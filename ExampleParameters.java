public class ExampleParameters
{
	public static void main(String[] args) {
		emails(101,"hello world");
		emails(232,"welcome");
		emails(321,"thank you");



		phoneCall(96567898,"maya",91);
		phoneCall(7898897,"sachi",81);
		phoneCall(968098,"manu",01);


		logIn("praji@gmail.com","praji123");
		logIn("raji123@gmail.com","1234@5");
		logIn("jina@showgmail.com","jishow@na");

		
	}
	public static void emails(int id,String subject)
	{
		System.out.println("emailid is "+id+"\tsubject is "+subject);
	}
	public static void phoneCall(int mob_number,String name, int country_Code)
	{
		System.out.println("mobile number is "+mob_number+"\tname is "+name+"\ncountry code is"+country_Code);
	}
	public static void logIn(String email, String password)
	{
		System.out.println("email is "+email+"\tpassword is "+password);
	}
}