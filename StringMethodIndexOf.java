class StringMethodIndexOf{
	public static void main(String args[]){
		String str1 = "Bharti Computer Education";
		String str2 = "Computer";
		String str3 = "arti";
		System.out.println("Index of B in str1 :-" + str1.indexOf('B'));
		System.out.println("Index of u in str1 after 15th char:-" + str1.indexOf('u',15));
		System.out.println("Index of str2 in str1:-" + str1.indexOf(str2));
        System.out.println("Index of str3 in str1:-" + str1.indexOf(str3));
	}
}