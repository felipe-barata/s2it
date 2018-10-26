package  br.com.s2it.questao8;

import br.com.s2it.questao8.GeradorCodigos;
import junit.framework.TestCase;

public class GeradorCodigosTeste extends TestCase{

	public void testaNumeroMaiorQueUmMilhao() {
		GeradorCodigos ger = new GeradorCodigos();
		assertTrue(ger.executar(1234567, 123456789) < 0);
	}
	
	public void testaBMenorA() {
		GeradorCodigos ger = new GeradorCodigos();
		assertTrue(ger.executar(106, 52) == 15026);
	}
	
	public void testaBMaiorA() {
		GeradorCodigos ger = new GeradorCodigos();
		assertTrue(ger.executar(52, 106) == 51206);
	}
	
	public void testa() {
		GeradorCodigos ger = new GeradorCodigos();
		assertTrue(ger.executar(152, 106) == 115026);
	}
}
