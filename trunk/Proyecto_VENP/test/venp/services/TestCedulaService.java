package venp.services;

import static org.junit.Assert.*;

import org.junit.Test;


public class TestCedulaService {
	
	CedulaService cedula;
	
	@Test
	public void listarCedulas(){
		try {
			assertNotNull(cedula.listarCedulas());
		} catch (Exception e) {
		}
	}
	
	@Test
	public void cargarProcesosElectorales(){
		try {
			assertNotNull(cedula.cargarProcesosElectorales());
		} catch (Exception e) {
		}
	}

}
