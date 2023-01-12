package javafinal;

public class ContinueStatement {
public static void main(String[] args) {
		

		for(int i=1;i<=10;i++)  //1  2  3  4
		{
			if(i==1 || i==3 || i==5) //false   false  true
			{
				continue;
			}
			
			System.out.println(i);  //1   2  4 5
		}
		
		
	}


}
