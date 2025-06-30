package tnsif_training;

public class PrimitiveDataTypesDemo {

	public static void main(String[] args) {
		
		// byte takes 1 byte
		// 1 byte = 8 bits  // 2^8
		// 256/2
		// 128
		
		byte byteMax = 127;
		byte byteMin = -128;
		System.out.println(byteMin);
		
		// short --> 2 byte
		short shortMax = 32767;
		short shortMin = -32768;
		System.out.println("Max range of short is :" + shortMax + " Min range of short is: " + shortMin);
		
		// int --> 4 byte
		int maxInt = 2147483647;
		int minInt = -2147483648;
		
		// long --> 8 byte
		long maxLong = 9223372036854775807L;
		long minLong = -9223372036854775808L;
		System.out.println("MAx range of long is: " + maxLong + "Min range of long is: " + minLong);
		
		float f = 3234.f;
	    double d = 3456.f;
		
		
		boolean flag = false;
		boolean flag2 = true;
	}

}
