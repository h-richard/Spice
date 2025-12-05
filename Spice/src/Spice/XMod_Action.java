/**
 */
package Spice;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>XMod Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Spice.XMod_Action#getOperations <em>Operations</em>}</li>
 * </ul>
 *
 * @see Spice.SpicePackage#getXMod_Action()
 * @model
 * @generated
 */
public interface XMod_Action extends XMod_Element {
	/**
	 * Returns the value of the '<em><b>Operations</b></em>' containment reference list.
	 * The list contents are of type {@link Spice.XMod_Operation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operations</em>' containment reference list.
	 * @see Spice.SpicePackage#getXMod_Action_Operations()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<XMod_Operation> getOperations();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated NOT
	 */
	XMod_ExceptionReaction execute();

} // XMod_Action
