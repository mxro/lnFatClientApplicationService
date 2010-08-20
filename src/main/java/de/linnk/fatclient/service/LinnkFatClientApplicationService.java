package de.linnk.fatclient.service;

public class LinnkFatClientApplicationService implements de.mxro.applicationservice.ApplicationService {
	public void activate() {
		init(null);
	}
	
	@Override
	public void init(String[] args) {
		de.linnk.fatclient.application.LinnkFatClient.main(args);
	}
}
