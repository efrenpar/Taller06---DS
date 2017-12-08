package emsamablajecomputadoras.creacional;

public class FabricaPCs {
	
	private ConstruirComputador computador;
	
	public void construirPC() {
		
		computador.ConstruirMainboard();
		computador.ConstruirSO();
		computador.DefinirAlmacenamiento();
		computador.DefinirComputador();
		computador.DefinirCoolerExterno();
		
	}
	
	public void setConstruirComputador(ConstruirComputador pc) {
		computador = pc;
	}
	
	public Computador getComputador() {
		return computador.getComputador();
	}

}
