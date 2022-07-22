public class Chain{
	soapDispensor chain;
	
	public Chain(){
		buildChain();
	}
	private void buildChain(){
		chain = new BabySoap(new BathingSoap(new WashingSoap(null)));
	}
	public void dispense(Soap soap){
		chain.dispense(soap);
	}
}