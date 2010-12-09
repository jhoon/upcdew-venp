package venp.services;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class TestCedulaService {
	
	CedulaService cedula;
	
	@Before
	public void setUp() throws Exception {
		cedula = new CedulaService();
	}
	
	@Test
	public void listarCedulas(){
		try {
			assertNotNull(cedula.listarCedulas());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void cargarProcesosElectorales(){
		try {
			assertNotNull(cedula.cargarProcesosElectorales());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
