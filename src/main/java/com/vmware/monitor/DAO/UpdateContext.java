package com.vmware.monitor.DAO;

import com.blog.webservices.client.MetadataServiceStub.Context;
import com.blog.webservices.client.MetadataServiceStub.LoginReturn;
import com.blog.webservices.client.MetadataServiceStub.SessionHeader;

public class UpdateContext {
	
	SessionHeader sessionHeader = new SessionHeader();
	LoginReturn loginReturn  = new LoginReturn();
	Context context=new Context();
	
	public void setContext(String session_id) {
		
		sessionHeader.setSessionId(session_id);
		context.setContext(sessionHeader);
	}

	public Context getContext() {
		return this.context;
	}
	

}
