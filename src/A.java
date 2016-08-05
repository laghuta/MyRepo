class A{  
A(){  
System.out.println("parent class constructor invoked");  
} 
static void abc(){
	System.out.println("parent abc");
	
}
}  
class B2 extends A{  
B2(){  
super();  
System.out.println("child class constructor invoked");  
}  
  
{System.out.println("instance initializer block is invoked");}  
 static  void abc(){
	 System.out.println("child  abc");
	
}
public static void main(String args[]){  
B2 b=new B2();  
}  
}  
