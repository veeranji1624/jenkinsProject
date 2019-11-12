/*class Demo
{
	int n=20;
	char c1='2';
	public static void main(String[] args) 
	{
		new Demo().test();
	}
	public void test()
	{
		System.out.println(n);
		System.out.println(c1);
	}
}*//*
class Demo
{
	public static void main(String[] args) 
	{
			new Team();
			new Team(1);
	}
}
class Team
{
	public Team()
	{
		//this(1);
		System.out.println("veeranji");
		return;
	}
	public Team(int n1)
	{
		System.out.println("reddy");
	}
}*//*
class Demo
{
	String name ;
	int no;
	double marks;
	public Demo(String name,int no,double marks)
	{
		this.name=name;
		this.no=no;
		this.marks=marks;
	}public void showDetils()
	{
		System.out.println("name:"+name);
		System.out.println("no:"+no);
		System.out.println("marks:"+marks);
	}
	public static void main(String[] args) 
	{
		Demo d1=new Demo("veeranji",24,23);
		d1.showDetils();
		
		
	}
}*//*
class Demo
{
	public static void main(String[] args) 
	{
			new Team(1);
	}
}
class Team
{
	public Team(int i1)
	{
		this(1,'2');
		System.out.println("this is i1="+i1);
	}
	public Team(int i1,char i2)
	{
		this(3,4);
		System.out.println("this is i2="+i2);
	}
	public Team(int i1,double d1)
	{
		this(5,"26363");
		System.out.println("this is double d1="+d1);
	}
	public Team(double d1,String s1)
	{
		System.out.println("this is String="+s1);
	}
}*/
import java.util.Scanner;
class Demo
{
	public static void main(String[] args) 
	{
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the array size?");
			int size=sc.nextInt();
			int a1[]=new int[size];
			for(int i=0;i<size;i++)
			{
				a1[i]=sc.nextInt();
			}
			for (int i=0;i<a1.length;i++)
			{
				System.out.println(a1[i]+" ");
			}
			int n = test(a1);
			System.out.println("avrage"+n);
	}
	public static int test(int a1[])
	{
		int count=0;
		int add=0;
		for (int i=0;i<a1.length;i++)
		{	
			if(i%2==1)
			{
				count++;
				add=add+a1[i];
			}
		}
	
		return (add/count);
	}
}
/*
import java.util.Scanner;
class Demo
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first array size:");
		int size=sc.nextInt();
		int a[]=new int[size];
		for(int i=0;i<size;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("enter second array size:");
		int size2=sc.nextInt();
		int a2[]=new int[size2];
		for(int i=0;i<size2;i++)
		{
			a2[i]=sc.nextInt();
		}
		new Demo().test(a,a2);
	}
	public void test(int[] a,int[] a2)
	{
		int[] a3=new int[a2.length];
		for(int i=0;i<a2.length;i++)
		{
			a3[i]=a[i]+a2[i];
			System.out.println("i="+a3[i]);

		}
	}
}*//*
class Demo
{
	public static void main(String[] args) 
	{
		int q=4;
		System.out.println(q++);
		System.out.println(q);
		System.out.println(++q);
		char a='6';
		System.out.println(a++);
		System.out.println(a);		
	}
}*/