import java.io.*;

class armstrong{
	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str;
		int n,x,cube,s=0,r;
		System.out.print("Enter any number:-");
		str=br.readLine();
		n=Integer.parseInt(str);
		x=n;
		while(n>=1){
			cube=0;
			r=n%10;
			cube=r*r*r;
			s+=cube;
			n/=10;
		}
		if(x==s)
			System.out.print("Number is ARMSTRONG");
		else
			System.out.print("Number is not ARMSTRONG");

	}
}