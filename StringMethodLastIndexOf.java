class StringMethodLastIndexOf{
	public static void main(String args[]){
		String str = "begineersbook is for begineers";
		char ch1 = 'b';
		char ch2 = 's';
		String subStr = "begineers";
		int posOfB = str.lastIndexOf(ch1);
		int posOfS = str.lastIndexOf(ch2);
		int posOfSubStr = str.lastIndexOf(subStr);
		System.out.println(posOfB);
		System.out.println(posOfS);
		System.out.println(posOfSubStr);
	}
}