/*
 * generated by Xtext 2.32.0
 */
package fr.l127.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import fr.l127.LARuntimeModule;
import fr.l127.LAStandaloneSetup;
import org.eclipse.xtext.util.Modules2;

/**
 * Initialization support for running Xtext languages as language servers.
 */
public class LAIdeSetup extends LAStandaloneSetup {

	@Override
	public Injector createInjector() {
		return Guice.createInjector(Modules2.mixin(new LARuntimeModule(), new LAIdeModule()));
	}
	
}
