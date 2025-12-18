/**
 */
package Spice.impl;

import Spice.ArrayAttribute;
import Spice.SpicePackage;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Array Attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Spice.impl.ArrayAttributeImpl#getValue <em>Value</em>}</li>
 *   <li>{@link Spice.impl.ArrayAttributeImpl#getNewValue <em>New Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ArrayAttributeImpl extends AttributeImpl implements ArrayAttribute {
	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected EList<Object> value;

	/**
	 * The cached value of the '{@link #getNewValue() <em>New Value</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNewValue()
	 * @generated
	 * @ordered
	 */
	protected EList<Object> newValue;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArrayAttributeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SpicePackage.Literals.ARRAY_ATTRIBUTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Object> getValue() {
		if (value == null) {
			value = new EDataTypeEList<Object>(Object.class, this, SpicePackage.ARRAY_ATTRIBUTE__VALUE);
		}
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Object> getNewValue() {
		if (newValue == null) {
			newValue = new EDataTypeEList<Object>(Object.class, this, SpicePackage.ARRAY_ATTRIBUTE__NEW_VALUE);
		}
		return newValue;
	}

	// ##### False-fields
	// # arrayValue
	private Object[] arrayValueGetter(EList<Object> arg) {
		if (arg.isEmpty())
			return new Object[0];

		Object first = arg.get(0);
		Class<?> elementType = first.getClass();
		Object[] array = (Object[]) Array.newInstance(elementType, arg.size());

		for (int i = 0; i < arg.size(); i++)
			Array.set(array, i, arg.get(i));

		return array;
	}

	private void arrayValueSetter(Object[] newValue, EList<Object> arg) {
		arg.clear();
		Collections.addAll(arg, newValue);
	}

	@Override
	public Object[] getArrayValue() {
		return arrayValueGetter(value);
	}

	@Override
	public Object[] getNewArrayValue() {
		return arrayValueGetter(newValue);
	}

	@Override
	public void setArrayValue(Object[] newValue) {
		arrayValueSetter(newValue, value);
	}

	@Override
	public void setNewArrayValue(Object[] newValue) {
		arrayValueSetter(newValue, this.newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SpicePackage.ARRAY_ATTRIBUTE__VALUE:
				return getValue();
			case SpicePackage.ARRAY_ATTRIBUTE__NEW_VALUE:
				return getNewValue();
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
			case SpicePackage.ARRAY_ATTRIBUTE__VALUE:
				getValue().clear();
				getValue().addAll((Collection<? extends Object>)newValue);
				return;
			case SpicePackage.ARRAY_ATTRIBUTE__NEW_VALUE:
				getNewValue().clear();
				getNewValue().addAll((Collection<? extends Object>)newValue);
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
			case SpicePackage.ARRAY_ATTRIBUTE__VALUE:
				getValue().clear();
				return;
			case SpicePackage.ARRAY_ATTRIBUTE__NEW_VALUE:
				getNewValue().clear();
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
			case SpicePackage.ARRAY_ATTRIBUTE__VALUE:
				return value != null && !value.isEmpty();
			case SpicePackage.ARRAY_ATTRIBUTE__NEW_VALUE:
				return newValue != null && !newValue.isEmpty();
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
		result.append(" (value: ");
		result.append(value);
		result.append(", newValue: ");
		result.append(newValue);
		result.append(')');
		return result.toString();
	}

} //ArrayAttributeImpl
