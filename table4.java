import java.io.*;

class table4{
	public static void main(String args[]) throws IOException{
		BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
		String str;
		int a,b,i,j,min=0,max=0;
		System.out.print("Enter first number:-");
		str=br.readLine();
		a=Integer.parseInt(str);
		System.out.print("Enter second number:-");
		str=br.readLine();
		b=Integer.parseInt(str);
		if(a < b){
			min=a;
		    max=b;
		}
		else{
			min=b;
	   		max=a;
        }
        for(i = min ; i <= max ; i++)
        	for(j = 1 ; j <= 10 ; j++)
        		System.out.print( (i*j) + " ");



	}
}