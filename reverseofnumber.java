import java.io.*;

class reverseofnumber{
	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		String str;
		int n,r,rev=0;
		System.out.print("Enter any number:-");
		str=br.readLine();
		n=Integer.parseInt(str);
		while(n>=1){
			r=n%10;
			rev=(rev*10)+r;
			n/=10;
		}	
		System.out.print("Reverse of a number is:-" + rev);
	}
}