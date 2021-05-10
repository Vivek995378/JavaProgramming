class StringMethodCompareTo{
	public static void main(String args[]){
		String str1 = "Sachin";
		String str2 = "Sachin";
		String str3 = "Ratan";
		System.out.println(str1.compareTo(str2));    //0
		System.out.println(str1.compareTo(str3));    //1
		System.out.println(str3.compareTo(str1));    //-1
	}
}