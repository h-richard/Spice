/**
 */
package Spice;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object <em><b>Xmod Action</b></em>.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Spice.Xmod_Action#getOperations <em>Operations</em>}</li>
 * </ul>
 *
 * @see Spice.SpicePackage#getXmod_Action()
 * @model
 * @generated NOT
 */
public interface Xmod_Action extends Xmod_Element {
    /**
     * Returns the value of the <em><b>Operations</b></em> containment reference list.
     * The list contents are of type {@link Spice.Xmod_Operation}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the <em>Operations</em> containment reference list.
     * @see Spice.SpicePackage#getXmod_Action_Operations()
     * @model containment="true" required="true"
     * @generated NOT
     */
    EList<Xmod_Operation> getOperations();

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @model
     * @generated NOT
     */
    Xmod_ExceptionReaction execute();

} // Xmod_Action
