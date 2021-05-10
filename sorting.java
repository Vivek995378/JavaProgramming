import java.io.*;

class sorting{
	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		String str;
		int i,j;
		int arr[] = new int[6];
		System.out.println("Enter array elements:- ");
		for(i=0;i<6;i++){
			str = br.readLine();
			arr[i]=Integer.parseInt(str);
		}
		for(i=0;i<6;i++){
			for(j=i+1;j<6;j++){
				if(arr[j]<arr[i]){
					arr[i]=arr[i]+arr[j];
					arr[j]=arr[i]-arr[j];
					arr[i]=arr[i]-arr[j];
				}
			}
		}
		System.out.println("Sorted array is:-");
		for(i=0;i<6;i++){
			System.out.print(arr[i] + " ");
		}
	}
}