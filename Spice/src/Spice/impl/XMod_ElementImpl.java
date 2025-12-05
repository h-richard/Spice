/**
 */
package Spice.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import Spice.SpicePackage;
import Spice.XMod_Element;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>XMod Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Spice.impl.XMod_ElementImpl#getXmod_id <em>Xmod id</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class XMod_ElementImpl extends MinimalEObjectImpl.Container implements XMod_Element {
	/**
	 * The default value of the '{@link #getXmod_id() <em>Xmod id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXmod_id()
	 * @generated
	 * @ordered
	 */
	protected static final String XMOD_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getXmod_id() <em>Xmod id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXmod_id()
	 * @generated
	 * @ordered
	 */
	protected String xmod_id = XMOD_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XMod_ElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SpicePackage.Literals.XMOD_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getXmod_id() {
		return xmod_id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setXmod_id(String newXmod_id) {
		String oldXmod_id = xmod_id;
		xmod_id = newXmod_id;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpicePackage.XMOD_ELEMENT__XMOD_ID, oldXmod_id, xmod_id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SpicePackage.XMOD_ELEMENT__XMOD_ID:
				return getXmod_id();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SpicePackage.XMOD_ELEMENT__XMOD_ID:
				setXmod_id((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case SpicePackage.XMOD_ELEMENT__XMOD_ID:
				setXmod_id(XMOD_ID_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case SpicePackage.XMOD_ELEMENT__XMOD_ID:
				return XMOD_ID_EDEFAULT == null ? xmod_id != null : !XMOD_ID_EDEFAULT.equals(xmod_id);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (xmod_id: ");
		result.append(xmod_id);
		result.append(')');
		return result.toString();
	}

} //XMod_ElementImpl
