package venp.services;

import java.util.ArrayList;

import venp.dao.entities.ZonaHorariaDAO;
import venp.dao.factory.DaoConfig;

import com.ibatis.dao.client.DaoManager;

public class ZonaHorariaService {

	private DaoManager manager = DaoConfig.getDaoManager();
	private ZonaHorariaDAO dao;
	
	public ZonaHorariaService() {
		dao = (ZonaHorariaDAO) manager.getDao(ZonaHorariaDAO.class);
	}

	public ArrayList findAll() throws Exception {
		try {
			ArrayList lista = dao.findAll();

			return lista;
		} catch (Exception e) {
			e.printStackTrace();

			return null;
		}
	}
	
}