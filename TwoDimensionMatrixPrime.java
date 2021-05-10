import java.io.*;

class TwoDimensionMatrixPrime{
	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		String str;
		int i,j,k,flag;
		int arr[][] = new int[3][3];
		System.out.println("Enter elements of 2DMatrix:-");
		for(i=0;i<3;i++){
			for(j=0;j<3;j++){
				str = br.readLine();
				arr[i][j]=Integer.parseInt(str);
			}
		}
		System.out.println("Prime 2DMatrix is:-");
		for(i=0;i<3;i++){
			for(j=0;j<3;j++){
				flag=0;
				for(k=2;k<=arr[i][j]/2;k++){
					if(arr[i][j]%k == 0){
						flag=1;
						break;
					}
				}
				if(flag == 0){
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