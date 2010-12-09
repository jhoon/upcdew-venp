package venp.services;

import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;

public class TestCentroVotacionService {
	
	CentroVotacionService centroVotacion;
	
	@Before
	public void setUp() throws Exception {
		centroVotacion = new CentroVotacionService();
	}
	
	@Test
	public void findAll(){
		try {
			assertNotNull(centroVotacion.findAll());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void findAllConLocacion(){
		try {
			assertNotNull(centroVotacion.findAllConLocacion(1,1));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void findAllSinLocacion(){
		try {
			assertNotNull(centroVotacion.findAllSinLocacion(1,1));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void findAll_conUsuario(){
		try {
			assertNotNull(centroVotacion.findAll_conUsuario(1,1,1));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void findAll_sinUsuario(){
		try {
			assertNotNull(centroVotacion.findAll_sinUsuario(1,1,1));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void findByPrimaryKey(){
		try {
			assertNotNull(centroVotacion.findByPrimaryKey(1));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
