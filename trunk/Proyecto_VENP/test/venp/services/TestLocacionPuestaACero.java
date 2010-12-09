package venp.services;

import junit.framework.TestCase;

import org.junit.Before;
import org.junit.Test;

import venp.beans.LocacionBean;
import venp.services.LocacionService;

public class TestLocacionPuestaACero extends TestCase {
	
	private LocacionService locacion;
	
	@Before
	public void setUp() throws Exception {
		locacion = new LocacionService();
	}
	
	@Test
	public void testUsuarioTieneLocacionesActivas() {
		int usuario = 1;
		try {
			assertNotNull(locacion.locacionesActivasPorUsuarioPuestaCero(usuario));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testUsuarioNoTieneLocacionActiva() {
		int usuarioId = 1;
		int locacionId = 3;
		try {
			LocacionBean bean = locacion.locacionActivaPorUsuarioPuestaCero(usuarioId, locacionId);
			assertNull(bean);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testUsuarioEstaFueraDelRangoDelTiempoParaRealizarPuestaACero() {
		int usuarioId = 1;
		int locacionId = 1;
		try {
			LocacionBean bean = locacion.locacionActivaPorUsuarioPuestaCero(usuarioId, locacionId);
			boolean validate = false;
			if(bean != null && bean.getDiferenciaInicio()>0)
				validate = true;
			assertTrue(validate);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}	
	
	@Test
	public void testUsuarioExcedeDelTiempoParaRealizarPuestaACero() {
		int usuarioId = 1;
		int locacionId = 1;
		try {
			LocacionBean bean = locacion.locacionActivaPorUsuarioPuestaCero(usuarioId, locacionId);
			boolean validate = false;
			if(bean != null && bean.getDiferenciaInicioFin()<0)
				validate = true;
			assertTrue(validate);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}	
	
	@Test
	public void testUsuarioRealizaPuestaACero() {
		int usuario = 1;
		int locacionId = 1;
		try {
			assertFalse(locacion.puestaCero(usuario, locacionId));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}		
	
}
