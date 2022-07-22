public class AddEmployee{
	public static void main(String [] args){
		/* Employee.Builder builder = new Employee.Builder("Saman");
        Employee e1 = builder.age(24).address("Kandy").build();
        System.out.println(e1);  */	

          Employee e1 = new Employee.Builder("Saman", 24, "Kandy").build();
          System.out.println(e1);		  
	}
}