package udemy_Practices;

public class Data_types {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 5;
		String name = "Samair Said"; 
		double num1 = 9.55;
		char letter = 'r';
		boolean a = true;
		System.out.println(name);		
		int[] arr = {1,2,3,4};
		System.out.println(arr[3]);
		for (int i=0; i<arr.length;i++) {
			if (arr[i] % 2 == 0) {
			System.out.println(arr[i]);}
		}

	for (int s:arr) {
		System.out.print(s);}     //this is called enhanced for loop iteration
	}

}
