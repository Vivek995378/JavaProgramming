import java.io.*;

class febonacci{
	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
		String str;
		int n,i,a=0,b=1,sum;
		System.out.print("Enter any number:-");
		str=br.readLine();
		n=Integer.parseInt(str);
		System.out.print("0 1");
		for(i=3;i<=n;i++){
			sum=a+b;
			System.out.print(" "+ sum);
			a=b;
			b=sum;
		}
	}
}