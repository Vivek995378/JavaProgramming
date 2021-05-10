import java.io.*;

class switch{
	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
		String str;
		int n,x,ch,cube,r,i,rev=0,flag=0,sum=0;
		do{
			System.out.println("1. Check Armstrong");
			System.out.println("2. Check Prime");
			System.out.println("3. Check Pallindrome");
			System.out.println("4. Exit");
			System.out.print("Enter your choice:-");
			str=br.readLine();
			ch=Integer.parseInt(str);
			switch(ch){
				case 1:
				        System.out.print("Enter any number:-");
				        str=br.readLine();
				        n=Integer.parseInt(str);
				        x=n;
				        while(n>=1){
				        	r=n%10;
				        	cube=r*r*r;
				        	sum+=cube;
				        	n/=10;
				        }	
				        if(x==sum)
				        	System.out.println("Number is Armstrong");
				        else
				        	System.out.println("Number is not Armstrong");
				        break;
				case 2:
				        System.out.print("Enter any number:-");
				        str=br.readLine();
				        n=Integer.parseInt(str);
				        for(i=2;i<=n/2;i++){
				        	if(n%i == 0){
				        		flag=1;
				        		break;
				        	}
				        }
				        if(flag==0)
				        	System.out.println("Number is Prime");
				        else
				        	System.out.println("Number is not Prime");
				        break;
				case 3:
				        System.out.print("Enter any number:-");
				        str=br.readLine();
				        n=Integer.parseInt(str);
				        x=n;
				        while(n>=1){
				        	r=n%10;
				        	rev=(rev*10) + r;
				        	n/=10;
				        }
				        if(x==rev)
				        	System.out.println("Number is pallindrome");
				        else
				        	System.out.println("Number is not pallindrome");
				        break;
				case 4:
				        break;
				default:
				        System.out.println("Invalid Choice"); 
			}
		}while(ch!=4);
	}
}