import java.io.*;

class arrayalternateswapping{
	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str;
		int i;
		int arr[] = new int[6];
		System.out.println("Enter array elements:-");
		for(i=0;i<6;i++){
			str = br.readLine();
			arr[i] = Integer.parseInt(str);
		}
		System.out.println("Array after swapping each alternative elements:-");
		for(i=0;i<6;i+=2){
			arr[i] = arr[i] + arr[i+1];
			arr[i+1] = arr[i] - arr[i+1];
			arr[i] = arr[i] - arr[i+1];
		}
		for(i=0;i<6;i++){
			System.out.print(arr[i] + " ");
		}
	}
}