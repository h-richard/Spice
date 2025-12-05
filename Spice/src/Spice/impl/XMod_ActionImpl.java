/**
 */
package Spice.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayDeque;
import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import Spice.SpicePackage;
import Spice.XMod_Action;
import Spice.XMod_Exception;
import Spice.XMod_ExceptionLiteral;
import Spice.XMod_ExceptionReaction;
import Spice.XMod_Operation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>XMod Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Spice.impl.XMod_ActionImpl#getOperations <em>Operations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class XMod_ActionImpl extends XMod_ElementImpl implements XMod_Action {
	/**
	 * The cached value of the '{@link #getOperations() <em>Operations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperations()
	 * @generated
	 * @ordered
	 */
	protected EList<XMod_Operation> operations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XMod_ActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SpicePackage.Literals.XMOD_ACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<XMod_Operation> getOperations() {
		if (operations == null) {
			operations = new EObjectContainmentEList<XMod_Operation>(XMod_Operation.class, this, SpicePackage.XMOD_ACTION__OPERATIONS);
		}
		return operations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public XMod_ExceptionReaction execute() {
		if (operations == null) return null;
		ArrayDeque<XMod_Operation> queuedOperations = new ArrayDeque<>();
		queuedOperations.addAll(operations);
		
		while (!queuedOperations.isEmpty()) {
			XMod_Operation op = queuedOperations.pollFirst();
			XMod_Exception xme = executeSingle(op);
			
			switch (xme.getReaction()) {
			case CONTINUE:
				continue;
			case SKIP:
				return null;
			case EXIT:
				System.exit(0);
			default:
				return xme.getReaction();
			}
		}
		
		return null;
	}
	
	private XMod_Exception executeSingle(XMod_Operation op) {
		XMod_Exception xme = op.callOperation();
		
		if (xme.getLiteral() != XMod_ExceptionLiteral.OK && xme.getCalledOperation() != null) {
			XMod_Exception lowerXme = executeSingle(xme.getCalledOperation());
			// comparing the current selected reaction with the lower one using their ordinal as weight
			xme = xme.getReaction().getValue() > lowerXme.getReaction().getValue() ? xme : lowerXme;
		}
		
		return xme;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SpicePackage.XMOD_ACTION__OPERATIONS:
				return ((InternalEList<?>)getOperations()).basicRemove(otherEnd, msgs);
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
			case SpicePackage.XMOD_ACTION__OPERATIONS:
				return getOperations();
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
			case SpicePackage.XMOD_ACTION__OPERATIONS:
				getOperations().clear();
				getOperations().addAll((Collection<? extends XMod_Operation>)newValue);
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
			case SpicePackage.XMOD_ACTION__OPERATIONS:
				getOperations().clear();
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
			case SpicePackage.XMOD_ACTION__OPERATIONS:
				return operations != null && !operations.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case SpicePackage.XMOD_ACTION___EXECUTE:
				return execute();
		}
		return super.eInvoke(operationID, arguments);
	}

} //XMod_ActionImpl
