

public class Cliente {

	public static void main(String[] args) {
		
		FabricaPCs director = new FabricaPCs();
		director.setConstruirComputador(new AsusZenbook());
		director.construirPC();
		Computador pc = director.getComputador();
		
		ComputerType asusGamer = new Gamer(pc);
		
		
		AbstractTest chainTester = getChainOfTesters();
		chainTester.testingMesagge(AbstractTest.testInicial, "hubo un error", pc);
		
		
		
		System.out.println(asusGamer.especificacionesTecnicas());
	}
	
	private static AbstractTest getChainOfTesters() {
		
		AbstractTest Test1 = new Test1(AbstractTest.testInicial);
		AbstractTest TestIntermedio = new Test1(AbstractTest.testIntermedio);
		AbstractTest TestFinal = new Test1(AbstractTest.testFinal);
		
		Test1.setNextTest(TestIntermedio);
		TestIntermedio.setNextTest(TestFinal);
		
		return Test1;
	}

}
