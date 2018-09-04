package com.vmware.monitor.DAO;

import java.rmi.RemoteException;

import com.blog.webservices.client.MetadataServiceStub;
import com.blog.webservices.client.MetadataServiceStub.Login;
import com.blog.webservices.client.MetadataServiceStub.LoginRequest;
import com.blog.webservices.client.MetadataServiceStub.LoginReturn;
import com.vmware.monitor.CredentialsEnum;
import com.vmware.monitor.LoginPojo;

public class InfaLogin {
	static MetadataServiceStub serviceStub;
	public LoginReturn RepoLogin(LoginPojo loginPojo) throws RemoteException, Exception {
		
		serviceStub = new MetadataServiceStub("http://inf-"+loginPojo.getRepository()+"-inta1:7333/wsh/services/BatchServices/Metadata?WSDL");
		LoginRequest loginRequest = new LoginRequest();
		loginRequest.setUserName(loginPojo.getUsername());
		loginRequest.setPassword(loginPojo.getPassword());
		loginRequest.setRepositoryName(loginPojo.getRepository_name());
		loginRequest.setRepositoryDomainName(loginPojo.getDomain_name());
		Login login1 = new Login();
		login1.setLogin(loginRequest);
		
		return serviceStub.login(login1);
		
	}

	public boolean ValidateLogin(String username) {
		int count=0;
		for(CredentialsEnum credentialsEnum: CredentialsEnum.values()) {
			if(username.equals(credentialsEnum.toString()))
				count++;
				
		}
		if(count==0)
			return false;
		else
			return true;
	}
}
