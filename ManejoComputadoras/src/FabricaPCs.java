

public class FabricaPCs {
	
	private ConstruirComputador computador;
	
	public void construirPC() {
		
		
		
		
		computador.DefinirComputador();
		computador.DefinirCoolerExterno();
		computador.DefinirAlmacenamiento();
		computador.ConstruirMainboard();
		computador.ConstruirSO();
	}
	
	public void setConstruirComputador(ConstruirComputador pc) {
		computador = pc;
	}
	
	public Computador getComputador() {
		return computador.getComputador();
	}

}
