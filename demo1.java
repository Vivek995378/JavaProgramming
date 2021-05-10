import mypkg.*;

class demo1 {
	public static void main(String args[]){
		lib1 obj=new lib1();
		System.out.println("The sum is "+obj.sum(4,5));
		System.out.println("The multiplication is "+obj.mul(3,4));
		System.out.println("The difference is "+obj.sub(3,4));
		System.out.println("The division is "+obj.div(6,3));
	}
}