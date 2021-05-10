import java.io.*;

class bill{
	double rate;
	double qty;
	double amt;
	double calc(){
		amt = rate * qty;
		return amt;
	}
}
class class1{
	public static void main(String args[]) {
		double result;
		bill obj = new bill();
		obj.rate=25;
		obj.qty=4;
		result= obj.calc();
		System.out.println("The result is:-"+result);

	}
}