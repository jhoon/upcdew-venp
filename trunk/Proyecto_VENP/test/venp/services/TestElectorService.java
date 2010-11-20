package venp.services;

import static org.junit.Assert.*;

import org.junit.Test;

import venp.web.forms.ElectorForm;


public class TestElectorService {
	
	ElectorService elector;
	
	@Test
	public void validarDNI(){
		try {
			assertNotNull(elector.validarDNI("88888888"));
		} catch (Exception e) {
		}
	}	

	@Test
	public void votar(){
		try {
			assertNotNull(elector.votar("1", new ElectorForm()));
		} catch (Exception e) {
		}
	}
	
	@Test
	public void getConsulados(){
		try {
			assertNotNull(elector.getConsulados(1));
		} catch (Exception e) {
		}
	}	

	@Test
	public void getPaises(){
		try {
			assertNotNull(elector.getPaises(1));
		} catch (Exception e) {
		}
	}
	
	@Test
	public void getCedulaOpciones(){
		try {
			assertNotNull(elector.getCedulaOpciones(1));
		} catch (Exception e) {
		}
	}
}