

public abstract class AbstractTest {
	
	public static int testInicial=1;
	public static int testIntermedio=2;
	public static int testFinal = 3;
	public AbstractTest nextTest;
	protected int level;
	
	public void setNextTest(AbstractTest nextTest) {
		this.nextTest = nextTest;
		
		
	}
	public void testingMesagge(int level , String Messagge,Computador pc) {
		if(testing(pc)) {
			
			nextTest.testingMesagge(level, Messagge,pc);
		}
		else 
			write(Messagge);
		
		
	}
	abstract protected void write(String Messagge) ;
	abstract protected boolean testing(Computador computador);

}
