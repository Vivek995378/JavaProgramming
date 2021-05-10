import java.io.*;

class sumofdigits{
	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader ( new InputStreamReader(System.in));
		String str;
		int n,s=0,r;
		System.out.print("Enetr any number:-");
		str=br.readLine();
		n=Integer.parseInt(str);
		while(n>=1){
			r=n%10;
			s+=r;
			n/=10;

	    }
	    System.out.print("Sum is:-" + s);
	}
}