class StringMethodEqualOperator{
	public static void main(String args[]){
		String str1 = "Bharti";   
		String str2 = "Bharti";
		String str3 = new String ("Bharti");
		String str4 = new String ("BHARTI");
		String str5 = new String ("Bharti");
		System.out.println(str1 == str2);   //true
		System.out.println(str1 == str3);   //false
		System.out.println(str3 == str4);   //false
		System.out.println(str3 == str5);   //false
	}
}