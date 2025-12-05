/**
 */
package Spice.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import Spice.SpicePackage;
import Spice.XMod_Exception;
import Spice.XMod_ExceptionLiteral;
import Spice.XMod_ExceptionReaction;
import Spice.XMod_Operation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>XMod Exception</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Spice.impl.XMod_ExceptionImpl#getLiteral <em>Literal</em>}</li>
 *   <li>{@link Spice.impl.XMod_ExceptionImpl#getFilter <em>Filter</em>}</li>
 *   <li>{@link Spice.impl.XMod_ExceptionImpl#getReaction <em>Reaction</em>}</li>
 *   <li>{@link Spice.impl.XMod_ExceptionImpl#getCalledOperation <em>Called Operation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class XMod_ExceptionImpl extends MinimalEObjectImpl.Container implements XMod_Exception {
	/**
	 * The default value of the '{@link #getLiteral() <em>Literal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLiteral()
	 * @generated
	 * @ordered
	 */
	protected static final XMod_ExceptionLiteral LITERAL_EDEFAULT = XMod_ExceptionLiteral.OK;

	/**
	 * The cached value of the '{@link #getLiteral() <em>Literal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLiteral()
	 * @generated
	 * @ordered
	 */
	protected XMod_ExceptionLiteral literal = LITERAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getFilter() <em>Filter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilter()
	 * @generated
	 * @ordered
	 */
	protected static final String FILTER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFilter() <em>Filter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilter()
	 * @generated
	 * @ordered
	 */
	protected String filter = FILTER_EDEFAULT;

	/**
	 * The default value of the '{@link #getReaction() <em>Reaction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReaction()
	 * @generated
	 * @ordered
	 */
	protected static final XMod_ExceptionReaction REACTION_EDEFAULT = XMod_ExceptionReaction.CONTINUE;

	/**
	 * The cached value of the '{@link #getReaction() <em>Reaction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReaction()
	 * @generated
	 * @ordered
	 */
	protected XMod_ExceptionReaction reaction = REACTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCalledOperation() <em>Called Operation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCalledOperation()
	 * @generated
	 * @ordered
	 */
	protected XMod_Operation calledOperation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XMod_ExceptionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SpicePackage.Literals.XMOD_EXCEPTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XMod_ExceptionLiteral getLiteral() {
		return literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLiteral(XMod_ExceptionLiteral newLiteral) {
		XMod_ExceptionLiteral oldLiteral = literal;
		literal = newLiteral == null ? LITERAL_EDEFAULT : newLiteral;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpicePackage.XMOD_EXCEPTION__LITERAL, oldLiteral, literal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFilter() {
		return filter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFilter(String newFilter) {
		String oldFilter = filter;
		filter = newFilter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpicePackage.XMOD_EXCEPTION__FILTER, oldFilter, filter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XMod_ExceptionReaction getReaction() {
		return reaction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReaction(XMod_ExceptionReaction newReaction) {
		XMod_ExceptionReaction oldReaction = reaction;
		reaction = newReaction == null ? REACTION_EDEFAULT : newReaction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpicePackage.XMOD_EXCEPTION__REACTION, oldReaction, reaction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XMod_Operation getCalledOperation() {
		return calledOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCalledOperation(XMod_Operation newCalledOperation, NotificationChain msgs) {
		XMod_Operation oldCalledOperation = calledOperation;
		calledOperation = newCalledOperation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SpicePackage.XMOD_EXCEPTION__CALLED_OPERATION, oldCalledOperation, newCalledOperation);
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
	public void setCalledOperation(XMod_Operation newCalledOperation) {
		if (newCalledOperation != calledOperation) {
			NotificationChain msgs = null;
			if (calledOperation != null)
				msgs = ((InternalEObject)calledOperation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SpicePackage.XMOD_EXCEPTION__CALLED_OPERATION, null, msgs);
			if (newCalledOperation != null)
				msgs = ((InternalEObject)newCalledOperation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SpicePackage.XMOD_EXCEPTION__CALLED_OPERATION, null, msgs);
			msgs = basicSetCalledOperation(newCalledOperation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpicePackage.XMOD_EXCEPTION__CALLED_OPERATION, newCalledOperation, newCalledOperation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SpicePackage.XMOD_EXCEPTION__CALLED_OPERATION:
				return basicSetCalledOperation(null, msgs);
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
			case SpicePackage.XMOD_EXCEPTION__LITERAL:
				return getLiteral();
			case SpicePackage.XMOD_EXCEPTION__FILTER:
				return getFilter();
			case SpicePackage.XMOD_EXCEPTION__REACTION:
				return getReaction();
			case SpicePackage.XMOD_EXCEPTION__CALLED_OPERATION:
				return getCalledOperation();
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
			case SpicePackage.XMOD_EXCEPTION__LITERAL:
				setLiteral((XMod_ExceptionLiteral)newValue);
				return;
			case SpicePackage.XMOD_EXCEPTION__FILTER:
				setFilter((String)newValue);
				return;
			case SpicePackage.XMOD_EXCEPTION__REACTION:
				setReaction((XMod_ExceptionReaction)newValue);
				return;
			case SpicePackage.XMOD_EXCEPTION__CALLED_OPERATION:
				setCalledOperation((XMod_Operation)newValue);
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
			case SpicePackage.XMOD_EXCEPTION__LITERAL:
				setLiteral(LITERAL_EDEFAULT);
				return;
			case SpicePackage.XMOD_EXCEPTION__FILTER:
				setFilter(FILTER_EDEFAULT);
				return;
			case SpicePackage.XMOD_EXCEPTION__REACTION:
				setReaction(REACTION_EDEFAULT);
				return;
			case SpicePackage.XMOD_EXCEPTION__CALLED_OPERATION:
				setCalledOperation((XMod_Operation)null);
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
			case SpicePackage.XMOD_EXCEPTION__LITERAL:
				return literal != LITERAL_EDEFAULT;
			case SpicePackage.XMOD_EXCEPTION__FILTER:
				return FILTER_EDEFAULT == null ? filter != null : !FILTER_EDEFAULT.equals(filter);
			case SpicePackage.XMOD_EXCEPTION__REACTION:
				return reaction != REACTION_EDEFAULT;
			case SpicePackage.XMOD_EXCEPTION__CALLED_OPERATION:
				return calledOperation != null;
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
		result.append(" (literal: ");
		result.append(literal);
		result.append(", filter: ");
		result.append(filter);
		result.append(", reaction: ");
		result.append(reaction);
		result.append(')');
		return result.toString();
	}

} //XMod_ExceptionImpl
