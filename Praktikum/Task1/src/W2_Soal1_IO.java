import java.util.*;

public class W2_Soal1_IO {
	public static void main(String args[]) {
	
		// Creating a StringTokenizer
		StringTokenizer str_arr = new StringTokenizer("I want to Home");

		// Counting the tokens
		int count = str_arr.countTokens();
		System.out.println("Total number of Tokens: " + count);

		// Print the tokens
		for (int i = 0; i < count; i++)
			System.out.println("token at [" + i + "] : " + str_arr.nextToken());
	}
}