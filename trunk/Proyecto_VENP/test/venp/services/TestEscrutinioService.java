package venp.services;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class TestEscrutinioService {

	EscrutinioService escrutinioService;
	
	@Before
	public void setUp() throws Exception {
		escrutinioService = new EscrutinioService();
	}
	
	@Test
	public void testListarDetalleEscrutinio(){
		try {
			assertNotNull(escrutinioService.listarDetalleEscrutinio("0"));
		} catch (Exception e) {		
			e.printStackTrace();
		}
	}
	
	@Test
	public void testListarDetalleLocacion(){
		try {
			assertNotNull(escrutinioService.listarDetalleLocacion("0"));
		} catch (Exception e) {	
			e.printStackTrace();
		}
	}
	
}
