

public class TestFinal extends AbstractTest{

	@Override
	protected void write(String Messagge) {
		System.out.println("test final: "+Messagge);
		
	}

	@Override
	protected boolean testing(Computador computador) {
	if(computador.placa.toString().equalsIgnoreCase("Strix x99") && computador.ram.toString().equalsIgnoreCase("ddr4 32")) {
			
			return true;
		}
		else if(computador.placa.toString().equalsIgnoreCase("Prime z370") && computador.ram.toString().equalsIgnoreCase("ddr3 16")){
			return true;
			
		}
		else {
			
			return false;
		}
	
	}

}
