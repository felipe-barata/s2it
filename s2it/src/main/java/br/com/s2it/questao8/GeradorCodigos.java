package br.com.s2it.questao8;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GeradorCodigos {

	private static Logger logger = LoggerFactory.getLogger(GeradorCodigos.class);

	public long executar(String a, String b) {
		long aa = (a != null && !a.isEmpty()) ? Long.parseLong(a) : 0;
		long bb = (b != null && !b.isEmpty()) ? Long.parseLong(b) : 0;
		return executar(aa, bb);
	}

	public long executar(long aa, long bb) {
		if (aa <= 0 || bb <= 0) {
			logger.warn("executar - nao foram informados valores de entrada");
			return 0;
		}
		String a = String.valueOf(aa);
		String b = String.valueOf(bb);
		logger.info("executar - a:{}, b:{}", a, b);
		StringBuffer c = new StringBuffer();
		int limite = Math.max(a.length(), b.length());
		for (int i = 0; i <= limite; i++) {
			if (i < a.length()) {
				c.append(a.charAt(i));
			}
			if (i < b.length()) {
				c.append(b.charAt(i));
			}
		}
		long aux = (c!= null && !c.toString().isEmpty()) ? Long.parseLong(c.toString()) : -1;
		logger.info("executar - aux:{}", aux);
		if (aux > 1000000) {
			logger.warn("executar - resultado invalido, nao retornar");
		} else {
			logger.info("executar - resultado valido, retornar em c");
			return aux;
		}
		return -1;
	}

}
