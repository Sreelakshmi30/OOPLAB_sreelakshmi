import java.util.*;
class complex{
  double r,i,re,im;
public static void main(String a[])
{
	Scanner sc=new Scanner(System.in);
	complex c=new complex();
	complex c1=new complex();
	System.out.println("Enter the complex number a:");
	c.r=sc.nextDouble();
	c.i=sc.nextDouble();
	System.out.println("Enter the complex number b:");
	c1.r=sc.nextDouble();
	c1.i=sc.nextDouble();
	double sr=c1.r+c.r;
	double si=c1.i+c.i;
	System.out.println("Sum:"+sr+"+"+si+"i");
}
}

OUTPUT
-------

C:\Users\Admin\Desktop\oops>javac complex.java

C:\Users\Admin\Desktop\oops>java complex
Enter the complex number a:
2
4
Enter the complex number b:
3
5
Sum:5.0+9.0i

C:\Users\Admin\Desktop\oops>
