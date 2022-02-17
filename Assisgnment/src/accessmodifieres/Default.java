package accessmodifieres;

public class Default {
	
	class defAccessSpecifier
	{ 
	  void display() 
	     { 
	         System.out.println("You are using defalut access specifier"); 
	     } 
	} 

	

		public void main(String[] args) {
			//default
			System.out.println("Dafault Access Specifier");
			defAccessSpecifier obj = new defAccessSpecifier(); 		  
	        obj.display(); 

		}
	}


	