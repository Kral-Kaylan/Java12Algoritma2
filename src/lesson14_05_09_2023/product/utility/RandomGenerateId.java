package lesson14_05_09_2023.product.utility;

import java.util.Random;

public class RandomGenerateId {
	
	private static Random  rnd=new Random();
	public static String generateId() {
		
		int id= rnd.nextInt(1000,10000);
		String randomId= Integer.toString(id);
		return randomId;
	}
public static String generateProductCode(String name) {
	
	String code= generateId();
	String productCode=name.substring(0, 3)+ code;
	return  productCode;
}
}
