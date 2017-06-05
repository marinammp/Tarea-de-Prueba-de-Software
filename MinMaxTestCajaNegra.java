import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertNull;

import org.junit.Test;

public class MinMaxTestCajaNegra {
	@Test
	public void testArrayDeDatosVacio() {
		int[] datos={};
		assertNull(MinMax.minMax(datos));
		
	}
	
	@Test
	public void tesConDatos() {
		int[] datos= {1,2,3};
		int[] resultados={1,3};
		assertArrayEquals(resultados,MinMax.minMax(datos));
		
	}
	
	@Test
	public void tesConDatosNegativos() {
		int[] datos= {-1,-6,3};
		int[] resultados={-6,3};
		assertArrayEquals(resultados,MinMax.minMax(datos));
	}	
	

}
