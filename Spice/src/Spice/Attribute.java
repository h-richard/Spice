/**
 */
package Spice;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Spice.Attribute#isIsObservable <em>Is Observable</em>}</li>
 *   <li>{@link Spice.Attribute#getType <em>Type</em>}</li>
 *   <li>{@link Spice.Attribute#getMultiplicity <em>Multiplicity</em>}</li>
 * </ul>
 *
 * @see Spice.SpicePackage#getAttribute()
 * @model abstract="true"
 * @generated
 */
public interface Attribute extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Is Observable</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Observable</em>' attribute.
	 * @see #setIsObservable(boolean)
	 * @see Spice.SpicePackage#getAttribute_IsObservable()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isIsObservable();

	/**
	 * Sets the value of the '{@link Spice.Attribute#isIsObservable <em>Is Observable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Observable</em>' attribute.
	 * @see #isIsObservable()
	 * @generated
	 */
	void setIsObservable(boolean value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see Spice.SpicePackage#getAttribute_Type()
	 * @model required="true"
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link Spice.Attribute#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>Multiplicity</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multiplicity</em>' attribute.
	 * @see #setMultiplicity(long)
	 * @see Spice.SpicePackage#getAttribute_Multiplicity()
	 * @model default="1" required="true"
	 * @generated
	 */
	long getMultiplicity();

	/**
	 * Sets the value of the '{@link Spice.Attribute#getMultiplicity <em>Multiplicity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multiplicity</em>' attribute.
	 * @see #getMultiplicity()
	 * @generated
	 */
	void setMultiplicity(long value);

} // Attribute
