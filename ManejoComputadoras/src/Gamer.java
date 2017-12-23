


public class Gamer extends Decorator {
	public Memoria ram;

	public Gamer(ComputerType pc) {
		super(pc);
		ram = new Memoria();
		ram.capacidad = 16;
		ram.tipo = "ddr";
	}
	
	public String especificacionesTecnicas(){
        return  " Gamer" + super.computador.especificacionesTecnicas() +" Memoria Ram Extendida: "+this.ram.capacidad+ " Gb " + this.ram.tipo+"\n"; 
    }
	

}