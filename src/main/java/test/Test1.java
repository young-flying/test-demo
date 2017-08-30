package test;
class A  
{  
    static  
    {  
        System.out.println("A静态代码块");  
    }  
    {  
        System.out.println("A构造块");  
    }  
      
    public A(int a)  
    {  
        System.out.println("A构造方法：" + a);  
    }  
}  
class B extends A  
{  
    static A aa = new A(1);  
      
    A aaa = new A(2);  
      
    static  
    {  
        System.out.println("B静态代码块");  
    }  
      
    {  
        System.out.println("B构造块");  
    }  
      
    public B(int a)  
    {  
        super(a);  
        System.out.println("B构造方法：" + a);  
    }     
}  
  
public class Test1  
{  
    public static void main(String[] args)  
    {  
        new B(100);  
    }  
}  