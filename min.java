import java.io.*;

class min{
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str;
		int a,b,c,minn=0;
        System.out.print("Enter first number:-");
        str=br.readLine();
        a =Integer.parseInt(str);
        System.out.print("Enter second number:-");
        str=br.readLine();
        b =Integer.parseInt(str);
        System.out.print("Enter third number:-");
        str=br.readLine();
        c =Integer.parseInt(str);
        if(a <= b && a<=c)
        	minn=a;
        else if(b <= a && b<=c)
        	minn=b;
        else if(c <= a && c<=b)
        	minn=c;
        System.out.print("Minimum number is:-"+minn);


	}
}