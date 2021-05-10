import java.io.*;

class commandLineArgument1{
	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		String str;
		int i,j,flag;
		int a[] = new int[10];
		for(i=0;i<args.length;i++){
			a[i]=Integer.parseInt(args[i]);
		}
		System.out.println("Array is:-");
		for(i=0;i<10;i++){
			System.out.print(a[i]+" ");
		}
		System.out.println("\nPrime Numbers are:-");
		for(i=0;i<10;i++){
			flag=0;
			for(j=2;j<=a[i]/2;j++){
				if(a[i]%j == 0){
					flag=1;
					break;
				}
			}
			if(flag==0)
				System.out.print(a[i] + " ");
		}
	}
}