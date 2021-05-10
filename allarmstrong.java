class allarmstrong{
	public static void main(String args[]) {
		int i,n,s,r,cube;
		System.out.println("All armstrong numbers are:-");
		for(i=100;i<=999;i++){
			n=i;
			s=0;
			cube=0;

			while(n>=1){
				r=n%10;
				cube=r*r*r;
				s+=cube;
				n/=10;
			}
			if(s==i)
				System.out.print(s + " ");

		}
	}
}