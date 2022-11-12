package udemy_Practices;

import java.util.ArrayList;

public class Array_List {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//https://www.udemy.com/course/selenium-real-time-examplesinterview-questions/learn/lecture/29132920#overview
		
		ArrayList a = new ArrayList();
		
		a.add("salim");
		a.add("simon");
		System.out.println(a.get(1));
		a.remove(0);
		System.out.println(a.get(0));
		//spliting and triming a string
		String st = "said sami simon";
		String st1 = new String();
		for ( int i=0 ; i<st.length(); i++) {
		 System.out.print(st.charAt(i));}
		System.out.println();
		String[] spl = st.split("sami");
		for (int c=0; c<spl.length; c++) {
		
		System.out.println(spl[c].trim() );}
			
		
		

	}

}
