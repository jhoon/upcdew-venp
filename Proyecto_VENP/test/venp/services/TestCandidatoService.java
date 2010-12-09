package venp.services;

import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;

import venp.beans.CandidatoBean;


public class TestCandidatoService {

	CandidatoService candidato;
	
	@Before
	public void setUp() throws Exception {
		candidato = new CandidatoService();
	}
	
	@Test
	public void listarTodos()
	{
		try {
			assertNotNull(candidato.listarTodos());
		} catch (Exception e) {		
			e.printStackTrace();
		}
	}
	
	@Test
	public void listarConPartidoPolitico()
	{
		try {
			assertNotNull(candidato.listarConPartidoPolitico(1));
		} catch (Exception e) {		
			e.printStackTrace();
		}
	}
	
	@Test
	public void listarSinPartidoPolitico()
	{
		try {
			assertNotNull(candidato.listarSinPartidoPolitico(1));
		} catch (Exception e) {		
			e.printStackTrace();
		}
	}
	
	@Test
	public void findByPrimaryKey(){
		try {
			assertNotNull(candidato.findByPrimaryKey(1));
		} catch (Exception e) {	
			e.printStackTrace();
		}
	}
	
	@Test
	public void insertar(){
		try {
			assertNotNull(candidato.insertar(new CandidatoBean()));
		} catch (Exception e) {	
			e.printStackTrace();
		}
	}
	
	@Test
	public void editar(){
		try {
			assertNotNull(candidato.editar(new CandidatoBean()));
		} catch (Exception e) {	
			e.printStackTrace();
		}
	}
}
