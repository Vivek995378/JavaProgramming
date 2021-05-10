import java.io.*;

class arrayreverse{
	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		String str;
		int i;
		int arr[] = new int[6];
		System.out.println("Enter array elements:-");
		for(i=0;i<6;i++){
			str=br.readLine();
			arr[i]=Integer.parseInt(str);
		}
		System.out.println("Reverse array is:-");
		for(i=0;i<6/2;i++){
			arr[i]=arr[i] + arr[5-i];
			arr[5-i]=arr[i]-arr[5-i];
			arr[i]=arr[i]-arr[5-i];
		}
		for(i=0;i<6;i++){
			System.out.print(arr[i] + " ");
		}
	}
}