package com.vmware.monitor.DAO;

import com.blog.webservices.client.MetadataServiceStub.Context;
import com.blog.webservices.client.MetadataServiceStub.FolderInfo;
import com.blog.webservices.client.MetadataServiceStub.GetAllWorkflows;
import com.vmware.monitor.WorkflowsPojo;

public class InfaWorkflows {

	public Object getInfaWorkflows(Context context, WorkflowsPojo workflowsPojo) throws Exception {

		//MetadataServiceStub serviceStub = new MetadataServiceStub("http://inf-dev11-inta1:7333/wsh/services/BatchServices/Metadata?WSDL");
		GetAllWorkflows getAllWorkflows1 = new GetAllWorkflows();
		FolderInfo folderInfo = new FolderInfo();
		folderInfo.setName(workflowsPojo.getFoldername());
		getAllWorkflows1.setGetAllWorkflows(folderInfo);
		return InfaLogin.serviceStub.getAllWorkflows(getAllWorkflows1,context).getGetAllWorkflowsReturn().getWorkflowInfo();
	}
}
