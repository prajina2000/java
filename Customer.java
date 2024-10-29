public class Customer{
	String customerName;
	int mobile;
	String place;
	int pincode;
	String product;



	public Customer(){
	System.out.println("no param constructor");

	}
	public Customer( String customerName){
		
	    this();
	    this.customerName=customerName;
	    
	}
	public Customer( String customerName, int mobile){
		
	    this(customerName);
	    this.mobile=mobile;
	}

	public Customer( String customerName, int mobile,String place){
		this(customerName,mobile);
	    this.place=place;
	}

	public Customer( String customerName, int mobile,String place,int pincode){
		this(customerName,mobile,place);
	    this.pincode=pincode;
	}
	public Customer( String customerName, int mobile,String place,int pincode,String product){
		this(customerName,mobile,place,pincode);
	    this.product=product;
	}

	public void printDetails(){
		System.out.println("customerName:"+customerName+"\nmobile:"+mobile+"\nplace:"+place+"\npincode:"+pincode+"\nproduct:"+product);

	}
}


