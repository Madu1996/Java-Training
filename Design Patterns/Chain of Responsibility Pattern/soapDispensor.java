public abstract class soapDispensor{
	private soapDispensor dispensor;
	
	public soapDispensor(soapDispensor dispensor){
		this.dispensor = dispensor;
	};
	public void dispense(Soap soap){
		if(dispensor != null){
			dispensor.dispense(soap);
		}else{
			System.out.println("is Unfavorable soap type for using body.");
		}
	};
}