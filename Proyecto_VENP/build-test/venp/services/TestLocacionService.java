package venp.services;

import static org.junit.Assert.*;
import junit.framework.TestCase;
import org.junit.Test;
import venp.services.LocacionService;

public class TestLocacionService extends TestCase {

	private LocacionService locacion;
	
	@Test
	public void testLocacionService() {
		
		try {
			assertNotNull(locacion.listarLocacionesCerradas());
		} catch (Exception e) {
			
		}

		
	}
	
	@Test
	public void testLocacionesActivasPorUsuario(){
		try {
			assertNotNull(locacion.locacionesActivasPorUsuarioPuestaCero(1));
		} catch (Exception e) {
		}
	}
	
	
}
