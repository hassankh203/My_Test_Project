package class_Octobre_30;

public class Arrays {

	public static void main(String[] args) {


        int[] a = new int[2];
        a [0]= 2;
        a[1]=3;
		//System.out.println(a);
				
        
        int [][] a1= {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        for (int r = 0;r<a1.length;r++) {
        	for (int c = 0;c < a1[r].length;c++){
        		System.out.print(a1[r][c]+" ");
        	}
        	
        			System.out.println();
        		
        	
        }
        
		

	}

}
