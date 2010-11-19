package venp.services;

import junit.framework.TestCase;
import org.junit.Test;
import junit.framework.TestCase;
import venp.services.LogService;

public class TestLogService extends TestCase {
	
	LogService serviceLog;
	
	@Test
	public void LogTest(){
		
		try {
			serviceLog.insertar("15", "1");
			assertNotNull(serviceLog);
		} catch (Exception e) {
		}
		
	}
	
	

}