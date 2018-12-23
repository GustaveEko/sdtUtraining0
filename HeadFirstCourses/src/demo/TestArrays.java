package demo;

public class TestArrays {
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] islands = new String[4];
		islands[0] = "Bermuda";
		islands[1] = "Fiji";
		islands[2]="Azores";
		islands[3]= "Cozumel";
		
		int[] index = new int[4];
		index[0]=1;
		index[1]=3;
		index[2]=0;
		index[3]=2;
		int y ;
		int ref;
		
		for( y = 0; y<4; y++) {
			ref = index[y];
			
			System.out.println(islands[ref]);
		
			
		}
		
		

	}
	

}
