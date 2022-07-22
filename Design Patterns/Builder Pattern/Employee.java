public class Employee{
	private final String name;
	private final int age;
	private final String address;
	private final boolean etc;
	
	 public Employee(Builder builder){
			this.name = builder.name;
			this.age = builder.age;
			this.address = builder.address;
			this.etc = builder.etc;
		}
		
	static class Builder{
		private String name;
	    private int age;
	    private String address;
	    private boolean etc;
		
		public Builder(String name, int age, String address){
			this.name = name;
			this.age = age;
			this.address = address;
		}
		public Employee build(){
			return new Employee(this);
		}
		public Builder name(String name){
			this.name = name;
			return this;
		}
		public Builder etc(Boolean etc){
			this.etc = etc;
			return this;
		}
		public Builder age(int age){
			this.age = age;
			return this;
		}
		public Builder address(String address){
			this.address = address;
			return this;
		}
	}
	
	public String toString(){
		return "Employee{" + 
		                 "Name :" + name + '\'' +
						 ",Etc :" + etc + 
						 ",Age :" + age + '\'' +
						 ",Address :" + address + '\''+
		                 '}';
	}
}