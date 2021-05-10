import java.io.*;

class stringLength{
	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		String str;
		System.out.print("Enter Name:-");
		str = br.readLine();
		System.out.println("Name is:-"+ str);
		System.out.println("Length of Name is:-"+ str.length());

	}
}