package com.xworkz.TypeCasting;

public class PrimitiveDowncasting {
	public static void main(String[] args) {
        double d = 9.8;
        int i = (int) d;  
        System.out.println("Double to Int: " + i);

        long l = 300L;
        short s = (short) l;  
        System.out.println("Long to Short: " + s);

        int num = 100;
        byte b = (byte) num;  
        System.out.println("Int to Byte: " + b);

        float f = 45.3f;
        int i2 = (int) f;  
        System.out.println("Float to Int: " + i2);
    }

}
