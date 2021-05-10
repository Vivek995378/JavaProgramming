class Demo{
	int a,b;
	Demo(int i,int j){
		a=i;
		b=j;
	}
	boolean equals(Demo ob){     //function of boolean type
		if(ob.a==a&&ob.b==b)
			return true;
		else
			return false;
	}
}
class class9objectDemo{
	public static void main(String args[]){
		Demo obj1 = new Demo(50,70);
		Demo obj2 = new Demo(50,70);
		Demo obj3 = new Demo(120,230);

		System.out.println("obj1 == obj2:-"+obj1.equals(obj2));
		System.out.println("obj1 == obj3:-"+obj1.equals(obj3));
	}
}