class StringMethodEqualsIgnoreCase{
	public static void main(String args[]){
		String str1 = "Bharti";
		String str2 = "BHARTI";
		System.out.println(str1.equals(str2));              //false
		System.out.println(str1.equalsIgnoreCase(str2));    //true
	}
}