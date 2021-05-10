import java.io.*;

class maxdigit{
	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
		String str;
		int n,max=0,r;
		System.out.print("Enter any number:-");
		str= br.readLine();
		n=Integer.parseInt(str);
		while(n>=1){
			r=n%10;
			if(r>max)
				max=r;
			n/=10;
		}
		System.out.print("Max digit is:-" + max);

	}
}