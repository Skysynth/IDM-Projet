/*
 * generated by Xtext 2.32.0
 */
package fr.l127;


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
public class LAStandaloneSetup extends LAStandaloneSetupGenerated {

	public static void doSetup() {
		new LAStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}
