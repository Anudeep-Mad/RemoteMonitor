
/**
 * Fault.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */

package com.blog.webservices.client;

public class Fault extends java.lang.Exception{

    private static final long serialVersionUID = 1526040280375L;
    
    private com.blog.webservices.client.MetadataServiceStub.WSHFaultDetails faultMessage;

    
        public Fault() {
            super("Fault");
        }

        public Fault(java.lang.String s) {
           super(s);
        }

        public Fault(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public Fault(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(com.blog.webservices.client.MetadataServiceStub.WSHFaultDetails msg){
       faultMessage = msg;
    }
    
    public com.blog.webservices.client.MetadataServiceStub.WSHFaultDetails getFaultMessage(){
       return faultMessage;
    }
}
    