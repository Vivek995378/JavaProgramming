import java.io.*;

class item{
	BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
	String name,str;
	double qty,rate,amt,tax,net;
	void calc(){
		amt = rate*qty;
		tax = amt*0.14;
		net = amt+tax;
	}
	void getData() throws IOException{
		System.out.println("Enter name:-");
		name = br.readLine();
		System.out.println("Enter quantity:-");
		str = br.readLine();
		qty=Integer.parseInt(str);
		System.out.println("Enter rate:-");
		str = br.readLine();
		rate=Integer.parseInt(str);
		calc();
	}
	void showData(){
		System.out.println("Name is:-"+name);
		System.out.println("Quantity:-"+qty);
		System.out.println("Rate:-"+rate);
		System.out.println("Amount:-"+amt);
		System.out.println("Tax:-"+tax);
		System.out.println("Net Amoount:-"+net);
	}
}
class class4{
	public static void main(String args[]) throws IOException{
		item obj = new item();
		obj.getData();
		obj.showData();
	}
}