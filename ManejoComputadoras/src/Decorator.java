

public abstract class Decorator implements ComputerType {
	public ComputerType computador;
	
	public Decorator(ComputerType computador){
		this.computador = computador;
	}

	@Override
	public String especificacionesTecnicas() {
		return this.computador.especificacionesTecnicas();
	}
	
}
