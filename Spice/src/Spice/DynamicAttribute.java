/**
 */
package Spice;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dynamic Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Spice.DynamicAttribute#getInitial <em>Initial</em>}</li>
 *   <li>{@link Spice.DynamicAttribute#getNewData <em>New Data</em>}</li>
 * </ul>
 *
 * @see Spice.SpicePackage#getDynamicAttribute()
 * @model
 * @generated
 */
public interface DynamicAttribute extends Attribute {
	/**
	 * Returns the value of the '<em><b>Initial</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initial</em>' reference.
	 * @see #setInitial(StaticAttribute)
	 * @see Spice.SpicePackage#getDynamicAttribute_Initial()
	 * @model required="true"
	 * @generated
	 */
	StaticAttribute getInitial();

	/**
	 * Sets the value of the '{@link Spice.DynamicAttribute#getInitial <em>Initial</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial</em>' reference.
	 * @see #getInitial()
	 * @generated
	 */
	void setInitial(StaticAttribute value);

	/**
	 * Returns the value of the '<em><b>New Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New Data</em>' containment reference.
	 * @see #setNewData(Data)
	 * @see Spice.SpicePackage#getDynamicAttribute_NewData()
	 * @model containment="true"
	 * @generated
	 */
	Data getNewData();

	/**
	 * Sets the value of the '{@link Spice.DynamicAttribute#getNewData <em>New Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New Data</em>' containment reference.
	 * @see #getNewData()
	 * @generated
	 */
	void setNewData(Data value);

} // DynamicAttribute
