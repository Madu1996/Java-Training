public class BathingSoap extends soapDispensor{
	public BathingSoap(soapDispensor dispensor){
		super(dispensor);
	}
	
	public void dispense(Soap soap){
		if(soap.getCOuntTFM() >=4 && soap.getCOuntTFM() <=6){
			System.out.println("is suitable for Bathing soap.");
		}else{
			super.dispense(soap);
		}
	} 
}