package com.vmware.monitor.DAO;

import java.rmi.RemoteException;

import com.blog.webservices.client.Fault;
import com.blog.webservices.client.MetadataServiceStub.Context;
import com.blog.webservices.client.MetadataServiceStub.GetAllTaskInstances;
import com.blog.webservices.client.MetadataServiceStub.GetAllTaskInstancesRequest;
import com.blog.webservices.client.MetadataServiceStub.WorkflowInfo;
import com.vmware.monitor.InstancePojo;

public class InfaInstances {
	
	public Object getAllInstances(Context context,InstancePojo instancePojo) throws RemoteException, Fault {
		
		WorkflowInfo workflowInfo = new WorkflowInfo();
		workflowInfo.setFolderName(instancePojo.getFolder_name());
		workflowInfo.setIsValid(instancePojo.isIsValid());
		workflowInfo.setName(instancePojo.getWorkflow_name());
		GetAllTaskInstancesRequest getAllTaskInstancesRequest = new GetAllTaskInstancesRequest();
		getAllTaskInstancesRequest.setWorkflowInfo(workflowInfo);
		getAllTaskInstancesRequest.setDepth(instancePojo.getLocalDepth());
		GetAllTaskInstances getAllTaskInstances = new GetAllTaskInstances();
		getAllTaskInstances.setGetAllTaskInstances(getAllTaskInstancesRequest);
		return InfaLogin.serviceStub.getAllTaskInstances(getAllTaskInstances, context).getGetAllTaskInstancesReturn().getTaskInstanceInfo();
	}

}
