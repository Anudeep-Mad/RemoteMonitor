package com.vmware.monitor.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.blog.webservices.client.MetadataServiceStub.LoginReturn;
import com.vmware.monitor.InstancePojo;
import com.vmware.monitor.LoginPojo;
import com.vmware.monitor.WorkflowsPojo;
import com.vmware.monitor.DAO.InfaFolders;
import com.vmware.monitor.DAO.InfaInstances;
import com.vmware.monitor.DAO.InfaLogin;
import com.vmware.monitor.DAO.InfaWorkflows;
import com.vmware.monitor.DAO.UpdateContext;

@RestController
public class MonitorController {
	String session_id;
	UpdateContext updateContext = new UpdateContext();
	LoginReturn loginReturn  = new LoginReturn();

	@RequestMapping(value="/login",method=RequestMethod.POST)
	public Object InfaLogin(@RequestBody LoginPojo loginPojo) throws Exception{
		InfaLogin infaLogin = new InfaLogin();
		if(infaLogin.ValidateLogin(loginPojo.getUsername())) {
			loginReturn = infaLogin.RepoLogin(loginPojo);
			session_id = loginReturn.getLoginReturn();
			updateContext.setContext(session_id);
			return loginReturn;
		}
		else 
			return "Invalid Login Credentials";
	}

	@RequestMapping(value="/folders",method=RequestMethod.POST)
	public Object getFolders() throws Exception{
		InfaFolders	infaFolders = new InfaFolders();
		return infaFolders.getInfaFolders(updateContext.getContext());
	}
	@RequestMapping(value="/workflows",method=RequestMethod.POST)
	public Object getWorkflows(@RequestBody WorkflowsPojo workflowsPojo) throws Exception{
		InfaWorkflows infaWorkflows = new InfaWorkflows();
		return infaWorkflows.getInfaWorkflows(updateContext.getContext(), workflowsPojo);

	}
	@RequestMapping(value="/instances",method=RequestMethod.POST)
	public Object getInstances(@RequestBody InstancePojo instancePojo) throws Exception{
		InfaInstances infaInstances = new InfaInstances();
		return infaInstances.getAllInstances(updateContext.getContext(), instancePojo);
	}



}


