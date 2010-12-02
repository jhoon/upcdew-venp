package venp.web.actions;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;
import org.apache.struts.action.ActionMessages;
import org.apache.struts.actions.DispatchAction;

import venp.beans.LocacionBean;
import venp.beans.UsuarioBean;
import venp.services.LocacionService;
import venp.web.forms.LocacionPuestaCeroForm;


/**
 * Action de Puesta cero. Se utiliza para establecer o setear parametros de puesta a cero en cada locacion
 * @author MCristobal
 *
 */
public class LocacionPuestaCeroAction extends DispatchAction {
	
	private LocacionService service;
		
	public LocacionService getService() {
		return service;
	}

	public void setService(LocacionService service) {
		this.service = service;
	}

	/**
	 * Action de listado de locaciones activas en el proceso electoral
	 * @param mapping
	 * @param form
	 * @param request
	 * @param response
	 * @throws Exception
	 */
	public ActionForward listar(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		
		HttpSession session = request.getSession();
		UsuarioBean bean = (UsuarioBean) session.getAttribute("usuarioBean");
		LocacionPuestaCeroForm frm = (LocacionPuestaCeroForm) form;
		
		frm.setOk("");
		ArrayList lista = locacionesActivasPorUsuarioPuestaCero(Integer.parseInt(bean.getCodigo()));
		frm.setListaLocaciones(lista);
		
		frm.setUsuario(bean.getNombreCompleto());

		return mapping.findForward("inicio");
	}
	
	/**
	 * Action de Puesta a cero de una determinada locaci�n 
	 * @param mapping
	 * @param form
	 * @param request
	 * @param response
	 * @throws Exception
	 */
	public ActionForward puestaCero(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {

		HttpSession session = request.getSession();
		UsuarioBean usuarioBean = (UsuarioBean) session.getAttribute("usuarioBean");
		String strCodigoLocacion = request.getParameter("keyValue");
		LocacionBean locacionBean = locacionActivaPorUsuarioPuestaCero(Integer.parseInt(usuarioBean.getCodigo()), Integer.parseInt(strCodigoLocacion));
		LocacionPuestaCeroForm frm = (LocacionPuestaCeroForm) form;
		
		frm.setOk("");
		if (locacionBean == null) {
			ActionMessages errors = new ActionMessages();
			errors.add("mensaje", new ActionMessage("locacion.puestaCero.apertura"));
			
			saveErrors(request, errors);
		} 
		else if (locacionBean.getDiferenciaInicio() > 0) {
			ActionMessages errors = new ActionMessages();
			errors.add("mensaje", new ActionMessage("locacion.puestaCero.nopuedeempezar"));
			
			saveErrors(request, errors);
		}
		else if (locacionBean.getDiferenciaInicioFin() < 0) {
			ActionMessages errors = new ActionMessages();
			errors.add("mensaje", new ActionMessage("locacion.puestaCero.excesotiempo"));
			
			saveErrors(request, errors);
		}
		else {
			if (puestaCero(Integer.parseInt(usuarioBean.getCodigo()), Integer.parseInt(strCodigoLocacion))) {
				ActionMessages errors = new ActionMessages();
				errors.add("mensaje", new ActionMessage("locacion.puestaCero.okPuestaCero"));
				
				saveErrors(request, errors);
				
				frm.setOk("ok");
				frm.setNombreLocacion(locacionBean.getNombreCentroVotacion());
				System.out.println("locacionBean.getNombreCentroVotacion()");
			}
			else {
				ActionMessages errors = new ActionMessages();
				errors.add("mensaje", new ActionMessage("locacion.puestaCero.errorPuestaCero"));
				
				saveErrors(request, errors);
			}
		}

		frm.setListaLocaciones(locacionesActivasPorUsuarioPuestaCero(Integer.parseInt(usuarioBean.getCodigo())));
		
		return mapping.findForward("inicio");
	}
	
	/**
	 * Metodo para ver las locaciones activas
	 * @param intUsuario
	 * @return Las locaciones activas por usuario
	 * @throws Exception
	 */
	private ArrayList locacionesActivasPorUsuarioPuestaCero(int intUsuario) throws Exception {
		return service.locacionesActivasPorUsuarioPuestaCero(intUsuario);
	}
	
	private LocacionBean locacionActivaPorUsuarioPuestaCero(int intUsuario, int intLocacion) throws Exception {
		return service.locacionActivaPorUsuarioPuestaCero(intUsuario, intLocacion);
	}
	
	/**
	 * 
	 * @param intUsuario
	 * @param intLocacion
	 * @return
	 * @throws Exception
	 */
	private boolean puestaCero(int intUsuario, int intLocacion) throws Exception {
		return service.puestaCero(intUsuario, intLocacion);
	}

}