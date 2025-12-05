/**
 */
package Spice;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Executable Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Spice.ExecutableComponent#getPeriod <em>Period</em>}</li>
 *   <li>{@link Spice.ExecutableComponent#getPriority <em>Priority</em>}</li>
 *   <li>{@link Spice.ExecutableComponent#getServices <em>Services</em>}</li>
 *   <li>{@link Spice.ExecutableComponent#isIsDataFlow <em>Is Data Flow</em>}</li>
 * </ul>
 *
 * @see Spice.SpicePackage#getExecutableComponent()
 * @model annotation="Xmod_exec"
 * @generated
 */
public interface ExecutableComponent extends Component {
	/**
	 * Returns the value of the '<em><b>Period</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Period</em>' attribute.
	 * @see #setPeriod(long)
	 * @see Spice.SpicePackage#getExecutableComponent_Period()
	 * @model required="true"
	 * @generated
	 */
	long getPeriod();

	/**
	 * Sets the value of the '{@link Spice.ExecutableComponent#getPeriod <em>Period</em>}' attribute.
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
	 * @see Spice.SpicePackage#getExecutableComponent_Priority()
	 * @model required="true"
	 * @generated
	 */
	long getPriority();

	/**
	 * Sets the value of the '{@link Spice.ExecutableComponent#getPriority <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Priority</em>' attribute.
	 * @see #getPriority()
	 * @generated
	 */
	void setPriority(long value);

	/**
	 * Returns the value of the '<em><b>Services</b></em>' reference list.
	 * The list contents are of type {@link Spice.ServiceComponent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Services</em>' reference list.
	 * @see Spice.SpicePackage#getExecutableComponent_Services()
	 * @model
	 * @generated
	 */
	EList<ServiceComponent> getServices();

	/**
	 * Returns the value of the '<em><b>Is Data Flow</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Data Flow</em>' attribute.
	 * @see #setIsDataFlow(boolean)
	 * @see Spice.SpicePackage#getExecutableComponent_IsDataFlow()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isIsDataFlow();

	/**
	 * Sets the value of the '{@link Spice.ExecutableComponent#isIsDataFlow <em>Is Data Flow</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Data Flow</em>' attribute.
	 * @see #isIsDataFlow()
	 * @generated
	 */
	void setIsDataFlow(boolean value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true"
	 * @generated
	 */
	XMod_ExceptionReaction doStep();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void update();

} // ExecutableComponent
