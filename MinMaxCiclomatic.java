import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertNull;

import org.junit.Test;

public class MinMaxCiclomatic {

	
	@Test
	public void caminoABL() {
		int[] datos = {};
		assertNull(MinMax.minMax(datos));
	}
	@Test
	public void caminoABCD1D2KL() {
		//Esta branch no puede ser probada
	}
	
	@Test
	public void caminoABCD1D2FGHID3D2KL(){
		int[] datos = {1,2};
		int[] resultados={1,2};
		assertArrayEquals(resultados,MinMax.minMax(datos));		
		
	}
	@Test
	public void caminoABCD1D2FGIJD3D2KL() {
		int[] datos = {2,1};
		int[] resultados={1,2};
		assertArrayEquals(resultados,MinMax.minMax(datos));		

	}
	@Test
	public void caminoABCD1D2FGID3D2KL() {
		int[] datos = {1,1};
		int[] resultados={1,1};
		assertArrayEquals(resultados,MinMax.minMax(datos));		

	}

}
