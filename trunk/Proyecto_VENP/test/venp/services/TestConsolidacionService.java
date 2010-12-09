package venp.services;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class TestConsolidacionService {
	
	ConsolidacionService consolidacion;
	
	@Before
	public void setUp() throws Exception {
		consolidacion = new ConsolidacionService();
	}
	
	@Test
	public void listarResultados(){
		try {
			assertNotNull(consolidacion.listarResultados());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void listarResultadosFinales(){
		try {
			assertNotNull(consolidacion.listarResultadosFinales());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
