package lesson13_StaticOrnek;

import java.util.Scanner;

public class Student {

	// Öğrenci kayıt Metodu yazalım
	
	String name;
	 int studentNumber=1;
	 static int index;
	public void numaraVer() {
		index++;
		studentNumber=index;
		System.out.println(name+" adlı öğrenci başarı ile kayıt edilmiştir.Öğrenci No: "+studentNumber);
		
		
	}
	//
	public static Student ogrenciKayit2(String isim) {
		index++;
		Student student= new Student();
		student.name=isim;
		student.numaraVer();
		return student;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
