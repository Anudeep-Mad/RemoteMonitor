
/**
 * MetadataServiceCallbackHandler.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */

    package com.blog.webservices.client;

    /**
     *  MetadataServiceCallbackHandler Callback class, Users can extend this class and implement
     *  their own receiveResult and receiveError methods.
     */
    public abstract class MetadataServiceCallbackHandler{



    protected Object clientData;

    /**
    * User can pass in any object that needs to be accessed once the NonBlocking
    * Web service call is finished and appropriate method of this CallBack is called.
    * @param clientData Object mechanism by which the user can pass in user data
    * that will be avilable at the time this callback is called.
    */
    public MetadataServiceCallbackHandler(Object clientData){
        this.clientData = clientData;
    }

    /**
    * Please use this constructor if you don't want to set any clientData
    */
    public MetadataServiceCallbackHandler(){
        this.clientData = null;
    }

    /**
     * Get the client data
     */

     public Object getClientData() {
        return clientData;
     }

        
           /**
            * auto generated Axis2 call back method for login method
            * override this method for handling normal response from login operation
            */
           public void receiveResultlogin(
                    com.blog.webservices.client.MetadataServiceStub.LoginReturn result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from login operation
           */
            public void receiveErrorlogin(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getAllFolders method
            * override this method for handling normal response from getAllFolders operation
            */
           public void receiveResultgetAllFolders(
                    com.blog.webservices.client.MetadataServiceStub.GetAllFoldersReturn result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getAllFolders operation
           */
            public void receiveErrorgetAllFolders(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getAllDIServers method
            * override this method for handling normal response from getAllDIServers operation
            */
           public void receiveResultgetAllDIServers(
                    com.blog.webservices.client.MetadataServiceStub.GetAllDIServersReturn result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getAllDIServers operation
           */
            public void receiveErrorgetAllDIServers(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getAllRepositories method
            * override this method for handling normal response from getAllRepositories operation
            */
           public void receiveResultgetAllRepositories(
                    com.blog.webservices.client.MetadataServiceStub.GetAllRepositoriesReturn result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getAllRepositories operation
           */
            public void receiveErrorgetAllRepositories(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getAllTaskInstances method
            * override this method for handling normal response from getAllTaskInstances operation
            */
           public void receiveResultgetAllTaskInstances(
                    com.blog.webservices.client.MetadataServiceStub.GetAllTaskInstancesReturn result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getAllTaskInstances operation
           */
            public void receiveErrorgetAllTaskInstances(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for logout method
            * override this method for handling normal response from logout operation
            */
           public void receiveResultlogout(
                    com.blog.webservices.client.MetadataServiceStub.LogoutReturn result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from logout operation
           */
            public void receiveErrorlogout(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getAllWorkflows method
            * override this method for handling normal response from getAllWorkflows operation
            */
           public void receiveResultgetAllWorkflows(
                    com.blog.webservices.client.MetadataServiceStub.GetAllWorkflowsReturn result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getAllWorkflows operation
           */
            public void receiveErrorgetAllWorkflows(java.lang.Exception e) {
            }
                


    }
    