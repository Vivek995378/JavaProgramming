import java.io.*;

class item{
	BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
	String name,str;
	double qty,amt,rate,tax,net,dis;
	void calc(){
		amt=rate*qty;
		tax=amt*0.14;
		net=amt+tax;
		if(amt>=1500)
			dis=amt*0.12;
		else if(amt>=1000)
			dis=amt*0.10;
		else if(amt>=800)
			dis=amt*0.08;
		else if(amt>=500)
			dis=amt*0.05;
		else 
			dis=amt*0;
		net=net-dis;
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
		System.out.println("Discount is:-"+dis);
		System.out.println("Net Amoount:-"+net);
	}
}
class class5{
	public static void main(String args[]) throws IOException{
		item obj = new item();
		obj.getData();
		obj.showData();
	}
}