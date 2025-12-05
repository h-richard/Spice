/**
 */
package Spice.impl;

import Spice.ExecutableComponent;
import Spice.ServiceComponent;
import Spice.SpicePackage;
import jdk.jfr.Name;
import observers.Facade;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import Spice.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Executable Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Spice.impl.ExecutableComponentImpl#getPeriod <em>Period</em>}</li>
 *   <li>{@link Spice.impl.ExecutableComponentImpl#getPriority <em>Priority</em>}</li>
 *   <li>{@link Spice.impl.ExecutableComponentImpl#getServices <em>Services</em>}</li>
 *   <li>{@link Spice.impl.ExecutableComponentImpl#isIsDataFlow <em>Is Data Flow</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExecutableComponentImpl extends ComponentImpl implements ExecutableComponent {
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
	 * The cached value of the '{@link #getServices() <em>Services</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServices()
	 * @generated
	 * @ordered
	 */
	protected EList<ServiceComponent> services;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExecutableComponentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SpicePackage.Literals.EXECUTABLE_COMPONENT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SpicePackage.EXECUTABLE_COMPONENT__PERIOD, oldPeriod, period));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SpicePackage.EXECUTABLE_COMPONENT__PRIORITY, oldPriority, priority));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ServiceComponent> getServices() {
		if (services == null) {
			services = new EObjectResolvingEList<ServiceComponent>(ServiceComponent.class, this, SpicePackage.EXECUTABLE_COMPONENT__SERVICES);
		}
		return services;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SpicePackage.EXECUTABLE_COMPONENT__IS_DATA_FLOW, oldIsDataFlow, isDataFlow));
	}
	
	private XMod_Action action(String xmod_id) {
		for (XMod_Action xma : actions)
			if (xma.getXmod_id().equals(xmod_id))
				return xma;
		return null;
	}

	/*
	if (res == null) {
			for (Attribute a : attributes) {
				if (a instanceof DynamicAttribute da) {
					System.out.println(getXmod_id()+"> doStep: "+da.getName()+"="+da.getData().getRawValue()+" ; new "+da.getName()+"="+da.getNewData().getRawValue());
				}
			}
		}
	 */

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */



	@Override
	@SuppressWarnings("all")

	// class ExecutableComponent
	public XMod_ExceptionReaction doStep() {
		return action("doStep").execute();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void update() {
        for (Attribute a : attributes) {
            if (a instanceof DynamicAttribute da) {
            	if (da.getNewData() != null)
            		da.getData().setRawValue(da.getNewData().getRawValue());
                if (da.isIsObservable())
                	Facade.getInstance().update(this.xmod_id+"."+da.getName(), da.getData().getRawValue());
                System.out.println(getXmod_id()+"> update: "+da.getName()+"="+da.getData().getRawValue()+" ; new "+da.getName()+"="+da.getNewData().getRawValue()); 
            }
        }
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SpicePackage.EXECUTABLE_COMPONENT__PERIOD:
				return getPeriod();
			case SpicePackage.EXECUTABLE_COMPONENT__PRIORITY:
				return getPriority();
			case SpicePackage.EXECUTABLE_COMPONENT__SERVICES:
				return getServices();
			case SpicePackage.EXECUTABLE_COMPONENT__IS_DATA_FLOW:
				return isIsDataFlow();
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
			case SpicePackage.EXECUTABLE_COMPONENT__PERIOD:
				setPeriod((Long)newValue);
				return;
			case SpicePackage.EXECUTABLE_COMPONENT__PRIORITY:
				setPriority((Long)newValue);
				return;
			case SpicePackage.EXECUTABLE_COMPONENT__SERVICES:
				getServices().clear();
				getServices().addAll((Collection<? extends ServiceComponent>)newValue);
				return;
			case SpicePackage.EXECUTABLE_COMPONENT__IS_DATA_FLOW:
				setIsDataFlow((Boolean)newValue);
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
			case SpicePackage.EXECUTABLE_COMPONENT__PERIOD:
				setPeriod(PERIOD_EDEFAULT);
				return;
			case SpicePackage.EXECUTABLE_COMPONENT__PRIORITY:
				setPriority(PRIORITY_EDEFAULT);
				return;
			case SpicePackage.EXECUTABLE_COMPONENT__SERVICES:
				getServices().clear();
				return;
			case SpicePackage.EXECUTABLE_COMPONENT__IS_DATA_FLOW:
				setIsDataFlow(IS_DATA_FLOW_EDEFAULT);
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
			case SpicePackage.EXECUTABLE_COMPONENT__PERIOD:
				return period != PERIOD_EDEFAULT;
			case SpicePackage.EXECUTABLE_COMPONENT__PRIORITY:
				return priority != PRIORITY_EDEFAULT;
			case SpicePackage.EXECUTABLE_COMPONENT__SERVICES:
				return services != null && !services.isEmpty();
			case SpicePackage.EXECUTABLE_COMPONENT__IS_DATA_FLOW:
				return isDataFlow != IS_DATA_FLOW_EDEFAULT;
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
			case SpicePackage.EXECUTABLE_COMPONENT___DO_STEP:
				return doStep();
			case SpicePackage.EXECUTABLE_COMPONENT___UPDATE:
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

	@Override
	public void Init() {
		// TODO Auto-generated method stub
		
	}

} //ExecutableComponentImpl
