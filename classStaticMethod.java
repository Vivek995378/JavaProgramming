class classStaticMethod{
	static int i = 123;
	static String str = "Bharti";
	static void display(){     //static function
		System.out.println("i :-"+i);
		System.out.println("str :-"+str);
	}
	void func(){              //non-static function
		display();          //calling static function
	}
	public static void main(String args[]){
		classStaticMethod obj = new classStaticMethod();
		obj.func();     //calling non-static function via object
		display();      //calling static function without object
	}
}