import java.io.*;

class TwoDimensionMatrixSum{
	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		String str;
		int i,j;
		int a[][] = new int[3][3];
		int b[][] = new int[3][3];
		int c[][] = new int[3][3];
		System.out.println("Enter elements of first 2DMatrix:-");
		for(i=0;i<3;i++){
			for(j=0;j<3;j++){
				str = br.readLine();
				a[i][j]=Integer.parseInt(str);
			}
		}
		System.out.println("Enter elements of second 2DMatrix:-");
		for(i=0;i<3;i++){
			for(j=0;j<3;j++){
				str = br.readLine();
				b[i][j]=Integer.parseInt(str);
			}
		}
		for(i=0;i<3;i++){
			for(j=0;j<3;j++){
				c[i][j]=a[i][j]+b[i][j];
			}
		}
		System.out.println("Sum of 2DMatrix is:-");
		for(i=0;i<3;i++){
			for(j=0;j<3;j++){
				System.out.print(c[i][j] + "  ");
			}
			System.out.println();
		}
	}
}