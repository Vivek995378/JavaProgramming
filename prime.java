import java.io.*;

class prime{
	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
		String str;
		int a,i,flag=0;
		System.out.print("Enter any number");
		str=br.readLine();
		a=Integer.parseInt(str);
		for(i = 2;i <= a/2; i++)
			if( a%i == 0){
				flag = 1;
				break;
			}
		if(flag == 0)
			System.out.print("Number is prime");
		else
			System.out.print("Number is not prime");

	}
}