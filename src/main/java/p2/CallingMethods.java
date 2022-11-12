package p2;

public class CallingMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CallingMethods a = new CallingMethods();	
		a.method1(0, null);
		a.method2();
		a.method3();
		a.method4();
		a.method5();
		method6();
		method7();
		method8();
		method9();
		method10(0, null);
		
		
		

	}
public void method1(int a , String name  ) {
	a=1; name ="said";
	System.out.println(a + " " + name);
}
public void method2() {
	System.out.println("hello world2");
	
}
public void method3() {
	System.out.println("hello world3");
	
}
public void method4() {
	System.out.println("hello world4");
	
}
public void method5() {
	System.out.println("hello world5");
}
public static void method6() {
	System.out.println("hello world6");
	
}
public static void method7() {
	System.out.println("hello world7");
	
}
public static void method8() {
	System.out.println("hello world8");
	
}
public static void method9() {
	System.out.println("hello world9");
	
}
public static void method10(int b, String name) {
	b = 33; name = "mounir";
	
	System.out.println(b +" "+name);
	
}

}
