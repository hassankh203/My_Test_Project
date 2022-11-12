package kumar_assignmenrs;

public class For_loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//first 300 even numbers
		System.out.println("first 300 even numbers are :");
		for ( int n = 0, m = 300; n<m*2; n++) {if (n%2 == 0) {
			System.out.print(n + " ");}}
		
		
		System.out.println();
		System.out.println();
		
		//first 10 multiples of 5
		System.out.println(" first 10 multiples of 5 are :");
		
		for ( int n1 = 0, m1 = 10; n1<m1*5; n1++) {if(n1%5==0) {
		
			System.out.print( n1 +" ");}}
		
		
		System.out.println();
		System.out.println();
		
		// numbers from 100 to 50
		System.out.println(" numbers from 100 to 50 are :");
		for (int n3 = 100; n3>= 50; n3--) {
		System.out.print(n3 + " ");}
		
		System.out.println();
		System.out.println();
		
		//multiples of 5 starting from 200 down to 100
		System.out.println(" multiples of 5 starting from 200 down to 100 are :");
		for (int n4 = 200; n4>=100; n4--) {if (n4%5==0) {
			System.out.print(n4 + " ");}}
		
		System.out.println();
		System.out.println();
		
		//sum of the first 100 natural numbers
		System.out.println(" the sum of the frist 100 natural numbers is  :");
		int sum = 0;
		for ( int n5 = 1; n5 <=100 ;n5++) {
			sum = sum + n5;}
		System.out.print(sum + " ");
		
		System.out.println();
		System.out.println();
		
		//sum of the first 10 prime numbers
		
		int num = 12;
		int count = 0;
			for ( int factor =1;factor<=num; factor++) {
				if (num%factor == 0) count++; {
				
				if (count == 2){
					System.out.println(num);}}
			
		}
			
		
	
		
		
		
		
	}
	}
	

		
		
		
		
		
		
	


