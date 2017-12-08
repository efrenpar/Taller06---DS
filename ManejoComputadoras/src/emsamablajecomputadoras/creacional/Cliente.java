package emsamablajecomputadoras.creacional;

public class Cliente {

	public static void main(String[] args) {
		
		FabricaPCs director = new FabricaPCs();
		director.setConstruirComputador(new AsusRoge());
		director.construirPC();
		Computador pc = director.getComputador();
		
		System.out.println(pc.getModelo());
		System.out.println(pc.getOs());
		System.out.println(pc.getPlaca());
	}

}
