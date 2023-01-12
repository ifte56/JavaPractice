package javafinal;

public class Test1 {
	class Test
	{
		int x=100;   // constant value - we cannot change
	}



		public static void main(String[] args) {
		
			Test t=new Test();
			
			t.x=200; // incorrect, bcoz x is final variable
			
			System.out.println(t.x);

		}

	}

