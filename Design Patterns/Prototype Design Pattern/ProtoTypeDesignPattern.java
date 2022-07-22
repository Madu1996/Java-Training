import java.util.List;
import java.util.ArrayList;

class Vehicle implements Cloneable {
  private List<String> vehicleList;
  
  public Vehicle() {
    this.vehicleList = new ArrayList<String>();
  }
  
  public Vehicle(List<String> list) {
    this.vehicleList = list;
  }
  
  public void insertData() {
    vehicleList.add("Benz CD-250");
    vehicleList.add("BMW I8");
    vehicleList.add("Honda Civic");
    vehicleList.add("Ford Mustang");
    vehicleList.add("Range Rover");
  }
  
  public List<String> getVehicleList() {
    return this.vehicleList;
  }
  
  @Override
  public Object clone() throws CloneNotSupportedException {
    List<String> temp = new ArrayList<String>();
    
    for(String s : this.getVehicleList()) {
      temp.add(s);
    }
    
    return new Vehicle(temp);
  }
}

public class ProtoTypeDesignPattern {

  public static void main(String[] args) throws CloneNotSupportedException {
    Vehicle a = new Vehicle();
    a.insertData();
    
	System.out.println(a.getVehicleList());
    Vehicle b = (Vehicle) a.clone();
    List<String> list = b.getVehicleList();
    list.add("Honda Grace");
    System.out.println(list);
    
	System.out.println();
    b.getVehicleList().remove("Ford Mustang");
    System.out.println(list);
	
    System.out.println(a.getVehicleList());
  }

}