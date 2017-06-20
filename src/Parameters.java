
public class Parameters {
	
	int c;
	void add(int a, int b)
	{
		c=a+b;
		System.out.println(c);
	}
	
	public static void main(String[] args) {
		
		Parameters obj=new Parameters();
		
		obj.add(10, 20);
	}

}
