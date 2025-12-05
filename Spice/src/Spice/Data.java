/**
 */
package Spice;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see Spice.SpicePackage#getData()
 * @model abstract="true"
 * @generated
 */
public interface Data extends EObject {
	
	/**
	 * <!-- begin-user-doc -->
	 * Returns the EList value of the represented data
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	Object getRawValue();

	/**
	 * <!-- begin-user-doc -->
	 * Returns a simplified form of the value (ex: returns Object[] instead of EList&lt;Object&gt;)
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 * @generated NOT
	 */
	Object getValue();
	
	/**
	 * <!-- begin-user-doc -->
	 * Sets the value of this data as given
	 * <!-- end-user-doc -->
	 * @model argsMany="true"
	 * @generated NOT
	 */
	void setRawValue(Object args);

	/**
	 * <!-- begin-user-doc -->
	 * Sets the value of this data after converting the given 'args' to an EList
	 * <!-- end-user-doc -->
	 * @model argsMany="true"
	 * @generated NOT
	 */
	void setValue(Object args);

} // Data
