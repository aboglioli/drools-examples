package com.sample;

import org.kie.api.KieServices;
import org.kie.api.logger.KieRuntimeLogger;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.drools.core.event.DebugAgendaEventListener;
import org.drools.core.event.DebugRuleRuntimeEventListener;

public class Main {

    public static final void main(String[] args) {
        try {
	        KieServices ks = KieServices.Factory.get();
    	    KieContainer kContainer = ks.getKieClasspathContainer();
        	KieSession kSession = kContainer.newKieSession("ksession-rules");
        	
        	kSession.addEventListener(new DebugAgendaEventListener());
        	kSession.addEventListener(new DebugRuleRuntimeEventListener());
        	
        	KieRuntimeLogger logger = ks.getLoggers().newFileLogger(kSession, "./logs");

        	State A = new State("A");
        	State B = new State("B");
        	State C = new State("C");
        	State D = new State("D");
            
            kSession.insert(A);
            kSession.insert(B);
            kSession.insert(C);
            kSession.insert(D);
            
            kSession.fireAllRules();
            
            kSession.dispose();
            logger.close();
        } catch (Throwable t) {
            t.printStackTrace();
        }
    }
}
