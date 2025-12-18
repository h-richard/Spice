/**
 */
package Spice.impl;

import Spice.Attribute;
import Spice.Component;
import Spice.SpicePackage;
import Spice.Xmod_Action;
import Spice.Xmod_ExceptionReaction;
import Spice.*;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;
import java.util.List;

import observers.Facade;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Spice.impl.ComponentImpl#getPeriod <em>Period</em>}</li>
 *   <li>{@link Spice.impl.ComponentImpl#getPriority <em>Priority</em>}</li>
 *   <li>{@link Spice.impl.ComponentImpl#isIsDataFlow <em>Is Data Flow</em>}</li>
 *   <li>{@link Spice.impl.ComponentImpl#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link Spice.impl.ComponentImpl#getActions <em>Actions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComponentImpl extends Xmod_ElementImpl implements Component {
	/**
	 * The default value of the '{@link #getPeriod() <em>Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeriod()
	 * @generated
	 * @ordered
	 */
	protected static final long PERIOD_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getPeriod() <em>Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeriod()
	 * @generated
	 * @ordered
	 */
	protected long period = PERIOD_EDEFAULT;

	/**
	 * The default value of the '{@link #getPriority() <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriority()
	 * @generated
	 * @ordered
	 */
	protected static final long PRIORITY_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getPriority() <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriority()
	 * @generated
	 * @ordered
	 */
	protected long priority = PRIORITY_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsDataFlow() <em>Is Data Flow</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsDataFlow()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_DATA_FLOW_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsDataFlow() <em>Is Data Flow</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsDataFlow()
	 * @generated
	 * @ordered
	 */
	protected boolean isDataFlow = IS_DATA_FLOW_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAttributes() <em>Attributes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributes()
	 * @generated
	 * @ordered
	 */
	protected EList<Attribute> attributes;

	/**
	 * The cached value of the '{@link #getActions() <em>Actions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActions()
	 * @generated
	 * @ordered
	 */
	protected EList<Xmod_Action> actions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SpicePackage.Literals.COMPONENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getPeriod() {
		return period;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPeriod(long newPeriod) {
		long oldPeriod = period;
		period = newPeriod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpicePackage.COMPONENT__PERIOD, oldPeriod, period));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getPriority() {
		return priority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPriority(long newPriority) {
		long oldPriority = priority;
		priority = newPriority;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpicePackage.COMPONENT__PRIORITY, oldPriority, priority));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIsDataFlow() {
		return isDataFlow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsDataFlow(boolean newIsDataFlow) {
		boolean oldIsDataFlow = isDataFlow;
		isDataFlow = newIsDataFlow;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpicePackage.COMPONENT__IS_DATA_FLOW, oldIsDataFlow, isDataFlow));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Attribute> getAttributes() {
		if (attributes == null) {
			attributes = new EObjectContainmentEList<Attribute>(Attribute.class, this, SpicePackage.COMPONENT__ATTRIBUTES);
		}
		return attributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Xmod_Action> getActions() {
		if (actions == null) {
			actions = new EObjectContainmentEList<Xmod_Action>(Xmod_Action.class, this, SpicePackage.COMPONENT__ACTIONS);
		}
		return actions;
	}

	private Xmod_Action action(String name) {
		return actions.stream()
				.filter(a -> a.getXmod_id().equals(name))
				.findFirst()
				.orElse(null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public Xmod_ExceptionReaction doStep() {
		Xmod_Action action = action("doStep");
		if (action != null)
			return action.execute();
		else return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void update() {
		for (Attribute a : attributes) {
			if (a instanceof BasicAttribute ba) {
				System.out.println(getXmod_id()+"> update: "+ba.getName()+"="+ba.getValue()+" ; new "+ba.getName()+"="+ba.getNewValue());
				if (ba.getNewValue() != null)
					ba.setValue(ba.getNewValue());
				if (ba.isIsObservable())
					Facade.getInstance().update(this.xmod_id+"."+ba.getName(), ba.getValue());
			}
			if (a instanceof ArrayAttribute aa) {
				System.out.println(getXmod_id()+"> update: "+aa.getName()+"="+aa.getValue()+" ; new "+aa.getName()+"="+aa.getNewValue());
				if (aa.getNewValue() != null && !aa.getNewValue().isEmpty()) {
					aa.getValue().clear();
					aa.getValue().addAll(aa.getNewValue());
				}
				if (aa.isIsObservable())
					Facade.getInstance().update(this.xmod_id+"."+aa.getName(), List.copyOf(aa.getValue()));
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SpicePackage.COMPONENT__ATTRIBUTES:
				return ((InternalEList<?>)getAttributes()).basicRemove(otherEnd, msgs);
			case SpicePackage.COMPONENT__ACTIONS:
				return ((InternalEList<?>)getActions()).basicRemove(otherEnd, msgs);
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
			case SpicePackage.COMPONENT__PERIOD:
				return getPeriod();
			case SpicePackage.COMPONENT__PRIORITY:
				return getPriority();
			case SpicePackage.COMPONENT__IS_DATA_FLOW:
				return isIsDataFlow();
			case SpicePackage.COMPONENT__ATTRIBUTES:
				return getAttributes();
			case SpicePackage.COMPONENT__ACTIONS:
				return getActions();
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
			case SpicePackage.COMPONENT__PERIOD:
				setPeriod((Long)newValue);
				return;
			case SpicePackage.COMPONENT__PRIORITY:
				setPriority((Long)newValue);
				return;
			case SpicePackage.COMPONENT__IS_DATA_FLOW:
				setIsDataFlow((Boolean)newValue);
				return;
			case SpicePackage.COMPONENT__ATTRIBUTES:
				getAttributes().clear();
				getAttributes().addAll((Collection<? extends Attribute>)newValue);
				return;
			case SpicePackage.COMPONENT__ACTIONS:
				getActions().clear();
				getActions().addAll((Collection<? extends Xmod_Action>)newValue);
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
			case SpicePackage.COMPONENT__PERIOD:
				setPeriod(PERIOD_EDEFAULT);
				return;
			case SpicePackage.COMPONENT__PRIORITY:
				setPriority(PRIORITY_EDEFAULT);
				return;
			case SpicePackage.COMPONENT__IS_DATA_FLOW:
				setIsDataFlow(IS_DATA_FLOW_EDEFAULT);
				return;
			case SpicePackage.COMPONENT__ATTRIBUTES:
				getAttributes().clear();
				return;
			case SpicePackage.COMPONENT__ACTIONS:
				getActions().clear();
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
			case SpicePackage.COMPONENT__PERIOD:
				return period != PERIOD_EDEFAULT;
			case SpicePackage.COMPONENT__PRIORITY:
				return priority != PRIORITY_EDEFAULT;
			case SpicePackage.COMPONENT__IS_DATA_FLOW:
				return isDataFlow != IS_DATA_FLOW_EDEFAULT;
			case SpicePackage.COMPONENT__ATTRIBUTES:
				return attributes != null && !attributes.isEmpty();
			case SpicePackage.COMPONENT__ACTIONS:
				return actions != null && !actions.isEmpty();
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
			case SpicePackage.COMPONENT___DO_STEP:
				return doStep();
			case SpicePackage.COMPONENT___UPDATE:
				update();
				return null;
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(" (period: ");
		result.append(period);
		result.append(", priority: ");
		result.append(priority);
		result.append(", isDataFlow: ");
		result.append(isDataFlow);
		result.append(')');
		return result.toString();
	}

} //ComponentImpl
