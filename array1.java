import java.io.*;

class array1{
	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		String str;
		int i;
		int arr[] = new int[10];
		System.out.println("Enter array elements:-");
		for(i=0;i<10;i++){
			str=br.readLine();
			arr[i]=Integer.parseInt(str);
		}
		System.out.println("Array is:-");
		for(i=0;i<10;i++){
			System.out.print(arr[i] + " ");
		}
	}
}