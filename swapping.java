import java.io.*;

class swapping{
	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		String str;
		int a,b,c;
		System.out.println("Enter first number:-");
		str=br.readLine();
		a=Integer.parseInt(str);
		System.out.println("Enter second number:-");
		str=br.readLine();
		b=Integer.parseInt(str);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("First no. after swapping:-" + a);
		System.out.println("Second no. after swapping:-" + b);
	}
}