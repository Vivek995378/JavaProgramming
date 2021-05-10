import java.io.*;

class TwoDimensionMatrix1{
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
		System.out.println("Even 2DMatrix is:-");
		for(i=0;i<3;i++){
			for(j=0;j<3;j++){
				if(arr[i][j]%2 == 0){
					System.out.print(arr[i][j] + "  ");
				}
				else{
					System.out.print("x  ");
				}
			}
			System.out.println();
		}
	}
}