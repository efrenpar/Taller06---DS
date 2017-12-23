

public class TestIntermedio extends AbstractTest {
	
	
	public TestIntermedio(int level) {
		
		this.level = level;
	}

	@Override
	protected void write(String Messagge) {
		System.out.println("test intermedio: "+Messagge);
		
	}

	@Override
	protected boolean testing(Computador computador) {
		if(computador.modelo.equalsIgnoreCase("Rog") && computador.almacenamiento.toString().equalsIgnoreCase("HDD 1000") && computador.ram.toString().equalsIgnoreCase("ddr4 32")) {
			
			return true;
		}
		else if(computador.modelo.equalsIgnoreCase("Zenbook") && computador.almacenamiento.toString().equalsIgnoreCase("SSD 500") && computador.ram.toString().equalsIgnoreCase("ddr3 16")){
			return true;
			
		}
		else {
			
			return false;
		}
	}

}
