import java.io.*;

class table{
	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		String str;
		int a;
		System.out.print("Enter table number:-");
		str=br.readLine();
		a=Integer.parseInt(str);
		for(int i=1;i<=10;i++)
			System.out.println(a + " x " + i + " = " + (a*i));

	}
}