package com.xworkz.TypeCasting;

public class PrimitiveUpcasting {
	public static void main(String[] args) {
        byte b = 10;
        int i = b;  
        System.out.println("Byte to Int: " + i);

        short s = 100;
        long l = s;  
        System.out.println("Short to Long: " + l);

        int num = 25;
        double d = num;  
        System.out.println("Int to Double: " + d);

        float f = 12.5f;
        double d2 = f; 
        System.out.println("Float to Double: " + d2);
    }

}
