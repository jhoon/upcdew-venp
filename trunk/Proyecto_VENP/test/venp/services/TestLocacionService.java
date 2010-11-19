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
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
