package strings;

public class SplitString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s3 = "luffy is still joyboy";
		String[] split3 = s3.split(" ");
		System.out.println(split3.length - 1);

		for (int i = 0; i < split3.length; i++) {
			//System.out.println(split3[i]);

			if (i == 2) {

				System.out.println("Splitting the third string "+split3[i]);
			}
		}
	}

}
