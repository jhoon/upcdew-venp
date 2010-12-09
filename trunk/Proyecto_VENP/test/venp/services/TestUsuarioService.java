package venp.services;



import junit.framework.TestCase;

import org.junit.Before;
import org.junit.Test;
import venp.services.UsuarioService;


public class TestUsuarioService extends TestCase{

	private UsuarioService TestUsuarioService ;
	
	@Before
	public void setUp() throws Exception {
		TestUsuarioService = new UsuarioService();
	}
	
	@Test 
	public void testFinUserService(){
		
		try {
			TestUsuarioService.findByUserName("modulo1");
			//assertTrue(1 == 1);   

		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	@Test
	public void testfindAllUserService(){
		
		try {
			assertNotNull(TestUsuarioService.findAll());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	@Test
	public void testfindAllLocationUserService(){
		
		try {
			assertNotNull(TestUsuarioService.findAllByLocacion());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	@Test
	public void testfindbyDNI(){
		
		try {
			assertNotNull(TestUsuarioService.findByDNI("12345678"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}	
	
	@Test
	public void testBorrarUser(){
		
		try {
			TestUsuarioService.borrar("1");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}		
	
}
