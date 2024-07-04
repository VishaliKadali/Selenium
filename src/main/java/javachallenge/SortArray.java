package javachallenge;

public class SortArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[]= {5,9,11, 14, 20, 18};
		
		
		for(int i=0;i<array.length;i++) {
			for(int j=i+1;j<array.length;j++) {
				int temp=0;
				if(array[i]>array[j]) {
					temp=array[i];
					array[i]=array[j];
					array[j]=temp;
				}
				
				
			}
			System.out.println(array[i]);
			
		}
	}

}
