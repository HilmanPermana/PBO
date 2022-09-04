/**
* This program displays a data type related
* from Users Input
* @Version 2022-09-02
* @author Hilman Permana
*/

import java.util.Scanner;

public class Soal1
{
	public static void main(String[] args)
	{
		double N;
		long maksimum = Long.MAX_VALUE;
		long minimum = Long.MIN_VALUE;
		
		Scanner keyboard = new Scanner(System.in);

		while(true) {
			
			System.out.print("Input Number ");
			N = keyboard.nextDouble();
			
			if((N > minimum) && (N < maksimum)) {
				
				System.out.println(N + " can be fitted in : ");
				
				if ((N > Byte.MIN_VALUE) && (N < Byte.MAX_VALUE)) {
					
					System.out.println("byte");
					
				}
				if((N > Short.MIN_VALUE) && (N < Short.MAX_VALUE)){
					
					System.out.println("short");
					
				}
				if((N > Integer.MIN_VALUE) && (N < Integer.MAX_VALUE)) {
						
					System.out.println("integer");
					
				}
				
				System.out.println("long");
				
			}else {
				System.out.println("N can't be fitted anywhere");
			
			}
			System.out.println(" ");
		}
	}
}