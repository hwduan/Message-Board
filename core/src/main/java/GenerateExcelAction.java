

import java.io.InputStream;

import com.opensymphony.xwork2.ActionSupport;


public class GenerateExcelAction extends ActionSupport
{
	private UserService service;

	public UserService getService()
	{
		return service;
	}

	public void setService(UserService service)
	{
		this.service = service;
	}
	
	public InputStream getDownloadFile()
	{
		return this.service.getInputStream();
	}
	
	@Override
	public String execute() throws Exception
	{
		return SUCCESS;
	}
}
