import java.io.*;

class arrayprimeelements{
	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
		String str;
		int i,j,flag;
		int arr[] = new int[5];
		System.out.println("Enter array elements:-");
		for(i=0;i<5;i++){
			str=br.readLine();
			arr[i]=Integer.parseInt(str);
		}
		System.out.println("Prime elements of array are:-");
		for(i=0;i<5;i++){
			flag=0;
			for(j=2;j<=arr[i]/2;j++){
				if(arr[i]%j == 0){
					flag=1;
					break;
				}
			}
			if(flag==0){
				System.out.print(arr[i] + " ");
			}
		}
	}
}