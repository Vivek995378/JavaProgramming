import java.io.*;

class arrayMax{
	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		String str;
		int i,max=0;
		int arr[] = new int[6];
		System.out.println("Enter array elements:-");
		for(i=0;i<6;i++){
			str=br.readLine();
			arr[i]=Integer.parseInt(str);
		}
		for(i=0;i<6;i++){
			if(arr[i] > max)
				max=arr[i];
		}
		System.out.print("Max number of array is:-"+max);
	}
}