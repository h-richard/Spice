/**
 */
package Spice;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Double Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Spice.DoubleData#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see Spice.SpicePackage#getDoubleData()
 * @model
 * @generated
 */
public interface DoubleData extends Data {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Double}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute list.
	 * @see Spice.SpicePackage#getDoubleData_Value()
	 * @model unique="false"
	 * @generated
	 */
	EList<Double> getRawValue();
	
	Object getValue();
	
	void setRawValue(Object args);
	
	void setValue(Object args);

} // DoubleData
