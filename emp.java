package empolyee;

public class emp {

		 public static void main(String[] args){
		     Employee e1 = new Employee("Robert", 1994, "64C-WallStreet");
		     Employee e2 = new Employee("Sam", 2000,  "68D-WallStreet");
		     Employee e3 = new Employee("John", 1999, "26B-WallStreet");
		     System.out.println("Name\tYear of joining  \tAddress");
		     System.out.println(e1.getName()+"\t"+e1.getYear() +"\t\t\t"+e1.getAddress());  // printing details of employee 1
		     System.out.println(e2.getName()+"\t"+e2.getYear() +"\t\t\t"+e2.getAddress());  // printing details of employee 2
		     System.out.println(e3.getName()+"\t"+e3.getYear() +"\t\t\t"+e3.getAddress()); 
		     
		   }
		
	
	
}
