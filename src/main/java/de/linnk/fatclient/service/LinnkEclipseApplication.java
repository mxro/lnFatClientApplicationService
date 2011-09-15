package de.linnk.fatclient.service;

import org.eclipse.equinox.app.IApplicationContext;

public class LinnkEclipseApplication implements org.eclipse.equinox.app.IApplication {

	@Override
	public Object start(final IApplicationContext context) throws Exception {
		System.out.println("LinnkEclipseApplication started.");
		return null;
	}

	@Override
	public void stop() {
		
	}

}
