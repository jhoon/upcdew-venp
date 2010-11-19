package venp.web.actions;

import static org.junit.Assert.*;

import org.junit.Test;

import venp.services.ProcesoElectoralService;

public class TestLocacionCerrarVotacion {
	ProcesoElectoralService servProc= new ProcesoElectoralService();
	
	@Test
	public void testCerrarVotacion() throws Exception {
//		 = null;// = new ProcesoElectoralService();
		assertNotNull(servProc.estadoProceso());
		assertSame(false, servProc.estadoProceso());
	}

}
