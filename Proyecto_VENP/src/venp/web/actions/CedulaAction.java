package venp.web.actions;

import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.DynaActionForm;
import org.apache.struts.actions.DispatchAction;

import venp.services.CedulaService;

public class CedulaAction extends DispatchAction {

	private CedulaService service;
	
	public CedulaService getService() {
		return service;
	}

	public void setService(CedulaService service) {
		this.service = service;
	}

	@Override
	protected ActionForward unspecified(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		return listar(mapping, form, request, response);
	}
	
	public ActionForward listar(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		ArrayList cedulas = service.listarCedulas();
		request.setAttribute("listaCedulas", cedulas);
		return mapping.findForward("lista");
	}
	
	public ActionForward editar(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		ArrayList procesos = service.cargarProcesosElectorales();
		request.setAttribute("listaProcesosElectorales", procesos);
		
		String strCodigo = request.getParameter("id");
		
		DynaActionForm frm = (DynaActionForm)form;
		frm.set("codigo", strCodigo);
		
		return mapping.findForward("datos");
	}
	
	public ActionForward mostrar(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		return listar(mapping, form, request, response);
	}
	
	public ActionForward borrar(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		return listar(mapping, form, request, response);
	}
	
	public ActionForward crear(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		ArrayList procesos = service.cargarProcesosElectorales();
		request.setAttribute("listaProcesosElectorales", procesos);
		
		DynaActionForm frm = (DynaActionForm)form;
		frm.set("codigo", "0");
		
		ArrayList opciones = new ArrayList();
		opciones.add("1");
		opciones.add("2");
		opciones.add("3");
		frm.set("opciones", opciones);
		
		return mapping.findForward("datos");
	}
	
	public ActionForward guardar(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		return listar(mapping, form, request, response);
	}
	
	public ActionForward ajax(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		String params[] = request.getParameterValues("list[]");
		PrintWriter pw = response.getWriter();
		String strRes = params[0] + "";
		for(int i=1;i<params.length;i++) {
			strRes += ", " + params[i];
		}
		pw.print("Hola, este es el nuevo orden: " + strRes);
		return null;
	}

}
