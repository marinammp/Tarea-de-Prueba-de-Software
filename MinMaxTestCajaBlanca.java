import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertNull;

public class MinMaxTestCajaBlanca {

	@Test
	public void statementCoverage() {
		// realiza el número mínimo de tests para alcanzar la cobertura de sentencias
		int[] datos1 = {};
		assertNull(MinMax.minMax(datos1));

		int[] datos2 = { 1, 2, 3 };
		int[] resultados2 = { 1, 3 };
		assertArrayEquals(resultados2, MinMax.minMax(datos2));
		
		int[] datos3 = { -1, -6, 3 };
		int[] resultados3 = { -6, 3 };
		assertArrayEquals(resultados3, MinMax.minMax(datos3));
	}


	@Test
	public void decisionCoverage() {
		// realiza el número mínimo de tests para alcanzar la cobertura de decisiones
		int[] datos1 = {};
		assertNull(MinMax.minMax(datos1));
		
		int[] datos2 = { 1, 2, 3 };
		int[] resultados2 = { 1, 3 };
		assertArrayEquals(resultados2, MinMax.minMax(datos2));		

	}

	@Test
	public void conditionCoverage() {
		// realiza el número mínimo de tests para alcanzar la cobertura de condiciones		
		int[] datos = { 0, 6, 3, -1,-6 };
		int[] resultado = { -6, 6 };
		assertArrayEquals(resultado, MinMax.minMax(datos));
		
	}

	@Test
	public void decisionConditionCoverage() {
		// realiza el número mínimo de tests para alcanzar la cobertura de decisiones y condiciones
		int[] datos1 = {};
		assertNull(MinMax.minMax(datos1));
		
		int[] datos2 = { 0, 6, 3, -1,-6 };
		int[] resultado = { -6, 6 };
		assertArrayEquals(resultado, MinMax.minMax(datos2));

	}
}
