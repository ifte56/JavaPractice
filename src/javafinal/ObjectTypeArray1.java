package javafinal;

public class ObjectTypeArray1 {
public static void main(String[] args) {
	
		
		Object a[]=new Object[6];
		
		a[0]=10;
		a[1]=10.5;
		a[2]="welcome";
		a[3]='A';
		a[4]=true;
		a[5]="Hello";
		/*for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}*/
		
		for(Object x:a)
		{
			System.out.println(x);
		}
		
}
}