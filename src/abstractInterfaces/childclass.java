package abstractInterfaces;

import java.util.Collection;
import java.util.HashSet;

public class childclass extends parentclass {
	
	void childclass1(){
		super.parentclass1();
		 System.out.println("childclass const");
	 }
	

	 public static void main(String args[]){
		 
		 childclass cc = new childclass();
		 cc.childclass1();
		 
		 
	 }

}
