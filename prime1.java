import java.io.*;

class prime1{
	public static void main(String args[]){
		int i,j,flag;
		for(i=2;i<=15;i++){
			flag=0;
			for(j=2;j<=i/2;j++){
				if(i%j == 0){
					flag=1;
					break;
				}
			}
				
			if(flag==0)
				System.out.print("Prime numbers are:-" + i);
		}		
	}
}