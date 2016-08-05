package abstractInterfaces;

public class getset {
	
	private String name;
	private int age;
	private String gender;
	
	int getage(){
		return age;
	}
	
	void setage(int a){
		age=a;
	}	
	
	public String getname(){
		return name;
	}
	
	 public void setname(String n){
		name = n;
		
	}
	 
		public String getgender(){
			return gender;
		}
		
		 public void setgender(String g){
			gender=g;
			
		}
		
		
	


	
	public static void main(String args[]){
	
	getset amit = new getset();
	amit.age=32;
	amit.gender="M";
	amit.name="muname";
	System.out.println(amit.getname()+" " +amit.getage()+" "+amit.getgender());
	}
	
}
	