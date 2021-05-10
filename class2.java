class bill{
	double rate;
	double qty;
	double amt;
	void calc(){
		amt=rate*qty;
		System.out.println("Amount is:-"+amt);
	}
}
class class2{
	public static void main(String args[]){
		bill obj = new bill();
		obj.rate=20;
		obj.qty=2;
		obj.calc();
	}
}