import java.io.*;

class sumofprimedigits{
	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader ( new InputStreamReader (System.in));
		String str;
		int n,s=0,r,flag;
		System.out.print("Enter any number:-");
		str=br.readLine();
		n=Integer.parseInt(str);
		while(n>=1){
			flag=0;
			r=n%10;
			for(int i=2;i<=r/2;i++){
				if(r%i == 0){
					flag=1;
					break;
				}
			}
			if(flag==0)
				s+=r;
			n/=10;
		}
		System.out.print("Sum of prime digits:-" + s);
	}
}