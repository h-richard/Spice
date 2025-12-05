/**
 */
package Spice;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>XMod Exception</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Spice.XMod_Exception#getLiteral <em>Literal</em>}</li>
 *   <li>{@link Spice.XMod_Exception#getFilter <em>Filter</em>}</li>
 *   <li>{@link Spice.XMod_Exception#getReaction <em>Reaction</em>}</li>
 *   <li>{@link Spice.XMod_Exception#getCalledOperation <em>Called Operation</em>}</li>
 * </ul>
 *
 * @see Spice.SpicePackage#getXMod_Exception()
 * @model
 * @generated
 */
public interface XMod_Exception extends EObject {
	/**
	 * Returns the value of the '<em><b>Literal</b></em>' attribute.
	 * The default value is <code>"ok"</code>.
	 * The literals are from the enumeration {@link Spice.XMod_ExceptionLiteral}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Literal</em>' attribute.
	 * @see Spice.XMod_ExceptionLiteral
	 * @see #setLiteral(XMod_ExceptionLiteral)
	 * @see Spice.SpicePackage#getXMod_Exception_Literal()
	 * @model default="ok" required="true"
	 * @generated
	 */
	XMod_ExceptionLiteral getLiteral();

	/**
	 * Sets the value of the '{@link Spice.XMod_Exception#getLiteral <em>Literal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Literal</em>' attribute.
	 * @see Spice.XMod_ExceptionLiteral
	 * @see #getLiteral()
	 * @generated
	 */
	void setLiteral(XMod_ExceptionLiteral value);

	/**
	 * Returns the value of the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Filter</em>' attribute.
	 * @see #setFilter(String)
	 * @see Spice.SpicePackage#getXMod_Exception_Filter()
	 * @model
	 * @generated
	 */
	String getFilter();

	/**
	 * Sets the value of the '{@link Spice.XMod_Exception#getFilter <em>Filter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Filter</em>' attribute.
	 * @see #getFilter()
	 * @generated
	 */
	void setFilter(String value);

	/**
	 * Returns the value of the '<em><b>Reaction</b></em>' attribute.
	 * The default value is <code>"custom"</code>.
	 * The literals are from the enumeration {@link Spice.XMod_ExceptionReaction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reaction</em>' attribute.
	 * @see Spice.XMod_ExceptionReaction
	 * @see #setReaction(XMod_ExceptionReaction)
	 * @see Spice.SpicePackage#getXMod_Exception_Reaction()
	 * @model default="custom" required="true"
	 * @generated
	 */
	XMod_ExceptionReaction getReaction();

	/**
	 * Sets the value of the '{@link Spice.XMod_Exception#getReaction <em>Reaction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reaction</em>' attribute.
	 * @see Spice.XMod_ExceptionReaction
	 * @see #getReaction()
	 * @generated
	 */
	void setReaction(XMod_ExceptionReaction value);

	/**
	 * Returns the value of the '<em><b>Called Operation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Called Operation</em>' containment reference.
	 * @see #setCalledOperation(XMod_Operation)
	 * @see Spice.SpicePackage#getXMod_Exception_CalledOperation()
	 * @model containment="true"
	 * @generated
	 */
	XMod_Operation getCalledOperation();

	/**
	 * Sets the value of the '{@link Spice.XMod_Exception#getCalledOperation <em>Called Operation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Called Operation</em>' containment reference.
	 * @see #getCalledOperation()
	 * @generated
	 */
	void setCalledOperation(XMod_Operation value);

} // XMod_Exception
