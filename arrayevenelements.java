import java.io.*;

class arrayevenelements{
	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		String str;
		int i;
		int arr[] = new int[5];
		System.out.println("Enter array elements:-");
		for(i=0;i<5;i++){
			str=br.readLine();
			arr[i]=Integer.parseInt(str);
		}
		System.out.println("Even elements of array is:-");
		for(i=0;i<5;i++){
			if(arr[i]%2 == 0){
				System.out.print(arr[i] + " ");
			}
		}
	}
}