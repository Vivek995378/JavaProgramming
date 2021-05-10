import java.io.*;

class StringMethodEquals{
	public static void main(String args[]){
		String str1 = "Bharti";
		String str2 = "bharti";
		String str3 = new String ("Bharti");
		String str4 = "Computer";
		System.out.println(str1.equals(str2));   //false
		System.out.println(str1.equals(str3));   //true 
		System.out.println(str1.equals(str4));   //false
	} 
}