/**
 */
package Spice;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see Spice.SpicePackage
 * @generated
 */
public interface SpiceFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SpiceFactory eINSTANCE = Spice.impl.SpiceFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Simulation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Simulation</em>'.
	 * @generated
	 */
	Simulation createSimulation();

	/**
	 * Returns a new object of class '<em>Executable Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Executable Component</em>'.
	 * @generated
	 */
	ExecutableComponent createExecutableComponent();

	/**
	 * Returns a new object of class '<em>Service Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service Component</em>'.
	 * @generated
	 */
	ServiceComponent createServiceComponent();

	/**
	 * Returns a new object of class '<em>View</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>View</em>'.
	 * @generated
	 */
	View createView();

	/**
	 * Returns a new object of class '<em>Adapter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Adapter</em>'.
	 * @generated
	 */
	Adapter createAdapter();

	/**
	 * Returns a new object of class '<em>XMod Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>XMod Operation</em>'.
	 * @generated
	 */
	XMod_Operation createXMod_Operation();

	/**
	 * Returns a new object of class '<em>XMod Exception</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>XMod Exception</em>'.
	 * @generated
	 */
	XMod_Exception createXMod_Exception();

	/**
	 * Returns a new object of class '<em>Static Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Static Attribute</em>'.
	 * @generated
	 */
	StaticAttribute createStaticAttribute();

	/**
	 * Returns a new object of class '<em>Dynamic Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dynamic Attribute</em>'.
	 * @generated
	 */
	DynamicAttribute createDynamicAttribute();

	/**
	 * Returns a new object of class '<em>Boolean Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Boolean Data</em>'.
	 * @generated
	 */
	BooleanData createBooleanData();

	/**
	 * Returns a new object of class '<em>Double Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Double Data</em>'.
	 * @generated
	 */
	DoubleData createDoubleData();

	/**
	 * Returns a new object of class '<em>XMod Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>XMod Action</em>'.
	 * @generated
	 */
	XMod_Action createXMod_Action();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	SpicePackage getSpicePackage();

} //SpiceFactory
