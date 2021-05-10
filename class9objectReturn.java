class Demo{
	int n;
	Demo(int a){
		n=a;
	}
	Demo square(){
		Demo ob = new Demo(n*n);
		return ob;
	}
}
class class9objectReturn{
	public static void main(String args[]){
		Demo obj1 = new Demo(5);
		Demo obj2;

		obj2=obj1.square();
		System.out.println("obj1.n  :-"+obj1.n);
		System.out.println("obj2.n  :-"+obj2.n);
	}
}