import java.util.*;
public class RomanInteger {
	
	int value(char r)
	{
		if (r == 'I')
			return 1;
		if (r == 'V')
			return 5;
		if (r == 'X')
			return 10;
		if (r == 'L')
			return 50;
		if (r == 'C')
			return 100;
		if (r == 'D')
			return 500;
		if (r == 'M')
			return 1000;
		return -1;
	}

	int romanToDecimal(String str)
	{
		int res = 0;
		for (int i = 0; i < str.length(); i++) {		
			int s1 = value(str.charAt(i));		
			if (i + 1 < str.length()) {
				int s2 = value(str.charAt(i + 1));			
				if (s1 >= s2) {				
					res = res + s1;
				}
				else {
					res = res + s2 - s1;
					i++;
				}
			}
			else {
				res = res + s1;
			}
		}
		return res;
	}

	public static void main(String args[])
	{
		RomanInteger ob = new RomanInteger();

		Scanner sc = new Scanner(System.in);
		String str =sc.nextLine();
		System.out.println("Roman Numberal is : "+str);
		System.out.println("Integer form of Roman Numeral"
						+ " is "
						+ ob.romanToDecimal(str));
	}
}
