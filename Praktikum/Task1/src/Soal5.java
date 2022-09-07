
/**
* This program does manipulation
*  two string input
*  @ Version 2022-09-04
*  @ Author HilmanPermana
*/

import java.util.Scanner;

public class Soal5 {
	public static void main(String[] args) {
		String w1, w2, kalimat;
		Scanner keyboard = new Scanner(System.in);

		do {
			System.out.print("Input Word 1 : ");
			w1 = keyboard.nextLine();

			System.out.print("Input Word 2 : ");
			w2 = keyboard.nextLine();

			/* line 1 */
			int sumString = w1.length() + w2.length();
			System.out.println(sumString);

			/* line 2 */
			char w1First = w1.charAt(0);
			char w2First = w2.charAt(0);

			if (w1First > w2First) {
				System.out.println("Yes");

			} else {
				System.out.println("No");

			}

			/* line 3 */
			kalimat = w1.substring(0, 1).toUpperCase() + w1.substring(1) + " " 
			          + w2.substring(0, 1).toUpperCase() + w2.substring(1);
			System.out.println(kalimat);
			System.out.println();

		} while (true);
	}
}