import java.io.*;

class table3{
	public static void main(String args[]) throws IOException{
		BufferedReader br= new BufferedReader (new InputStreamReader(System.in));
		String str;
		int a,i,j;
		System.out.print("Enter any number:-");
		str=br.readLine();
		a=Integer.parseInt(str);
		for(i=5;i>=a;i--)
			for(j=1;j<=10;j++)
				System.out.print(i*j + " ");
	}
}