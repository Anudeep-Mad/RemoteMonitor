package com.vmware.monitor.DAO;

import java.rmi.RemoteException;

import com.blog.webservices.client.Fault;
import com.blog.webservices.client.MetadataServiceStub.Context;
import com.blog.webservices.client.MetadataServiceStub.GetAllFolders;
import com.blog.webservices.client.MetadataServiceStub.GetAllFoldersReturn;

public class InfaFolders {
	
	GetAllFoldersReturn getAllFoldersReturn;
	
	public Object getInfaFolders(Context context) throws RemoteException, Fault {
		GetAllFolders getAllFoldersObject = new GetAllFolders();
		getAllFoldersReturn = InfaLogin.serviceStub.getAllFolders(getAllFoldersObject, context);
		return getAllFoldersReturn.getGetAllFoldersReturn().getFolderInfo();
	}

}
