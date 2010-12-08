package venp.web.actions;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.bcel.verifier.statics.Pass1Verifier;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;

import venp.services.CentroVotacionService;
import venp.services.LocacionService;
import venp.services.PaisService;
import venp.services.ProcesoElectoralService;
import venp.web.forms.CentroVotacionAsignarForm;

public class CentroVotacionAsignarAction extends DispatchAction {
	
	ProcesoElectoralService peService;
	
	PaisService paService;
	
	CentroVotacionService cvService;
	
	public CentroVotacionService getCvService() {
		return cvService;
	}

	public void setCvService(CentroVotacionService service) {
		this.cvService = service;
	}
	
	public PaisService getPaService() {
		return paService;
	}

	public void setPaService(PaisService service) {
		this.paService = service;
	}
	
	public ProcesoElectoralService getPeService() {
		return peService;
	}

	public void setPeService(ProcesoElectoralService service) {
		this.peService = service;
	}
	
	public ActionForward nuevo(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		
		CentroVotacionAsignarForm frm = (CentroVotacionAsignarForm) form;
		
		frm.setPais(findAllPais());
		frm.setProcesoElectoral(findAllPE());
		
		return mapping.findForward("inicio");
	}
	
	public ActionForward buscar(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		
		CentroVotacionAsignarForm frm = (CentroVotacionAsignarForm) form;
		
		int intProcesoElectoral = Integer.parseInt(frm.getProcesoElectoralId());
		int intCodigoPais = Integer.parseInt(frm.getPaisId());
		
		frm.setSelectedPaisId(intCodigoPais + "");
		frm.setSelectedPEId(intProcesoElectoral + "");
		
		frm.setPais(findAllPais());
		frm.setProcesoElectoral(findAllPE());
		frm.setCvcLocacion(findAllCVConLocacion(intProcesoElectoral, intCodigoPais));
		frm.setCvsLocacion(findAllCVSinLocacion(intProcesoElectoral, intCodigoPais));

		frm.setNombrePais(frm.getPaisName(intCodigoPais));
		frm.setNombrePE(frm.getProcesoElectoralName(intProcesoElectoral));

		return mapping.findForward("inicio");
	}
	
	public ActionForward asignar(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		
		CentroVotacionAsignarForm frm = (CentroVotacionAsignarForm) form;

		int intProcesoElectoral = Integer.parseInt(frm.getProcesoElectoralId());
		int intCodigoPais = Integer.parseInt(frm.getPaisId());
		int intCodigoCV = Integer.parseInt(frm.getCvOrigen());
		
		asignar(intProcesoElectoral, intCodigoCV);
		
		frm.setSelectedPaisId(intCodigoPais + "");
		frm.setSelectedPEId(intProcesoElectoral + "");
		
		frm.setPais(findAllPais());
		frm.setProcesoElectoral(findAllPE());
		frm.setCvcLocacion(findAllCVConLocacion(intProcesoElectoral, intCodigoPais));
		frm.setCvsLocacion(findAllCVSinLocacion(intProcesoElectoral, intCodigoPais));

		frm.setNombrePais(frm.getPaisName(intCodigoPais));
		frm.setNombrePE(frm.getProcesoElectoralName(intProcesoElectoral));
		
		return mapping.findForward("inicio");
	}
	
	public ActionForward retirar(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		
		CentroVotacionAsignarForm frm = (CentroVotacionAsignarForm) form;

		int intProcesoElectoral = Integer.parseInt(frm.getProcesoElectoralId());
		int intCodigoPais = Integer.parseInt(frm.getPaisId());
		int intCodigoCV = Integer.parseInt(frm.getCvDestino());
		
		retirar(intProcesoElectoral, intCodigoCV);
		
		frm.setSelectedPaisId(intCodigoPais + "");
		frm.setSelectedPEId(intProcesoElectoral + "");
		
		frm.setPais(findAllPais());
		frm.setProcesoElectoral(findAllPE());
		frm.setCvcLocacion(findAllCVConLocacion(intProcesoElectoral, intCodigoPais));
		frm.setCvsLocacion(findAllCVSinLocacion(intProcesoElectoral, intCodigoPais));

		frm.setNombrePais(frm.getPaisName(intCodigoPais));
		frm.setNombrePE(frm.getProcesoElectoralName(intProcesoElectoral));
		
		return mapping.findForward("inicio");
	}
	
	public ActionForward cancelar(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		
		return mapping.findForward("listado");
	}

	private ArrayList findAllPE() throws Exception {
		
		return peService.findAllCreado();
	}

	private ArrayList findAllPais() throws Exception {
		
		return paService.findAll();
	}

	private ArrayList findAllCVConLocacion(int procesoElectoral, int codigoPais) throws Exception {
		
		return cvService.findAllConLocacion(procesoElectoral, codigoPais);
	}

	private ArrayList findAllCVSinLocacion(int procesoElectoral, int codigoPais) throws Exception {
		
		return cvService.findAllSinLocacion(procesoElectoral, codigoPais);
	}
	
	private void asignar(int procesoElectoral, int centroVotacion) throws Exception {
		
		cvService.asignar(procesoElectoral, centroVotacion);
	}
	
	private void retirar(int procesoElectoral, int centroVotacion) throws Exception {
		
		cvService.retirar(procesoElectoral, centroVotacion);
	}

}