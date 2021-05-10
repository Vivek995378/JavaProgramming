import java.io.*;

class box{
	double l,b;
}

class array{
	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		String str;
		int a,b;
		System.out.print("Please Enter LENGTH:-");
		str=br.readLine();
		a=Integer.parseInt(str);
		System.out.print("Please Enter BREADTH:-");
		str=br.readLine();
		b=Integer.parseInt(str);
		box obj = new box();
		obj.l=a;
		obj.b=b;
		System.out.println("Length is:-"+obj.l);
		System.out.println("Breath is:-"+obj.b);

	}
}