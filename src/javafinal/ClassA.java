package javafinal;

public class ClassA {

	public static void main(String[] args) {	
		int a;
		
		void display()
		{
			System.out.println(a);
		}
	}


	class B extends A
	{
		int b;
		
		void show()
		{
			System.out.println(b);
		}
		
	}

	class C extends B
	{
		int c;
		public int a;
		
		void print()
		{
			System.out.println(c);
		}

		public void display() {
			// TODO Auto-generated method stub
			
		}
			
	}

