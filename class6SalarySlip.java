import java.io.*;

class slip{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	String name,depart,desig,str;
	double bs,hra,da,ta,pf,it,netSalary;
	void calc(){
		hra=bs*0.24;
		da=bs*0.26;
		ta=bs*0.20;
		pf=bs*0.12;
		it=bs*0.07;
		netSalary=bs+hra+da+ta-pf-it;
	}
	void getData() throws IOException{
		System.out.println("Enter Name:-");
		name=br.readLine();
		System.out.println("Enter Designation:-");
		desig=br.readLine();
		System.out.println("Enter Department:-");
		depart=br.readLine();
		System.out.println("Enter BasicSalary:-");
		str=br.readLine();
		bs=Integer.parseInt(str);
		calc();
	}
	void showData(){
		System.out.print("\n\t\t    ABC Pvt. Ltd.");
		System.out.print("\n\t\tNajafgarh New Delhi-43");
		System.out.print("\nEmployee Name:-"+name);
		System.out.print("\nDesignation:-"+desig);
		System.out.print("\nDepartment:-"+depart);
		System.out.print("\nBasic Salary:-"+bs);
		System.out.print("\n\t\t     SALARY SLIP");
		System.out.print("\n----------------------------------------------------------------");
		System.out.print("\nParticulars  \t  Percentage  \t  Amount");
		System.out.print("\n----------------------------------------------------------------");
		System.out.print("\nHRA  \t  24% of BASIC  \t"+hra);
		System.out.print("\nDA   \t  26% of BASIC  \t"+da);
		System.out.print("\nTA   \t  20% of BASIC  \t"+ta);
		System.out.print("\nPF   \t  12% of BASIC  \t"+pf);
		System.out.print("\nIT   \t  7% of BASIC   \t"+it);
		System.out.print("\n----------------------------------------------------------------");
		System.out.print("\n NET SALARY\t:-"+netSalary);
		System.out.print("\n----------------------------------------------------------------");
	}
}
class class6SalarySlip{
	public static void main(String args[]) throws IOException{
		slip obj=new slip();
		slip obj1=new slip();
		obj.getData();
		obj1.getData();
		obj.showData();
		obj1.showData();
	}
}