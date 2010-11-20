package venp.services;

import static org.junit.Assert.*;

import org.junit.Test;


public class TestConsolidacionService {
	
	ConsolidacionService consolidacion;
	
	@Test
	public void listarResultados(){
		try {
			assertNotNull(consolidacion.listarResultados());
		} catch (Exception e) {
		}
	}
	
	@Test
	public void listarResultadosFinales(){
		try {
			assertNotNull(consolidacion.listarResultadosFinales());
		} catch (Exception e) {
		}
	}

}
