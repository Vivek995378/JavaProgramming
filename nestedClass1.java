class abc{
	int a=10,b=20;
	void showOuter(){
		System.out.println("Outer class 'a':-"+a);
		System.out.println("Outer class 'b':-"+b);
	}
	public class xyz{
		int c=30,d=40;
		void showInner(){
			System.out.println("Inner class 'c':-"+c);
		    System.out.println("Inner class 'd':-"+d);
		}
	}
}
class nestedClass1{
	public static void main(String args[]){
		abc outer = new abc();
		abc.xyz inner = outer.new xyz();
		outer.showOuter();
		inner.showInner();
	}
}