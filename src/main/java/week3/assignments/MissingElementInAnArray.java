package week3.assignments;

public class MissingElementInAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a= {1,3,4,5,6,8,10,13};
		int count=1;
		for(int i=0;i<=a.length-1;i++) {
			//While Loop executes until the condition becomes false
			while(a[i]!=i+count) {
				
				System.out.println(i+count);
				count++;
			}
		}
	}

}
