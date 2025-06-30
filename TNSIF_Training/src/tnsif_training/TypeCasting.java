package tnsif_training;

public class TypeCasting {

	public static void main(String[] args) {
		
		// widening // implicit type type casting
		byte b = 10;
		int i = b;
		System.out.println(i);
		
		float f = 22;
		double d = f;
		System.out.println(d);
		
		// Narrowing // explicit type casting
		
		double f1 = 10.52f;
		long l = (long) f1;
		System.out.println(l);
		
		long l2 = 586734963657L;
		int il2 = (int) l2;
		System.out.println(il2);
		
		short a = 130;
		byte b1 = (byte) a;
		System.out.println(b1);
		
		//byte -128 to 127
		// 130-128 = 2

	}

}
