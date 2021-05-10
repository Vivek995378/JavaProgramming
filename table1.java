import java.io.*;

class table1{
	public static void main(String args[]) throws IOException{
		BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
		String str;
		int a,x=12,y=15;
		System.out.print("Enter any number:-");
		str=br.readLine();
		a=Integer.parseInt(str);
		if(a%2 == 0)
			for(int i=1;i<=10;i++)
				System.out.println(x+ " x " + i + " = " + (x*i));
		else
			for(int i=1;i<=10;i++)
				System.out.println(y + " x " + i + " = " + (y*i));
	}
}