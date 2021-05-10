import java.io.*;

class TwoDimensionMatrixDiagonalOnly{
	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		String str;
		int i,j;
		int arr[][] = new int[3][3];
		System.out.println("Enter elements of 2DMatrix:-");
		for(i=0;i<3;i++){
			for(j=0;j<3;j++){
				str = br.readLine();
				arr[i][j]=Integer.parseInt(str);
			}
		}
		System.out.println("Diagonal of 2DMatrix is:-");
		for(i=0;i<3;i++){
			for(j=0;j<3;j++){
				if(i == j){
					System.out.print(arr[i][j] + "  ");
				}
				else{
					System.out.print("*  ");
				}
			}	
			System.out.println();
		}
	}
}	