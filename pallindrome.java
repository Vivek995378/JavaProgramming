import java.io.*;

class pallindrome{
	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		String str;
		int n,x,rev=0,r;
		System.out.print("Enetr any number:-");
		str=br.readLine();
		n=Integer.parseInt(str);
		x=n;
		while(n>=1){
			r=n%10;
			rev=(rev*10)+r;
			n/=10;
	    }
	    if(x==rev)
	    	System.out.print("Number is pallindrome");
	    else
	    	System.out.print("Number is not pallindrome");
	}
}