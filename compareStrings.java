import java.io.*;

class compareStrings{
	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		String str1="vivek",str2="vivek";
		System.out.print("Enter First Name:-");
		str1 = br.readLine();
		System.out.print("Enter Second Name:-");
		str2 = br.readLine();
		System.out.println("First Name is:-"+ str1);
		System.out.println("Second Name is:-"+ str2);
		if(str1.equals(str2))
			System.out.println("Both names are SAME");
		else
			System.out.println("Both names are NOT SAME");

	}
}