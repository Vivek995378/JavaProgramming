import java.io.*;

class TwoDimensionMatrixMultiplication{
	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		String str;
		int i,j,k;
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
				c[i][j]=0;
				for(k=0;k<3;k++){
					c[i][j]+=a[i][k]*b[k][j];
				}
			}
		}
		System.out.println("Multiplication of 2DMatrix is:-");
		for(i=0;i<3;i++){
			for(j=0;j<3;j++){
				System.out.print(c[i][j] + "  ");
			}
			System.out.println();
		}
	}
}