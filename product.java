import java.util.*;
class product{
   int pcode,price;
   String pname;
public static void main(String args[]){
  Scanner sc=new Scanner(System.in);
  product[] p=new product[3];
  for(int i=0;i<3;i++)
  {
	System.out.println("Enter the data:");
	p[i]=new product();
	p[i].pcode=sc.nextInt();
	p[i].price=sc.nextInt();
	p[i].pname=sc.next();
  }

if(p[0].price<p[1].price)
{
   if(p[0].price<p[2].price)
     System.out.println(p[0].price+" is smallest price");
   else
     System.out.println(p[1].price+" is smallest price");
}
   else if(p[1].price<p[2].price)
     System.out.println(p[1].price+" is smallest price");
   else
     System.out.println(p[2].price+" is smallest price");
}	
}

OUTPUT
--------
C:\Users\Admin\Desktop\oops>javac product.java
C:\Users\Admin\Desktop\oops>java product
Enter the data:
101
5
Lexi
Enter the data:
102
8
Cello
Enter the data:
103
10
Reynolds
5 is smallest price

C:\Users\Admin\Desktop\oops>
	