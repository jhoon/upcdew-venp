package venp.web.actions;

import servletunit.struts.MockStrutsTestCase;


public class TestEscrutinioAction extends MockStrutsTestCase{
	
	public TestEscrutinioAction(String testName) {
		super(testName); 
	}
	
	public void testPrimerMetodo(){
		setRequestPathInfo("/listaEscrutinio");		
		addRequestParameter("cmd","listarEscrutinio");
		actionPerform();
		verifyForward("listarLocacion");		
	}

}
