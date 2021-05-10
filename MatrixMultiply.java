import java.io.*;

class MatrixMultiply{
	public static void main(String args[]) throws IOException{
		BufferedReader br= new BufferedReader (new InputStreamReader(System.in));
		String str;
		int i,j;
		int a[][] = new int[3][3];
		int b[][] = new int[3][3];
		int c[][] = new int[3][3];
		System.out.println("Enter elements of 1st matrix");
		for(i=0;i<3;i++){
			for(j=0;j<3;j++){
				str=br.readLine();
				a[i][j]=Integer.parseInt(str);
			}
		}
		System.out.println("Enter elements of 2nd matrix");
		for(i=0;i<3;i++){
			for(j=0;j<3;j++){
				str=br.readLine();
				b[i][j]=Integer.parseInt(str);
			}
		}
		System.out.println("1st matrix is:-");
		for(i=0;i<3;i++){
			for(j=0;j<3;j++){
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("2nd matrix is:-");
		for(i=0;i<3;i++){
			for(j=0;j<3;j++){
				System.out.print(b[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("Multiplication of matrices is:-");
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				c[i][j]=0;
				for(int k=0;k<3;k++)
				{
					c[i][j]+= a[i][k] * b[k][j];
				}
			}
		}
		for(i=0;i<3;i++){
			for(j=0;j<3;j++){
				System.out.print(c[i][j] + " ");
			}
			System.out.println();
		}

	
	}
}