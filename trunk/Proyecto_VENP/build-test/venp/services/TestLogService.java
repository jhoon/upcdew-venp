package venp.services;

import junit.framework.TestCase;
import org.junit.Test;
import junit.framework.TestCase;
import venp.services.LogService;

public class TestLogService extends TestCase {
	
	@Test
	public void LogTest(){
		LogService serviceLog = new LogService();	
		
		try {
			serviceLog.insertar("15", "1");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
	}
	
	

}
