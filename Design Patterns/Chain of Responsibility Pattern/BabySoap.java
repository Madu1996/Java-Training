public class BabySoap extends soapDispensor{
	public BabySoap(soapDispensor dispensor){
		super(dispensor);
	}
	
	public void dispense(Soap soap){
		if(soap.getCOuntTFM() >=2 && soap.getCOuntTFM() <= 4){
			System.out.println("is suitable for Baby Soap.");
		}else{
			super.dispense(soap);
		}
	} 
}