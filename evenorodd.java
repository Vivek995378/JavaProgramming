import java.io.*;

class evenorodd{
	public static void main(String args[]) throws IOException{
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 String str;
		 int a;
		 System.out.print("Enter number:-");
		 str=br.readLine();
		 a=Integer.parseInt(str);
		 if(a%2 == 0)
		 	System.out.print("Number is EVEN");
		 else
		 	System.out.print("Number is ODD");
	}
}