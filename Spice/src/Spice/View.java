/**
 */
package Spice;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>View</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Spice.View#isRemoteDriven <em>Remote Driven</em>}</li>
 *   <li>{@link Spice.View#getHost <em>Host</em>}</li>
 *   <li>{@link Spice.View#getPort <em>Port</em>}</li>
 *   <li>{@link Spice.View#getPeriod <em>Period</em>}</li>
 *   <li>{@link Spice.View#getServices <em>Services</em>}</li>
 *   <li>{@link Spice.View#getAdapters <em>Adapters</em>}</li>
 *   <li>{@link Spice.View#getObservedTags <em>Observed Tags</em>}</li>
 * </ul>
 *
 * @see Spice.SpicePackage#getView()
 * @model
 * @generated
 */
public interface View extends XMod_Element {
	/**
	 * Returns the value of the '<em><b>Remote Driven</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Remote Driven</em>' attribute.
	 * @see #setRemoteDriven(boolean)
	 * @see Spice.SpicePackage#getView_RemoteDriven()
	 * @model default="false"
	 * @generated
	 */
	boolean isRemoteDriven();

	/**
	 * Sets the value of the '{@link Spice.View#isRemoteDriven <em>Remote Driven</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Remote Driven</em>' attribute.
	 * @see #isRemoteDriven()
	 * @generated
	 */
	void setRemoteDriven(boolean value);

	/**
	 * Returns the value of the '<em><b>Host</b></em>' attribute.
	 * The default value is <code>"localhost"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Host</em>' attribute.
	 * @see #setHost(String)
	 * @see Spice.SpicePackage#getView_Host()
	 * @model default="localhost"
	 * @generated
	 */
	String getHost();

	/**
	 * Sets the value of the '{@link Spice.View#getHost <em>Host</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Host</em>' attribute.
	 * @see #getHost()
	 * @generated
	 */
	void setHost(String value);

	/**
	 * Returns the value of the '<em><b>Port</b></em>' attribute.
	 * The default value is <code>"8080"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port</em>' attribute.
	 * @see #setPort(int)
	 * @see Spice.SpicePackage#getView_Port()
	 * @model default="8080"
	 * @generated
	 */
	int getPort();

	/**
	 * Sets the value of the '{@link Spice.View#getPort <em>Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port</em>' attribute.
	 * @see #getPort()
	 * @generated
	 */
	void setPort(int value);

	/**
	 * Returns the value of the '<em><b>Period</b></em>' attribute.
	 * The default value is <code>"1000"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Period</em>' attribute.
	 * @see #setPeriod(long)
	 * @see Spice.SpicePackage#getView_Period()
	 * @model default="1000"
	 * @generated
	 */
	long getPeriod();

	/**
	 * Sets the value of the '{@link Spice.View#getPeriod <em>Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Period</em>' attribute.
	 * @see #getPeriod()
	 * @generated
	 */
	void setPeriod(long value);

	/**
	 * Returns the value of the '<em><b>Services</b></em>' reference list.
	 * The list contents are of type {@link Spice.ServiceComponent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Services</em>' reference list.
	 * @see Spice.SpicePackage#getView_Services()
	 * @model
	 * @generated
	 */
	EList<ServiceComponent> getServices();

	/**
	 * Returns the value of the '<em><b>Adapters</b></em>' reference list.
	 * The list contents are of type {@link Spice.Adapter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Adapters</em>' reference list.
	 * @see Spice.SpicePackage#getView_Adapters()
	 * @model
	 * @generated
	 */
	EList<Adapter> getAdapters();

	/**
	 * Returns the value of the '<em><b>Observed Tags</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Observed Tags</em>' attribute list.
	 * @see Spice.SpicePackage#getView_ObservedTags()
	 * @model
	 * @generated
	 */
	EList<String> getObservedTags();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void start();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void update();

} // View
