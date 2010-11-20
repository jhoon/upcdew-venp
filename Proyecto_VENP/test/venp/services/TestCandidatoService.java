package venp.services;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import venp.beans.CandidatoBean;


public class TestCandidatoService {

	CandidatoService candidato;
	
	@Test
	public void listarTodos()
	{
		try {
			assertNotNull(candidato.listarTodos());
		} catch (Exception e) {			
		}
	}
	
	@Test
	public void listarConPartidoPolitico()
	{
		try {
			assertNotNull(candidato.listarConPartidoPolitico(1));
		} catch (Exception e) {			
		}
	}
	
	@Test
	public void listarSinPartidoPolitico()
	{
		try {
			assertNotNull(candidato.listarSinPartidoPolitico(1));
		} catch (Exception e) {			
		}
	}
	
	@Test
	public void findByPrimaryKey(){
		try {
			assertNotNull(candidato.findByPrimaryKey(1));
		} catch (Exception e) {			
		}
	}
	
	@Test
	public void insertar(){
		try {
			assertNotNull(candidato.insertar(new CandidatoBean()));
		} catch (Exception e) {			
		}
	}
	
	@Test
	public void editar(){
		try {
			assertNotNull(candidato.editar(new CandidatoBean()));
		} catch (Exception e) {			
		}
	}
	
}
