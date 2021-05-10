import java.io.*;

class max{
	  public static void main(String args[]) throws IOException {
	  	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	  	String str;
	  	int a,b,max;
	  	System.out.print("Enter first number:-");
	  	str=br.readLine();
	  	a=Integer.parseInt(str);
	  	System.out.print("Enter second number:-");
	  	str=br.readLine();
	  	b=Integer.parseInt(str);
	  	if(a>b)
	  		max=a;
	  	else
	  		max=b;
	  	System.out.print("Maximum number is:-"+max);

	  }
}
