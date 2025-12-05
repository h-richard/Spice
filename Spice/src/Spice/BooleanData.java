/**
 */
package Spice;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Boolean Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Spice.BooleanData#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see Spice.SpicePackage#getBooleanData()
 * @model
 * @generated
 */
public interface BooleanData extends Data {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Boolean}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute list.
	 * @see Spice.SpicePackage#getBooleanData_Value()
	 * @model unique="false"
	 * @generated
	 */
	EList<Boolean> getRawValue();
	
	Object getValue();
	
	void setRawValue(Object args);
	
	void setValue(Object args);

} // BooleanData
