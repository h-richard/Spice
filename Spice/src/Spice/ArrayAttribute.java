/**
 */
package Spice;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Array Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Spice.ArrayAttribute#getValue <em>Value</em>}</li>
 *   <li>{@link Spice.ArrayAttribute#getNewValue <em>New Value</em>}</li>
 * </ul>
 *
 * @see Spice.SpicePackage#getArrayAttribute()
 * @model
 * @generated
 */
public interface ArrayAttribute extends Attribute {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Object}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute list.
	 * @see Spice.SpicePackage#getArrayAttribute_Value()
	 * @model unique="false"
	 * @generated
	 */
	EList<Object> getValue();

	/**
	 * Returns the value of the '<em><b>New Value</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Object}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New Value</em>' attribute list.
	 * @see Spice.SpicePackage#getArrayAttribute_NewValue()
	 * @model unique="false"
	 * @generated
	 */
	EList<Object> getNewValue();

	Object[] getArrayValue();

	Object[] getNewArrayValue();

	void setArrayValue(Object[] newValue);

	void setNewArrayValue(Object[] newValue);
} // ArrayAttribute
