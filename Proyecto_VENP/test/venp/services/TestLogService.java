package venp.services;

import junit.framework.TestCase;

import org.junit.Before;
import org.junit.Test;
import venp.services.LogService;

public class TestLogService extends TestCase {
	
	LogService serviceLog;
	
	@Before
	public void setUp() throws Exception {
		serviceLog = new LogService();
	}
	
	@Test
	public void testLogTest(){
		
		try {
			serviceLog.insertar("15", "1");
			assertNotNull(serviceLog);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	

}