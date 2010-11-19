package venp.services;

import static org.junit.Assert.*;

import org.junit.Test;


public class TestEscrutinioService {

	EscrutinioService escrutinioService;
	
	@Test
	public void testListarDetalleEscrutinio(){
		try {
			assertNotNull(escrutinioService.listarDetalleEscrutinio("0"));
		} catch (Exception e) {			
		}
	}
	
	@Test
	public void testListarDetalleLocacion(){
		try {
			assertNotNull(escrutinioService.listarDetalleLocacion("0"));
		} catch (Exception e) {			
		}
	}
	
}
