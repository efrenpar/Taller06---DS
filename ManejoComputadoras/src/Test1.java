

public class Test1 extends AbstractTest{

	
	
	public Test1(int level) {
		
		this.level = level;
	}
	

	@Override
	protected void write(String Messagge) {
		System.out.println("test1: "+Messagge);
		
	}

	@Override
	protected boolean testing(Computador computador) {
		if(computador.marca.equalsIgnoreCase("Asus") && computador.toString().equalsIgnoreCase("Windows 10 PRO 64 bits") ) {
			return true;
		}
		else
			return false;
	}

}
