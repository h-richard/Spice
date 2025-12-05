/**
 */
package Spice;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>XMod Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Spice.XMod_Operation#getName <em>Name</em>}</li>
 *   <li>{@link Spice.XMod_Operation#getObjectTag <em>Object Tag</em>}</li>
 *   <li>{@link Spice.XMod_Operation#getParametersTag <em>Parameters Tag</em>}</li>
 *   <li>{@link Spice.XMod_Operation#getReturnTag <em>Return Tag</em>}</li>
 *   <li>{@link Spice.XMod_Operation#getExceptions <em>Exceptions</em>}</li>
 * </ul>
 *
 * @see Spice.SpicePackage#getXMod_Operation()
 * @model
 * @generated
 */
public interface XMod_Operation extends EObject {
	
	void setEOK(XMod_Exception xme);
	
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see Spice.SpicePackage#getXMod_Operation_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link Spice.XMod_Operation#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Object Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object Tag</em>' attribute.
	 * @see #setObjectTag(String)
	 * @see Spice.SpicePackage#getXMod_Operation_ObjectTag()
	 * @model required="true"
	 * @generated
	 */
	String getObjectTag();

	/**
	 * Sets the value of the '{@link Spice.XMod_Operation#getObjectTag <em>Object Tag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Object Tag</em>' attribute.
	 * @see #getObjectTag()
	 * @generated
	 */
	void setObjectTag(String value);

	/**
	 * Returns the value of the '<em><b>Parameters Tag</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters Tag</em>' attribute list.
	 * @see Spice.SpicePackage#getXMod_Operation_ParametersTag()
	 * @model
	 * @generated
	 */
	EList<String> getParametersTag();

	/**
	 * Returns the value of the '<em><b>Return Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Return Tag</em>' attribute.
	 * @see #setReturnTag(String)
	 * @see Spice.SpicePackage#getXMod_Operation_ReturnTag()
	 * @model
	 * @generated
	 */
	String getReturnTag();

	/**
	 * Sets the value of the '{@link Spice.XMod_Operation#getReturnTag <em>Return Tag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Return Tag</em>' attribute.
	 * @see #getReturnTag()
	 * @generated
	 */
	void setReturnTag(String value);

	/**
	 * Returns the value of the '<em><b>Exceptions</b></em>' containment reference list.
	 * The list contents are of type {@link Spice.XMod_Exception}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exceptions</em>' containment reference list.
	 * @see Spice.SpicePackage#getXMod_Operation_Exceptions()
	 * @model containment="true"
	 * @generated
	 */
	EList<XMod_Exception> getExceptions();
	
	XMod_Exception getException(XMod_ExceptionLiteral literal);
	
	XMod_Exception getException(XMod_ExceptionLiteral literal, String filter);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true"
	 * @generated
	 */
	XMod_Exception callOperation();

	void addException(XMod_Exception xme);

} // XMod_Operation
