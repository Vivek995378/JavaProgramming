import java.io.*;

class file2{
	public static void main(String args[]) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String str;
		int a,b,s;
		System.out.print("Enter First Number :- ");
		str=br.readLine();
		a=Integer.parseInt(str);
		System.out.print("Enter Second Number :- ");
		str=br.readLine();
		b=Integer.parseInt(str);
		s=a+b;
		System.out.print("The sum of "+a+" and "+b+" is "+s);
	}
}