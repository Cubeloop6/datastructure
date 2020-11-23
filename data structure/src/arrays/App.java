package arrays;


public class App {
	public static void main(String[] args) {
		int[] bucky = new int[10];
		
		bucky[0] = 87;
		bucky[1] = 543;
		bucky[9] = 65;
	
		System.out.println(bucky[3]);
		
		for(int i = 1; i <bucky.length; ++i)
			bucky[i] = 2*i;
		
		for (int i=0; i<bucky.length;++i) 
			if(bucky[i]==4)
				System.out.println("index found" + i);
		
		bucky[5] = 10;
	}
}
