import java.io.*;

class student{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	String name,str;
	double a,b,c,d,e;
	void getData() throws IOException{
		System.out.println("Enter name:-");
		name=br.readLine();
		System.out.println("Enter marks in hindi:-");
		str=br.readLine();
		a=Integer.parseInt(str);
		System.out.println("Enter marks in english:-");
		str=br.readLine();
		b=Integer.parseInt(str);
		System.out.println("Enter marks in maths:-");
		str=br.readLine();
		c=Integer.parseInt(str);
		System.out.println("Enter marks in science:-");
		str=br.readLine();
		d=Integer.parseInt(str);
		System.out.println("Enter marks in history:-");
		str=br.readLine();
		e=Integer.parseInt(str);
	}
	void showData(){
		System.out.println("Name is:-"+name);
		System.out.println("Marks in hindi:-"+a);
		System.out.println("Marks in english:-"+b);
		System.out.println("Marks in maths:-"+c);
		System.out.println("Marks in science:-"+d);
		System.out.println("Marks in history:-"+e);
	}
}
class class3{
	public static void main(String args[]) throws IOException{
		student obj = new student();
		obj.getData();
		obj.showData();
	}
}