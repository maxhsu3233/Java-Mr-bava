import java.util.Scanner;
public class marin2 {
	public static void main(String[] args) {
		for (int i = 0;i < 5 ;i++) {//Let the code inside repeat five times.
			Scanner word = new Scanner(System.in);//Because user have to enter five times.
			int number = word.nextInt();
			if (number == 1) {//If the user enter 1.
				System.out.println(number);
			}
			else if (number == 2) {//If the user enter 2.
				System.out.println(number);
			}
			else if (number == 3) {//If the user enter 3.
				System.out.println("CHEESE CHEESE CHEESE CHEESE CHEESE CHEESE CHEESE CHEESE CHEESE CHEESE CHEESE CHEESE CHEESE CHEESE CHEESE CHEESE CHEESE CHEESE CHEESE CHEESE CHEESE CHEESE CHEESE CHEESE CHEESE CHEESE CHEESE CHEESE CHEESE CHEESE CHEESE CHEESE CHEESE CHEESE CHEESE CHEESE CHEESE CHEESE CHEESE CHEESE CHEESE CHEESE CHEESE CHEESE CHEESE CHEESE CHEESE CHEESE CHEESE CHEESE CHEESE CHEESE CHEESE CHEESE CHEESE CHEESE CHEESE CHEESE CHEESE CHEESE CHEESE CHEESE CHEESE CHEESE CHEESE CHEESE CHEESE CHEESE CHEESE CHEESE CHEESE CHEESE CHEESE CHEESE CHEESE CHEESE CHEESE CHEESE CHEESE CHEESE CHEESE CHEESE CHEESE CHEESE CHEESE CHEESE CHEESE CHEESE CHEESE CHEESE CHEESE CHEESE CHEESE CHEESE CHEESE CHEESE CHEESE CHEESE CHEESE CHEESE CHEESE CHEESE "  + String.valueOf(number));
			}
		}
	}
}