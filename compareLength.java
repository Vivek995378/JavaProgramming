import java.io.*;

class compareLength{
	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		String str1,str2;
		int l1,l2;
		System.out.print("Enter First Name:-");
		str1 = br.readLine();
		l1 = str1.length();
		System.out.print("Enter Second Name:-");
		str2 = br.readLine();
		l2 = str2.length();
		System.out.println("First Name is:-"+ str1);
		System.out.println("Length of First Name is:-"+ l1);
		System.out.println("Second Name is:-"+ str2);
		System.out.println("Length of Second Name is:-"+ l2);
		if(l1==l2)
			System.out.println("Length of both names is SAME");
		else
			System.out.println("Length of both names is NOT SAME");

	}
}