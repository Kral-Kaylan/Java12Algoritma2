package Lesson12_OOP;

public class oopGiris {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a =4;
		int b=3;
		
		System.out.println(a);
		System.out.println(b);
		
		a=b;
		b=15;
		System.out.println(a);
		System.out.println(b);
		
		Integer sayi1=10;
		Integer sayi2=20;
		sayi1=sayi2;
		sayi2=30;
		System.out.println("******************************");
		System.out.println(sayi1);
		System.out.println(sayi2);
		
		String []sehirler= {"Ankara","Istanbul","İzmir"};
		String []sehirler2= {"Bursa","Konya","Mersin"};
		System.out.println("******************************");

		System.out.println(sehirler[0]);
		System.out.println(sehirler2[0]);
		System.out.println("******************************");
		
		sehirler2=sehirler;
		System.out.println(sehirler2[0]);// ankara
		sehirler[0]="Bolu";
		System.out.println(sehirler2[0]); // bolu
		sehirler2[1]="Edirne";
		System.out.println(sehirler[1]);// edirne
		
		
		
	}

}
