import java.io.*;

class MultiDArray{
	public static void main(String args[]) throws IOException{
		BufferedReader br= new BufferedReader (new InputStreamReader(System.in));
		String str;
		int i,j;
		int a[][] = new int[3][3];
		System.out.println("Enter 2-D array elements");
		for(i=0;i<3;i++){
			for(j=0;j<3;j++){
				str=br.readLine();
				a[i][j]=Integer.parseInt(str);
			}
		}
		System.out.println("2-D array is:-");
		for(i=0;i<3;i++){
			for(j=0;j<3;j++){
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
	}
}