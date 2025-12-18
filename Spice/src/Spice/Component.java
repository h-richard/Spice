/**
 */
package Spice;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Spice.Component#getPeriod <em>Period</em>}</li>
 *   <li>{@link Spice.Component#getPriority <em>Priority</em>}</li>
 *   <li>{@link Spice.Component#isIsDataFlow <em>Is Data Flow</em>}</li>
 *   <li>{@link Spice.Component#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link Spice.Component#getActions <em>Actions</em>}</li>
 * </ul>
 *
 * @see Spice.SpicePackage#getComponent()
 * @model annotation="Xmod_exec"
 *        annotation="Xmod_elem"
 * @generated
 */
public interface Component extends Xmod_Element {
	/**
	 * Returns the value of the '<em><b>Period</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Period</em>' attribute.
	 * @see #setPeriod(long)
	 * @see Spice.SpicePackage#getComponent_Period()
	 * @model required="true"
	 * @generated
	 */
	long getPeriod();

	/**
	 * Sets the value of the '{@link Spice.Component#getPeriod <em>Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Period</em>' attribute.
	 * @see #getPeriod()
	 * @generated
	 */
	void setPeriod(long value);

	/**
	 * Returns the value of the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Priority</em>' attribute.
	 * @see #setPriority(long)
	 * @see Spice.SpicePackage#getComponent_Priority()
	 * @model required="true"
	 * @generated
	 */
	long getPriority();

	/**
	 * Sets the value of the '{@link Spice.Component#getPriority <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Priority</em>' attribute.
	 * @see #getPriority()
	 * @generated
	 */
	void setPriority(long value);

	/**
	 * Returns the value of the '<em><b>Is Data Flow</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Data Flow</em>' attribute.
	 * @see #setIsDataFlow(boolean)
	 * @see Spice.SpicePackage#getComponent_IsDataFlow()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isIsDataFlow();

	/**
	 * Sets the value of the '{@link Spice.Component#isIsDataFlow <em>Is Data Flow</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Data Flow</em>' attribute.
	 * @see #isIsDataFlow()
	 * @generated
	 */
	void setIsDataFlow(boolean value);

	/**
	 * Returns the value of the '<em><b>Attributes</b></em>' containment reference list.
	 * The list contents are of type {@link Spice.Attribute}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributes</em>' containment reference list.
	 * @see Spice.SpicePackage#getComponent_Attributes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Attribute> getAttributes();

	/**
	 * Returns the value of the '<em><b>Actions</b></em>' containment reference list.
	 * The list contents are of type {@link Spice.Xmod_Action}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actions</em>' containment reference list.
	 * @see Spice.SpicePackage#getComponent_Actions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Xmod_Action> getActions();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true"
	 * @generated
	 */
	Xmod_ExceptionReaction doStep();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void update();

} // Component
