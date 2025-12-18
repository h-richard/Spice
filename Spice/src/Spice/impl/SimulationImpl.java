/**
 */
package Spice.impl;

import Spice.Component;
import Spice.Simulation;
import Spice.SpicePackage;
import Spice.View;
import Spice.*;
import observers.Facade;

import java.lang.reflect.InvocationTargetException;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import static Spice.Xmod_ExceptionReaction.LOCALSTOP;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Simulation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Spice.impl.SimulationImpl#getStartTime <em>Start Time</em>}</li>
 *   <li>{@link Spice.impl.SimulationImpl#getEndTime <em>End Time</em>}</li>
 *   <li>{@link Spice.impl.SimulationImpl#getDurationStep <em>Duration Step</em>}</li>
 *   <li>{@link Spice.impl.SimulationImpl#getComponents <em>Components</em>}</li>
 *   <li>{@link Spice.impl.SimulationImpl#getViews <em>Views</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SimulationImpl extends Xmod_ElementImpl implements Simulation {
	/**
	 * The default value of the '{@link #getStartTime() <em>Start Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartTime()
	 * @generated
	 * @ordered
	 */
	protected static final long START_TIME_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getStartTime() <em>Start Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartTime()
	 * @generated
	 * @ordered
	 */
	protected long startTime = START_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getEndTime() <em>End Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndTime()
	 * @generated
	 * @ordered
	 */
	protected static final long END_TIME_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getEndTime() <em>End Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndTime()
	 * @generated
	 * @ordered
	 */
	protected long endTime = END_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getDurationStep() <em>Duration Step</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDurationStep()
	 * @generated
	 * @ordered
	 */
	protected static final long DURATION_STEP_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getDurationStep() <em>Duration Step</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDurationStep()
	 * @generated
	 * @ordered
	 */
	protected long durationStep = DURATION_STEP_EDEFAULT;

	/**
	 * The cached value of the '{@link #getComponents() <em>Components</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponents()
	 * @generated
	 * @ordered
	 */
	protected EList<Component> components;

	/**
	 * The cached value of the '{@link #getViews() <em>Views</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getViews()
	 * @generated
	 * @ordered
	 */
	protected EList<View> views;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SimulationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SpicePackage.Literals.SIMULATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getStartTime() {
		return startTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStartTime(long newStartTime) {
		long oldStartTime = startTime;
		startTime = newStartTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpicePackage.SIMULATION__START_TIME, oldStartTime, startTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getEndTime() {
		return endTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEndTime(long newEndTime) {
		long oldEndTime = endTime;
		endTime = newEndTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpicePackage.SIMULATION__END_TIME, oldEndTime, endTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getDurationStep() {
		return durationStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDurationStep(long newDurationStep) {
		long oldDurationStep = durationStep;
		durationStep = newDurationStep;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpicePackage.SIMULATION__DURATION_STEP, oldDurationStep, durationStep));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Component> getComponents() {
		if (components == null) {
			components = new EObjectContainmentEList<Component>(Component.class, this, SpicePackage.SIMULATION__COMPONENTS);
		}
		return components;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<View> getViews() {
		if (views == null) {
			views = new EObjectContainmentEList<View>(View.class, this, SpicePackage.SIMULATION__VIEWS);
		}
		return views;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void run() {
		System.out.println("### Run ###");
		Facade fi = Facade.getInstance();
		List<Component> cs = new ArrayList<>();
		List<Component> stopped = new ArrayList<>();
		List<Thread> viewThreads = new ArrayList<>();
		boolean end = false;
		
		// Components
        for (Component c : components) {
			cs.add(c);
			c.update();
			fi.update(c.getXmod_id(), c);
		}

        cs.sort(Comparator.comparingLong(Component::getPriority));
                
        // Views
        if (views != null) 
        	for (View v : views)
        		viewThreads.add(new Thread(() -> v.start()));
        
        for (Thread t : viewThreads)
        	t.start();
        		
        // main loop
        for (long i = startTime; i < endTime; i++) {
        	System.out.println("-- step : "+(float)i*durationStep/1000+" -> "+(float)(i+1)*durationStep/1000);
            for (Component c : cs) {
                if (i % c.getPeriod() == 0) {
                    Xmod_ExceptionReaction res = c.doStep();
                    if (res != null) {
                    	switch (res) {
                    	case LOCALSTOP: stopped.add(c);
                            break;
						default: break;
                        }
                    }
                    if (!c.isIsDataFlow()) c.update();
                }
            }
            for (Component c : cs) {
            	if (c.isIsDataFlow()) c.update();
            }
            fi.step();
            for (Component c : stopped) {
            	cs.remove(c);
            }
        }
        
        // stay awake for views
        while (!viewThreads.isEmpty()) {
			try { Thread.sleep(1000); } 
			catch (InterruptedException ignored) {}
            viewThreads.removeIf(t -> !t.isAlive());
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void init() {
		System.out.println("### Init ###");
		for (Component c : this.getComponents()) {
			System.out.println("Component '"+c.getXmod_id()+"':");
			for (Attribute a : c.getAttributes()) {
				if (a instanceof BasicAttribute ba)
					System.out.println("- '"+ba.getName()+"' = "+ba.getValue().toString());
				else if (a instanceof ArrayAttribute aa)
					System.out.println("- '"+aa.getName()+"' = "+aa.getValue().toString());
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
			case SpicePackage.SIMULATION__COMPONENTS:
				return ((InternalEList<?>)getComponents()).basicRemove(otherEnd, msgs);
			case SpicePackage.SIMULATION__VIEWS:
				return ((InternalEList<?>)getViews()).basicRemove(otherEnd, msgs);
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
			case SpicePackage.SIMULATION__START_TIME:
				return getStartTime();
			case SpicePackage.SIMULATION__END_TIME:
				return getEndTime();
			case SpicePackage.SIMULATION__DURATION_STEP:
				return getDurationStep();
			case SpicePackage.SIMULATION__COMPONENTS:
				return getComponents();
			case SpicePackage.SIMULATION__VIEWS:
				return getViews();
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
			case SpicePackage.SIMULATION__START_TIME:
				setStartTime((Long)newValue);
				return;
			case SpicePackage.SIMULATION__END_TIME:
				setEndTime((Long)newValue);
				return;
			case SpicePackage.SIMULATION__DURATION_STEP:
				setDurationStep((Long)newValue);
				return;
			case SpicePackage.SIMULATION__COMPONENTS:
				getComponents().clear();
				getComponents().addAll((Collection<? extends Component>)newValue);
				return;
			case SpicePackage.SIMULATION__VIEWS:
				getViews().clear();
				getViews().addAll((Collection<? extends View>)newValue);
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
			case SpicePackage.SIMULATION__START_TIME:
				setStartTime(START_TIME_EDEFAULT);
				return;
			case SpicePackage.SIMULATION__END_TIME:
				setEndTime(END_TIME_EDEFAULT);
				return;
			case SpicePackage.SIMULATION__DURATION_STEP:
				setDurationStep(DURATION_STEP_EDEFAULT);
				return;
			case SpicePackage.SIMULATION__COMPONENTS:
				getComponents().clear();
				return;
			case SpicePackage.SIMULATION__VIEWS:
				getViews().clear();
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
			case SpicePackage.SIMULATION__START_TIME:
				return startTime != START_TIME_EDEFAULT;
			case SpicePackage.SIMULATION__END_TIME:
				return endTime != END_TIME_EDEFAULT;
			case SpicePackage.SIMULATION__DURATION_STEP:
				return durationStep != DURATION_STEP_EDEFAULT;
			case SpicePackage.SIMULATION__COMPONENTS:
				return components != null && !components.isEmpty();
			case SpicePackage.SIMULATION__VIEWS:
				return views != null && !views.isEmpty();
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
			case SpicePackage.SIMULATION___RUN:
				run();
				return null;
			case SpicePackage.SIMULATION___INIT:
				init();
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
		result.append(" (startTime: ");
		result.append(startTime);
		result.append(", endTime: ");
		result.append(endTime);
		result.append(", durationStep: ");
		result.append(durationStep);
		result.append(')');
		return result.toString();
	}

} //SimulationImpl
