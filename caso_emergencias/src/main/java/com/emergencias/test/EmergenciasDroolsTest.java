package com.emergencias.test;
import com.entidades.*;

import org.drools.core.event.DebugAgendaEventListener;
import org.drools.core.event.DebugRuleRuntimeEventListener;

import org.kie.api.KieServices;
import org.kie.api.logger.KieRuntimeLogger;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;


@SuppressWarnings("restriction")
public class EmergenciasDroolsTest {

    public static final void main(String[] args) {
        try {
            // load up the knowledge base
	        KieServices ks = KieServices.Factory.get();
    	    KieContainer kContainer = ks.getKieClasspathContainer();
        	KieSession kSession = kContainer.newKieSession("ksession-rules");

        	
        	kSession.addEventListener(new DebugAgendaEventListener());
			kSession.addEventListener(new DebugRuleRuntimeEventListener());

			KieRuntimeLogger logger = ks.getLoggers().newFileLogger(kSession, "./emergenciaslog");

			// < Codigo >
			Codigo codigo = new Codigo();
        	codigo.setCodigo(Codigo.AMARILLO);
     
        	
        	// < Institución >
        	Institucion inst = new Institucion();
        	inst.setCodigo( Institucion.CLINICA_TUNUYAN );
        	 
        	
			// < Movil >
        	Movil movil = new Movil();
        	movil.setCodigo( Movil.TUNUYAN_100 );
        	
        	// < Desenlace >
        	Desenlace des = new Desenlace();
        	des.setCodigo( Desenlace.INTERNADO_EN_SALA_GENERAL );
        	
        	// < Base >
        	Base base = new Base();
        	base.setCodigo( Base.TUNUYAN );
        	
        	// < Obra Social >
            ObraSocial os = new ObraSocial();
            os.setNombre("PAMI");
            
        	
			// < Zona >
            Zona zona = new Zona();
            zona.setNombre("Tunuyan");
            
            
            // < Paciente >
            Paciente paciente = new Paciente();
            paciente.setEdad(84);
            paciente.setSexo(false);
            paciente.setOS(os);
            
        	// < Tiempo >
        	Tiempo tiemp = new Tiempo(2);
        	
  
        	// < Despacho >
        	Despacho despacho = new Despacho();
        	despacho.setId_fecha(tiemp);
        	despacho.setId_zona(zona);
        	despacho.setId_codigo(codigo);
        	despacho.setId_movil(movil);
        	despacho.setId_desenlace(des);
        	
        	
        	// < Recepcion >
            Recepcion recepcion = new Recepcion();
        	recepcion.setPaciente(paciente);
        	recepcion.setCodigo(codigo);
        	recepcion.setZona(zona);
        	recepcion.setDespacho(despacho);
        	
        	
            kSession.insert(paciente);
            kSession.insert(recepcion);
            
            kSession.fireAllRules();
            
            kSession.dispose();
			
			logger.close();
        } catch (Throwable t) {
            t.printStackTrace();
        }
    }

 

}
