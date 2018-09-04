package com.vmware.monitor;

public class InstancePojo {
	
	private String folder_name,workflow_name;
	boolean isValid;
	int localDepth;
	public int getLocalDepth() {
		return localDepth;
	}
	public void setLocalDepth(int localDepth) {
		this.localDepth = localDepth;
	}
	public String getFolder_name() {
		return folder_name;
	}
	public void setFolder_name(String folder_name) {
		this.folder_name = folder_name;
	}
	public String getWorkflow_name() {
		return workflow_name;
	}
	public void setWorkflow_name(String workflow_name) {
		this.workflow_name = workflow_name;
	}
	public boolean isIsValid() {
		return isValid;
	}
	public void setIsValid(boolean isValid) {
		this.isValid = isValid;
	}
	
	
	

}
