package venp.web.actions;

import static org.junit.Assert.*;

import org.junit.Test;

import venp.services.ProcesoElectoralService;

public class TestLocacionCerrarVotacion {
	
	
	@Test
	public void testCerrarVotacion() throws Exception {
//		 = null;// = new ProcesoElectoralService();
		ProcesoElectoralService servProc= new ProcesoElectoralService();
		assertNotNull(servProc.estadoProceso());
		assertSame(false, servProc.estadoProceso());
	}

}
