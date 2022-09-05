class EqualImplementation{
	private Integer id;
	private Integer code;
	private String name, nic, address;
	
	
	public void setEmployeeDetails(Integer id, Integer code){
		this.id = id;
		this.code = code;	
	}
	 
	 public Integer getId(){
		return id;
	}
	
	public Integer getCode(){
		return code;
	}
}
public class TestEqualImplementation{
	public static void main(String args[]){
		EqualImplementation obj1 = new EqualImplementation();
		obj1.setEmployeeDetails(320,23);
		
		EqualImplementation obj2 = new EqualImplementation();
		obj2.setEmployeeDetails(23,320);
		
		if(obj1.getId().equals(obj2.getCode())){
			System.out.println("Given both employees are same.");
		}else{
			System.out.println("Given both employees are not same.");
		}
	}
}