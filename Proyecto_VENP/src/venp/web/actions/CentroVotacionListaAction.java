package venp.web.actions;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;

import venp.services.CentroVotacionService;
import venp.services.LocacionService;
import venp.web.forms.CentroVotacionListaForm;

public class CentroVotacionListaAction extends DispatchAction {
	
	CentroVotacionService service;
	
	public CentroVotacionService getService() {
		return service;
	}

	public void setService(CentroVotacionService service) {
		this.service = service;
	}

	public ActionForward borrar(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {

		String codigo = request.getParameter("codigo");

		if (codigo != null) {
			borrar(Integer.parseInt(codigo));

			return listar(mapping, form, request, response);
		} else {
			return mapping.findForward("inicio");
		}
	}

	public ActionForward listar(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {

		CentroVotacionListaForm frm = (CentroVotacionListaForm) form;
		ArrayList lista = findAll();

		frm.setLista(lista);

		return mapping.findForward("inicio");
	}

	private void borrar(int codigo) throws Exception {

		service.borrar(codigo);
	}

	private ArrayList findAll() throws Exception {
		ArrayList lista = null;

		lista = service.findAll();

		return lista;
	}

}