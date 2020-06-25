package com.emergencias.test;
import com.entidades.*;

import org.drools.core.event.DebugAgendaEventListener;
import org.drools.core.event.DebugRuleRuntimeEventListener;

import org.kie.api.KieServices;
import org.kie.api.logger.KieRuntimeLogger;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;


@SuppressWarnings("restriction")
public class EmergenciasDroolsTest2 {

    public static final void main(String[] args) {
        try {
            // load up the knowledge base
	        KieServices ks = KieServices.Factory.get();
    	    KieContainer kContainer = ks.getKieClasspathContainer();
        	KieSession kSession = kContainer.newKieSession("ksession-rules");

        	
        	kSession.addEventListener(new DebugAgendaEventListener());
			kSession.addEventListener(new DebugRuleRuntimeEventListener());

			KieRuntimeLogger logger = ks.getLoggers().newFileLogger(kSession, "./emergenciaslog2");

        	// < Codigo 2>
			Codigo codigo2 = new Codigo();
	    	codigo2.setCodigo(Codigo.ROJO);
        	
        	// < Instituci�n >
        	Institucion inst = new Institucion();
        	inst.setCodigo( Institucion.CLINICA_TUNUYAN );
        	 
        	
			// < Movil 2 >
        	Movil movil2 = new Movil();
        	movil2.setCodigo( Movil.TUNUYAN_101_EMERG);
        	
        	// < Desenlace >
        	Desenlace des = new Desenlace();
        	des.setCodigo( Desenlace.INTERNADO_EN_SALA_GENERAL );
        	
        	// < Base >
        	Base base = new Base();
        	base.setCodigo( Base.TUNUYAN );
        	
            
        	// < Obra Social 2>
            ObraSocial os2 = new ObraSocial();
            os2.setNombre("OSEP");
            
        	
			// < Zona >
            Zona zona = new Zona();
            zona.setNombre("Tunuyan");
            

            
            // < Paciente 2 >
            Paciente paciente2 = new Paciente();
            paciente2.setEdad(30);
            paciente2.setSexo(false);
            paciente2.setOS(os2);
            
        	
        	// < Tiempo >
        	Tiempo tiemp = new Tiempo(2);
        	
  
        	// < Despacho >
        	Despacho despacho = new Despacho();
        	despacho.setId_fecha(tiemp);
        	despacho.setId_zona(zona);
        	despacho.setId_codigo(codigo2);
        	despacho.setId_movil(movil2);
        	despacho.setId_desenlace(des);
        	
        	// < Despacho 2>
        	Despacho despacho2 = new Despacho();
        	despacho2.setId_fecha(tiemp);
        	despacho2.setId_zona(zona);
        	despacho2.setId_codigo(codigo2);
        	despacho2.setId_movil(movil2);
        	despacho2.setId_desenlace(des);
        	
        	// < Recepcion 2>
            Recepcion recepcion2 = new Recepcion();
        	recepcion2.setPaciente(paciente2);
        	recepcion2.setCodigo(codigo2);
        	recepcion2.setZona(zona);
        	recepcion2.setDespacho(despacho);
        	
        	
            kSession.insert(recepcion2);
            kSession.insert(paciente2);
            
            kSession.fireAllRules();
            
            kSession.dispose();
			
			logger.close();
        } catch (Throwable t) {
            t.printStackTrace();
        }
    }

 

}
