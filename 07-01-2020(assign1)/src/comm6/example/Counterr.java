package comm6.example;

public class Counterr {

	public static void main(String[] args) {
		Counter c1=new Counter("MyObject1==");
		System.out.printf("%s",c1);
		Counter c2=new Counter("MyObject1==");
		System.out.printf("%s",c2);
		Counter c3=new Counter("MyObject1==");
		System.out.printf("%s",c3);
		Counter c4=new Counter("MyObject1==");
		System.out.printf("%s",c4.display());

	}

}
