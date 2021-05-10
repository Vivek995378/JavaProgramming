import java.io.*;

class arraysSum{
	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
		String str;
		int i;
		int a[] = new int[6];
		int b[] = new int[6];
		int c[] = new int[6];
		System.out.println("Enter elements of first array:-");
		for(i=0;i<6;i++){
			str = br.readLine();
			a[i]=Integer.parseInt(str);
		}
		System.out.println("Enter elements of second array:-");
		for(i=0;i<6;i++){
			str = br.readLine();
			b[i]=Integer.parseInt(str);
		}
		System.out.println("Sum of arrays are:-");
		for(i=0;i<6;i++){
			c[i]=a[i]+b[i];
		}
		for(i=0;i<6;i++){
			System.out.print(c[i] + " ");
		}
	}
}