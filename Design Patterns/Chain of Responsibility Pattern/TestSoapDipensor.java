public class TestSoapDipensor{
	public static void main(String [] args){
		Chain chain = new Chain();
		
		Soap soap1 = new Soap("Baby Cheramy", 2, 175, 2023);
		System.out.print(soap1.getSoapName()+" ");
		chain.dispense(soap1);
		
		Soap soap2 = new Soap("Lux", 5, 150, 2023);
		System.out.print(soap2.getSoapName()+" ");
		chain.dispense(soap2);
		
		Soap soap3 = new Soap("Sunlight", 7, 180, 2023);
		System.out.print(soap3.getSoapName()+" ");
		chain.dispense(soap3);
		
		Soap soap4 = new Soap("Vim", 0, 125, 2023);
		System.out.print(soap4.getSoapName()+" ");
		chain.dispense(soap4);
	}
}