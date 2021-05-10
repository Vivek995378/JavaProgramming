import java.io.*;
import java.lang.*;

class choice{
	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		String str;
		int ch,i,j,n;
		do{
		System.out.println("1. Table 2 to 5");
		System.out.println("2. Table 5 to 2");
		System.out.println("3. Any no. table");
		System.out.println("4. EXIT");
		System.out.print("Enter your choice:-");
		str=br.readLine();
		ch=Integer.parseInt(str);
		if(ch==1){
			for(i=2;i<=5;i++){
				for(j=1;j<=10;j++){
					System.out.print((i*j) + " ");
				}
				System.out.println();
			}
		}
		else if(ch==2){
			for(i=5;i>=2;i--)
				for(j=1;j<=10;j++)
					System.out.print((i*j) + " ");
				System.out.println();
		}
		else if(ch==3){
			System.out.print("Enter any number:-");
			str=br.readLine();
			n=Integer.parseInt(str);
			for(i=1;i<=10;i++)
				System.out.println( (n*i) + " ");
        }
        else if(ch==4){
        	System.out.print("Invalid choice");
        }
        }while(ch!=4);
	}
}