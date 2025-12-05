/**
 */
package Spice;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Adapter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Spice.Adapter#isIsAdaptable <em>Is Adaptable</em>}</li>
 *   <li>{@link Spice.Adapter#getData <em>Data</em>}</li>
 *   <li>{@link Spice.Adapter#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link Spice.Adapter#getAction <em>Action</em>}</li>
 * </ul>
 *
 * @see Spice.SpicePackage#getAdapter()
 * @model
 * @generated
 */
public interface Adapter extends XMod_Element {
	/**
	 * Returns the value of the '<em><b>Is Adaptable</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Adaptable</em>' attribute.
	 * @see #setIsAdaptable(boolean)
	 * @see Spice.SpicePackage#getAdapter_IsAdaptable()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isIsAdaptable();

	/**
	 * Sets the value of the '{@link Spice.Adapter#isIsAdaptable <em>Is Adaptable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Adaptable</em>' attribute.
	 * @see #isIsAdaptable()
	 * @generated
	 */
	void setIsAdaptable(boolean value);

	/**
	 * Returns the value of the '<em><b>Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data</em>' containment reference.
	 * @see #setData(Data)
	 * @see Spice.SpicePackage#getAdapter_Data()
	 * @model containment="true"
	 * @generated
	 */
	Data getData();

	/**
	 * Sets the value of the '{@link Spice.Adapter#getData <em>Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data</em>' containment reference.
	 * @see #getData()
	 * @generated
	 */
	void setData(Data value);

	/**
	 * Returns the value of the '<em><b>Attributes</b></em>' reference list.
	 * The list contents are of type {@link Spice.Attribute}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributes</em>' reference list.
	 * @see Spice.SpicePackage#getAdapter_Attributes()
	 * @model
	 * @generated
	 */
	EList<Attribute> getAttributes();

	/**
	 * Returns the value of the '<em><b>Action</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action</em>' containment reference.
	 * @see #setAction(XMod_Action)
	 * @see Spice.SpicePackage#getAdapter_Action()
	 * @model containment="true"
	 * @generated
	 */
	XMod_Action getAction();

	/**
	 * Sets the value of the '{@link Spice.Adapter#getAction <em>Action</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action</em>' containment reference.
	 * @see #getAction()
	 * @generated
	 */
	void setAction(XMod_Action value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Data adapt();

} // Adapter
