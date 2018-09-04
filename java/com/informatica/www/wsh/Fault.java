
/**
 * Fault.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.4  Built on : Dec 28, 2015 (10:03:39 GMT)
 */

package com.informatica.www.wsh;

public class Fault extends java.lang.Exception{

    private static final long serialVersionUID = 1526041265860L;
    
    private com.informatica.www.wsh.MetadataServiceStub.WSHFaultDetails faultMessage;

    
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
    

    public void setFaultMessage(com.informatica.www.wsh.MetadataServiceStub.WSHFaultDetails msg){
       faultMessage = msg;
    }
    
    public com.informatica.www.wsh.MetadataServiceStub.WSHFaultDetails getFaultMessage(){
       return faultMessage;
    }
}
    