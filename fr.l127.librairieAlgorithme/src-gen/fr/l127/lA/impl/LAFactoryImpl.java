/**
 * generated by Xtext 2.32.0
 */
package fr.l127.lA.impl;

import fr.l127.lA.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class LAFactoryImpl extends EFactoryImpl implements LAFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static LAFactory init()
  {
    try
    {
      LAFactory theLAFactory = (LAFactory)EPackage.Registry.INSTANCE.getEFactory(LAPackage.eNS_URI);
      if (theLAFactory != null)
      {
        return theLAFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new LAFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LAFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case LAPackage.LIBRAIRIE: return createLibrairie();
      case LAPackage.LIBRAIRIE_ELEMENT: return createLibrairieElement();
      case LAPackage.ALGORITHME: return createAlgorithme();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Librairie createLibrairie()
  {
    LibrairieImpl librairie = new LibrairieImpl();
    return librairie;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public LibrairieElement createLibrairieElement()
  {
    LibrairieElementImpl librairieElement = new LibrairieElementImpl();
    return librairieElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Algorithme createAlgorithme()
  {
    AlgorithmeImpl algorithme = new AlgorithmeImpl();
    return algorithme;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public LAPackage getLAPackage()
  {
    return (LAPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static LAPackage getPackage()
  {
    return LAPackage.eINSTANCE;
  }

} //LAFactoryImpl
