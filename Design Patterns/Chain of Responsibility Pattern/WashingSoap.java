public class WashingSoap extends soapDispensor{
	public WashingSoap(soapDispensor dispensor){
		super(dispensor);
	}
	
	public void dispense(Soap soap){
		if(soap.getCOuntTFM() > 6){
			System.out.println("is suitable for Washing soap.");
		}else{
			super.dispense(soap);
		}
	} 
}