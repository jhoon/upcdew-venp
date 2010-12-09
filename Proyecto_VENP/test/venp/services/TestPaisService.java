package venp.services;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class TestPaisService {
	
	PaisService pais;
	
	@Before
	public void setUp() throws Exception {
		pais = new PaisService();
	}
	
	
	@Test
	public void findAll(){
		try {
			assertNotNull(pais.findAll());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void findAllLocacion(){
		try {
			assertNotNull(pais.findAllLocacion(1));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void findByPrimaryKey(){
		try {
			assertNotNull(pais.findByPrimaryKey(1));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void findByName(){
		try {
			assertNotNull(pais.findByName("Argentina"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
