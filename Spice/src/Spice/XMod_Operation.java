/**
 */
package Spice;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object <em><b>Xmod Operation</b></em>.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Spice.Xmod_Operation#getName <em>Name</em>}</li>
 *   <li>{@link Spice.Xmod_Operation#getObjectTag <em>Object Tag</em>}</li>
 *   <li>{@link Spice.Xmod_Operation#getParametersTag <em>Parameters Tag</em>}</li>
 *   <li>{@link Spice.Xmod_Operation#getReturnTag <em>Return Tag</em>}</li>
 *   <li>{@link Spice.Xmod_Operation#getExceptions <em>Exceptions</em>}</li>
 * </ul>
 *
 * @see Spice.SpicePackage#getXmod_Operation()
 * @model
 * @generated NOT
 */
public interface Xmod_Operation extends EObject {

    void setEOK(Xmod_Exception xme);

    /**
     * Returns the value of the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Name</em>' attribute.
     * @see #setName(String)
     * @see Spice.SpicePackage#getXmod_Operation_Name()
     * @model required="true"
     * @generated NOT
     */
    String getName();

    /**
     * Sets the value of the '{@link Spice.Xmod_Operation#getName <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Name</em>' attribute.
     * @see #getName()
     * @generated NOT
     */
    void setName(String value);

    /**
     * Returns the value of the <em><b>Object Tag</b></em> attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Object Tag</em>' attribute.
     * @see #setObjectTag(String)
     * @see Spice.SpicePackage#getXmod_Operation_ObjectTag()
     * @model required="true"
     * @generated NOT
     */
    String getObjectTag();

    /**
     * Sets the value of the '{@link Spice.Xmod_Operation#getObjectTag <em>Object Tag</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Object Tag</em>' attribute.
     * @see #getObjectTag()
     * @generated NOT
     */
    void setObjectTag(String value);

    /**
     * Returns the value of the '<em><b>Parameters Tag</b></em>' attribute list.
     * The list contents are of type {@link java.lang.String}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Parameters Tag</em>' attribute list.
     * @see Spice.SpicePackage#getXmod_Operation_ParametersTag()
     * @model
     * @generated NOT
     */
    EList<String> getParametersTag();

    /**
     * Returns the value of the '<em><b>Return Tag</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Return Tag</em>' attribute.
     * @see #setReturnTag(String)
     * @see Spice.SpicePackage#getXmod_Operation_ReturnTag()
     * @model
     * @generated NOT
     */
    String getReturnTag();

    /**
     * Sets the value of the '{@link Spice.Xmod_Operation#getReturnTag <em>Return Tag</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Return Tag</em>' attribute.
     * @see #getReturnTag()
     * @generated NOT
     */
    void setReturnTag(String value);

    /**
     * Returns the value of the '<em><b>Exceptions</b></em>' containment reference list.
     * The list contents are of type {@link Spice.Xmod_Exception}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Exceptions</em>' containment reference list.
     * @see Spice.SpicePackage#getXmod_Operation_Exceptions()
     * @model containment="true"
     * @generated NOT
     */
    EList<Xmod_Exception> getExceptions();

    Xmod_Exception getException(Xmod_ExceptionKind kind);

    Xmod_Exception getException(Xmod_ExceptionKind kind, String filter);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @model required="true"
     * @generated NOT
     */
    Xmod_Exception callOperation();

    void addException(Xmod_Exception xme);

} // Xmod_Operation
