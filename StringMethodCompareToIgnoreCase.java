class StringMethodCompareToIgnoreCase{
	public static void main(String args[]){
		String str1 = "BHARTI";
		String str2 = "bharti";
		String str3 = "bharat";
		System.out.println(str1.compareToIgnoreCase(str2));
		System.out.println(str1.compareToIgnoreCase(str3));
	}
}