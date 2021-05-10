import java.io.*;

class TwoDimensionMatrixRowSum{
	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		String str;
		int i,j,sum;
		int arr[][] = new int[3][3];
		System.out.println("Enter elements of 2DMatrix:-");
		for(i=0;i<3;i++){
			for(j=0;j<3;j++){
				str = br.readLine();
				arr[i][j]=Integer.parseInt(str);
			}
		}
		System.out.println("The sum of 2DMatrix Rows is:-");
		for(i=0;i<3;i++){
			sum=0;
			for(j=0;j<3;j++){
				System.out.print(arr[i][j] + "  ");
				sum+=arr[i][j];
			}
			System.out.print("  =  " + sum);
			System.out.println();
		}
	}
}