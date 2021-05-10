class Student{
	int rollno;
	String name;
	static String college="Bharti Computers";    //static variable
	Student(int r,String n){
		rollno=r;
		name=n;
	}
	void display(){
		System.out.println(" "+rollno+" "+name+" "+college);
	}
}
class classStaticVariable{
	public static void main(String args[]){
		Student s1 = new Student(111,"Shivam");
		Student s2 = new Student(222,"Aryan");
		s1.display();
		s2.display();
	}
}