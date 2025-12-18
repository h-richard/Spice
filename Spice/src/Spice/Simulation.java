/**
 */
package Spice;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Simulation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Spice.Simulation#getStartTime <em>Start Time</em>}</li>
 *   <li>{@link Spice.Simulation#getEndTime <em>End Time</em>}</li>
 *   <li>{@link Spice.Simulation#getDurationStep <em>Duration Step</em>}</li>
 *   <li>{@link Spice.Simulation#getComponents <em>Components</em>}</li>
 *   <li>{@link Spice.Simulation#getViews <em>Views</em>}</li>
 * </ul>
 *
 * @see Spice.SpicePackage#getSimulation()
 * @model annotation="Xmod_elem"
 *        annotation="Xmod_main"
 * @generated
 */
public interface Simulation extends Xmod_Element {
	/**
	 * Returns the value of the '<em><b>Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Time</em>' attribute.
	 * @see #setStartTime(long)
	 * @see Spice.SpicePackage#getSimulation_StartTime()
	 * @model required="true"
	 * @generated
	 */
	long getStartTime();

	/**
	 * Sets the value of the '{@link Spice.Simulation#getStartTime <em>Start Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Time</em>' attribute.
	 * @see #getStartTime()
	 * @generated
	 */
	void setStartTime(long value);

	/**
	 * Returns the value of the '<em><b>End Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Time</em>' attribute.
	 * @see #setEndTime(long)
	 * @see Spice.SpicePackage#getSimulation_EndTime()
	 * @model required="true"
	 * @generated
	 */
	long getEndTime();

	/**
	 * Sets the value of the '{@link Spice.Simulation#getEndTime <em>End Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Time</em>' attribute.
	 * @see #getEndTime()
	 * @generated
	 */
	void setEndTime(long value);

	/**
	 * Returns the value of the '<em><b>Duration Step</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Duration Step</em>' attribute.
	 * @see #setDurationStep(long)
	 * @see Spice.SpicePackage#getSimulation_DurationStep()
	 * @model required="true"
	 * @generated
	 */
	long getDurationStep();

	/**
	 * Sets the value of the '{@link Spice.Simulation#getDurationStep <em>Duration Step</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duration Step</em>' attribute.
	 * @see #getDurationStep()
	 * @generated
	 */
	void setDurationStep(long value);

	/**
	 * Returns the value of the '<em><b>Components</b></em>' containment reference list.
	 * The list contents are of type {@link Spice.Component}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Components</em>' containment reference list.
	 * @see Spice.SpicePackage#getSimulation_Components()
	 * @model containment="true"
	 * @generated
	 */
	EList<Component> getComponents();

	/**
	 * Returns the value of the '<em><b>Views</b></em>' containment reference list.
	 * The list contents are of type {@link Spice.View}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Views</em>' containment reference list.
	 * @see Spice.SpicePackage#getSimulation_Views()
	 * @model containment="true"
	 * @generated
	 */
	EList<View> getViews();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void run();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void init();

} // Simulation
