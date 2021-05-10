import java.io.*;

class arrayMin{
	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		String str;
		int i,min;
		int arr[] = new int[6];
		System.out.println("Enter array elements:-");
		for(i=0;i<6;i++){
			str=br.readLine();
			arr[i]=Integer.parseInt(str);
		}
		min=arr[0];
		for(i=0;i<6;i++){
			if(arr[i] < min)
				min=arr[i];
		}
		System.out.print("Min number of array is:-"+min);
	}
}