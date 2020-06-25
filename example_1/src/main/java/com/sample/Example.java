package com.sample;

import org.kie.api.KieServices;
import org.kie.api.logger.KieRuntimeLogger;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.drools.core.event.DebugAgendaEventListener;
import org.drools.core.event.DebugRuleRuntimeEventListener;

public class Example {

    public static final void main(String[] args) {
        try {
	        KieServices ks = KieServices.Factory.get();
    	    KieContainer kContainer = ks.getKieClasspathContainer();
        	KieSession kSession = kContainer.newKieSession("ksession-rules");
        	
        	kSession.addEventListener(new DebugAgendaEventListener());
        	kSession.addEventListener(new DebugRuleRuntimeEventListener());
        	
        	KieRuntimeLogger logger = ks.getLoggers().newFileLogger(kSession, "./logs");

            Message message = new Message();
            message.setMessage("Hello World");
            message.setStatus(Message.HELLO);
            
            kSession.insert(message);
            
            kSession.fireAllRules();
            
            kSession.dispose();
            logger.close();
        } catch (Throwable t) {
            t.printStackTrace();
        }
    }

    public static class Message {

        public static final int HELLO = 0;
        public static final int GOODBYE = 1;

        private String message;

        private int status;

        public String getMessage() {
            return this.message;
        }

        public void setMessage(String message) {
            this.message = message;
        }

        public int getStatus() {
            return this.status;
        }

        public void setStatus(int status) {
            this.status = status;
        }

    }

}
