package lesson13_StaticOrnek;

import java.util.Scanner;

public class StudentTest {
	
	
	public static void main(String[] args) {
		
		
//		Student ogrenci1= new Student();
//		
//		ogrenci1.name="Mustafa";
//		ogrenci1.ogrenciKayit();
//		
//		Student ogrenci2= new Student();
//		
//		ogrenci2.name="Hilal";
//		ogrenci2.ogrenciKayit();
//		
//		Student ogrenci3= new Student();
//		ogrenci3.name="Elif";
//		ogrenci3.ogrenciKayit();
//		
//		
//		System.out.println(ogrenci1.studentNumber);
//		System.out.println(ogrenci2.studentNumber);
//		System.out.println(ogrenci3.studentNumber);
		
		
	Student student1= Student.ogrenciKayit2("kral");
	Student student2= Student.ogrenciKayit2("Ali");
	
	System.out.println(student1.name+"====>"+student1.studentNumber);
	System.out.println(student2.name+"====>"+student2.studentNumber);
		
	}
	

	
	

}
