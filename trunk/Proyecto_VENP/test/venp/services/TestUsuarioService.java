package venp.services;



import junit.framework.TestCase;
import org.junit.Test;
import venp.services.UsuarioService;


public class TestUsuarioService extends TestCase{

	private UsuarioService TestUsuarioService ;
	
	@Test 
	public void FinUserService(){
		
		try {
			TestUsuarioService.findByUserName("modulo1");
			//assertTrue(1 == 1);   

		} catch (Exception e) {
			
		}
		
	}
	
	/*@Test
	public void findAllUserService(){
		
		try {
			assertNotNull(TestUsuarioService.findAll());
		} catch (Exception e) {
			
		}
		
	}
	
	@Test
	public void findAllLocationUserService(){
		
		try {
			assertNotNull(TestUsuarioService.findAllByLocacion());
		} catch (Exception e) {
			
		}
		
	}	*/
	
}
