/**
* This program does convert
*  from a data type
*  between two code.
*  @ Version 2022-09-04
*  @ Author HilmanPermana
*/

class Soal4_ConvertDataType 
{
	static short methodOne (long l)
	{
		int i = (int) l;
		return (short) i;
	}
	public static void main(String[] args) {
		double d = 10.25;
		float f = (float) d;
		byte b = (byte) methodOne ((long) f);
		System.out.println("Output b variable : " + b);
	}
}