package venp.services;

import junit.framework.TestCase;

import org.junit.Before;
import org.junit.Test;
import venp.services.LocacionService;

public class TestLocacionService extends TestCase {

	private LocacionService locacion;
	
	@Before
	public void setUp() throws Exception {
		locacion = new LocacionService();
	}
	
	@Test
	public void testLocacionService() {
		
		try {
			assertNotNull(locacion.listarLocacionesCerradas());
		} catch (Exception e) {
			e.printStackTrace();
		}

		
	}
	
	@Test
	public void testLocacionesActivasPorUsuario(){
		try {
			assertNotNull(locacion.locacionesActivasPorUsuarioPuestaCero(1));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
}
