import java.io.*;

class counting{
	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		String str;
		int a;
		str=br.readLine();
		a=Integer.parseInt(str);
		while(a <= 10){
			System.out.print(" " + a + " ");
		    a=a+1;
		}
	}

}