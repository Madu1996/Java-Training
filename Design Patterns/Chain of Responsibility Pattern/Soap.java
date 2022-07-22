public class Soap{
	private String soapName;
	private int CountTFM;
	private int weight;
	private int expiryyear;
	
	public Soap(String soapName, int CountTFM, int weight, int expiryyear){
		super();
		this.soapName = soapName;
		this.CountTFM = CountTFM;
		this.weight = weight;
		this.expiryyear = expiryyear;
	}
	public String getSoapName(){
		return soapName;
	}
	public void setSoapName(String soapName){
		this.soapName = soapName;
	}
	public int getCOuntTFM(){
		return CountTFM;
	}
	public void setCountTFM(int CountTFM){
		this.CountTFM = CountTFM;
	}
	public int getWeight(){
		return weight;
	}
	public void setWeight(int weight){
		this.weight = weight;
	}
	public int getExpiryYear(){
		return expiryyear;
	}
	public void setExpiryYear(int expiryyear){
		this.expiryyear = expiryyear;
	}
}