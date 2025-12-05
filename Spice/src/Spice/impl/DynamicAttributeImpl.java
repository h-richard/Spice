/**
 */
package Spice.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import Spice.Data;
import Spice.DynamicAttribute;
import Spice.SpicePackage;
import Spice.StaticAttribute;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dynamic Attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Spice.impl.DynamicAttributeImpl#getInitial <em>Initial</em>}</li>
 *   <li>{@link Spice.impl.DynamicAttributeImpl#getNewData <em>New Data</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DynamicAttributeImpl extends AttributeImpl implements DynamicAttribute {
	/**
	 * The cached value of the '{@link #getInitial() <em>Initial</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitial()
	 * @generated
	 * @ordered
	 */
	protected StaticAttribute initial;

	/**
	 * The cached value of the '{@link #getNewData() <em>New Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNewData()
	 * @generated
	 * @ordered
	 */
	protected Data newData;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DynamicAttributeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SpicePackage.Literals.DYNAMIC_ATTRIBUTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StaticAttribute getInitial() {
		if (initial != null && initial.eIsProxy()) {
			InternalEObject oldInitial = (InternalEObject)initial;
			initial = (StaticAttribute)eResolveProxy(oldInitial);
			if (initial != oldInitial) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SpicePackage.DYNAMIC_ATTRIBUTE__INITIAL, oldInitial, initial));
			}
		}
		return initial;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StaticAttribute basicGetInitial() {
		return initial;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInitial(StaticAttribute newInitial) {
		StaticAttribute oldInitial = initial;
		initial = newInitial;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpicePackage.DYNAMIC_ATTRIBUTE__INITIAL, oldInitial, initial));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Data getNewData() {
		return newData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNewData(Data newNewData, NotificationChain msgs) {
		Data oldNewData = newData;
		newData = newNewData;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SpicePackage.DYNAMIC_ATTRIBUTE__NEW_DATA, oldNewData, newNewData);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNewData(Data newNewData) {
		if (newNewData != newData) {
			NotificationChain msgs = null;
			if (newData != null)
				msgs = ((InternalEObject)newData).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SpicePackage.DYNAMIC_ATTRIBUTE__NEW_DATA, null, msgs);
			if (newNewData != null)
				msgs = ((InternalEObject)newNewData).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SpicePackage.DYNAMIC_ATTRIBUTE__NEW_DATA, null, msgs);
			msgs = basicSetNewData(newNewData, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpicePackage.DYNAMIC_ATTRIBUTE__NEW_DATA, newNewData, newNewData));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SpicePackage.DYNAMIC_ATTRIBUTE__NEW_DATA:
				return basicSetNewData(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SpicePackage.DYNAMIC_ATTRIBUTE__INITIAL:
				if (resolve) return getInitial();
				return basicGetInitial();
			case SpicePackage.DYNAMIC_ATTRIBUTE__NEW_DATA:
				return getNewData();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SpicePackage.DYNAMIC_ATTRIBUTE__INITIAL:
				setInitial((StaticAttribute)newValue);
				return;
			case SpicePackage.DYNAMIC_ATTRIBUTE__NEW_DATA:
				setNewData((Data)newValue);
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
			case SpicePackage.DYNAMIC_ATTRIBUTE__INITIAL:
				setInitial((StaticAttribute)null);
				return;
			case SpicePackage.DYNAMIC_ATTRIBUTE__NEW_DATA:
				setNewData((Data)null);
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
			case SpicePackage.DYNAMIC_ATTRIBUTE__INITIAL:
				return initial != null;
			case SpicePackage.DYNAMIC_ATTRIBUTE__NEW_DATA:
				return newData != null;
		}
		return super.eIsSet(featureID);
	}

} //DynamicAttributeImpl
