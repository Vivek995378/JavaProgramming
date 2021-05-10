class outer{
	private int num=175;
	public class inner{
		public int getNum(){
			System.out.println("This is the getNum method of inner class");
			return num;
		}
	}
}
class nestedClass{
	public static void main(String args[]){
		outer out = new outer();
		outer.inner in = out.new inner();
		System.out.println(in.getNum());
	}
}