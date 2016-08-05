

public class Child extends Parent {  
	
/*	{
		System.out.println("2-Child initialisation block");
	}
	public Child()
	
	
	{
        System.out.println("Child Constructor");
    }
    {
        System.out.println("1- Child initialisation block");
    }
    
    static {
        System.out.println("Child static block");
    }*/
    public void abc(){
    	System.out.println("i am learning and i will keep on learning - childclass");
    }
   
	
        
    public  void main(String[] args) {
       Parent p = new Child(); 
       //Parent.abc();
       p.abc();
    }
}