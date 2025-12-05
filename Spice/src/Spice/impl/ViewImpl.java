/**
 */
package Spice.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import observers.Facade;
import observers.Linker;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import Spice.Adapter;
import Spice.SpicePackage;
import Spice.ServiceComponent;
import Spice.View;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>View</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Spice.impl.ViewImpl#isRemoteDriven <em>Remote Driven</em>}</li>
 *   <li>{@link Spice.impl.ViewImpl#getHost <em>Host</em>}</li>
 *   <li>{@link Spice.impl.ViewImpl#getPort <em>Port</em>}</li>
 *   <li>{@link Spice.impl.ViewImpl#getPeriod <em>Period</em>}</li>
 *   <li>{@link Spice.impl.ViewImpl#getServices <em>Services</em>}</li>
 *   <li>{@link Spice.impl.ViewImpl#getAdapters <em>Adapters</em>}</li>
 *   <li>{@link Spice.impl.ViewImpl#getObservedTags <em>Observed Tags</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ViewImpl extends XMod_ElementImpl implements View {
	/**
	 * The default value of the '{@link #isRemoteDriven() <em>Remote Driven</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRemoteDriven()
	 * @generated
	 * @ordered
	 */
	protected static final boolean REMOTE_DRIVEN_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isRemoteDriven() <em>Remote Driven</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRemoteDriven()
	 * @generated
	 * @ordered
	 */
	protected boolean remoteDriven = REMOTE_DRIVEN_EDEFAULT;

	/**
	 * The default value of the '{@link #getHost() <em>Host</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHost()
	 * @generated
	 * @ordered
	 */
	protected static final String HOST_EDEFAULT = "localhost";

	/**
	 * The cached value of the '{@link #getHost() <em>Host</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHost()
	 * @generated
	 * @ordered
	 */
	protected String host = HOST_EDEFAULT;

	/**
	 * The default value of the '{@link #getPort() <em>Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPort()
	 * @generated
	 * @ordered
	 */
	protected static final int PORT_EDEFAULT = 8080;

	/**
	 * The cached value of the '{@link #getPort() <em>Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPort()
	 * @generated
	 * @ordered
	 */
	protected int port = PORT_EDEFAULT;

	/**
	 * The default value of the '{@link #getPeriod() <em>Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeriod()
	 * @generated
	 * @ordered
	 */
	protected static final long PERIOD_EDEFAULT = 1000L;

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
	 * The cached value of the '{@link #getServices() <em>Services</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServices()
	 * @generated
	 * @ordered
	 */
	protected EList<ServiceComponent> services;

	/**
	 * The cached value of the '{@link #getAdapters() <em>Adapters</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdapters()
	 * @generated
	 * @ordered
	 */
	protected EList<Adapter> adapters;

	/**
	 * The cached value of the '{@link #getObservedTags() <em>Observed Tags</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObservedTags()
	 * @generated
	 * @ordered
	 */
	protected EList<String> observedTags;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ViewImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SpicePackage.Literals.VIEW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isRemoteDriven() {
		return remoteDriven;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRemoteDriven(boolean newRemoteDriven) {
		boolean oldRemoteDriven = remoteDriven;
		remoteDriven = newRemoteDriven;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpicePackage.VIEW__REMOTE_DRIVEN, oldRemoteDriven, remoteDriven));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getHost() {
		return host;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHost(String newHost) {
		String oldHost = host;
		host = newHost;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpicePackage.VIEW__HOST, oldHost, host));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getPort() {
		return port;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPort(int newPort) {
		int oldPort = port;
		port = newPort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpicePackage.VIEW__PORT, oldPort, port));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SpicePackage.VIEW__PERIOD, oldPeriod, period));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ServiceComponent> getServices() {
		if (services == null) {
			services = new EObjectResolvingEList<ServiceComponent>(ServiceComponent.class, this, SpicePackage.VIEW__SERVICES);
		}
		return services;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Adapter> getAdapters() {
		if (adapters == null) {
			adapters = new EObjectResolvingEList<Adapter>(Adapter.class, this, SpicePackage.VIEW__ADAPTERS);
		}
		return adapters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getObservedTags() {
		if (observedTags == null) {
			observedTags = new EDataTypeUniqueEList<String>(String.class, this, SpicePackage.VIEW__OBSERVED_TAGS);
		}
		return observedTags;
	}
	
	private int currentIndex;
	private int currentStep;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void start() {
		Facade fi = Facade.getInstance();
		fi.register(this);
		currentIndex = 1;
		update();
		
		Linker linker = new Linker(getXmod_id(), host, port);
		if (!linker.isConnected()) return;
		
		List<String> names = new ArrayList<>();
		List<EList<Double>> positions = new ArrayList<>();
		
		for (String tag : observedTags) {
			names.add(tag.split("\\.")[0]);
			positions.add((EList<Double>) fi.get(currentIndex, tag));
		}
		
		String init = unityMessage("init", names, positions);
		
		linker.send(init);
		
		while (true) {
			if (currentIndex <= currentStep) {
				positions.clear();
				for (String ot : observedTags) 
					positions.add((BasicEList<Double>) fi.get(currentIndex, ot));
				String message = unityMessage("update", names, positions);
				linker.send(message);
				currentIndex++;
			}
			try { Thread.sleep(period); } 
			catch (InterruptedException e) { e.printStackTrace(); }
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void update() {
		currentStep = Facade.getInstance().getCurrentStep();
	}
	
	private String toJson(EList<?> elist) {
		StringBuilder str = new StringBuilder();
		str.append('[');
		for (Object o : elist) str.append(o.toString()).append(',');
		str.setCharAt(str.length()-1, ']');
		return str.toString();
		
	}
	
	private String unityMessage(String type, List<String> names, List<EList<Double>> positions) {
        StringBuilder json = new StringBuilder();
        json.append("{").append("\"type\":\"").append(type).append("\"").append(',').append("\"content\":").append('[');
        for (int i = 0; i < names.size(); i++)
            json.append('{').append("\"name\":").append("\""+names.get(i)+"\"").append(',').append("\"position\":").append(toJson(positions.get(i))).append('}').append(',');
        json.setCharAt(json.length()-1, ']');
        json.append('}');
        return json.toString();
    }
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SpicePackage.VIEW__REMOTE_DRIVEN:
				return isRemoteDriven();
			case SpicePackage.VIEW__HOST:
				return getHost();
			case SpicePackage.VIEW__PORT:
				return getPort();
			case SpicePackage.VIEW__PERIOD:
				return getPeriod();
			case SpicePackage.VIEW__SERVICES:
				return getServices();
			case SpicePackage.VIEW__ADAPTERS:
				return getAdapters();
			case SpicePackage.VIEW__OBSERVED_TAGS:
				return getObservedTags();
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
			case SpicePackage.VIEW__REMOTE_DRIVEN:
				setRemoteDriven((Boolean)newValue);
				return;
			case SpicePackage.VIEW__HOST:
				setHost((String)newValue);
				return;
			case SpicePackage.VIEW__PORT:
				setPort((Integer)newValue);
				return;
			case SpicePackage.VIEW__PERIOD:
				setPeriod((Long)newValue);
				return;
			case SpicePackage.VIEW__SERVICES:
				getServices().clear();
				getServices().addAll((Collection<? extends ServiceComponent>)newValue);
				return;
			case SpicePackage.VIEW__ADAPTERS:
				getAdapters().clear();
				getAdapters().addAll((Collection<? extends Adapter>)newValue);
				return;
			case SpicePackage.VIEW__OBSERVED_TAGS:
				getObservedTags().clear();
				getObservedTags().addAll((Collection<? extends String>)newValue);
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
			case SpicePackage.VIEW__REMOTE_DRIVEN:
				setRemoteDriven(REMOTE_DRIVEN_EDEFAULT);
				return;
			case SpicePackage.VIEW__HOST:
				setHost(HOST_EDEFAULT);
				return;
			case SpicePackage.VIEW__PORT:
				setPort(PORT_EDEFAULT);
				return;
			case SpicePackage.VIEW__PERIOD:
				setPeriod(PERIOD_EDEFAULT);
				return;
			case SpicePackage.VIEW__SERVICES:
				getServices().clear();
				return;
			case SpicePackage.VIEW__ADAPTERS:
				getAdapters().clear();
				return;
			case SpicePackage.VIEW__OBSERVED_TAGS:
				getObservedTags().clear();
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
			case SpicePackage.VIEW__REMOTE_DRIVEN:
				return remoteDriven != REMOTE_DRIVEN_EDEFAULT;
			case SpicePackage.VIEW__HOST:
				return HOST_EDEFAULT == null ? host != null : !HOST_EDEFAULT.equals(host);
			case SpicePackage.VIEW__PORT:
				return port != PORT_EDEFAULT;
			case SpicePackage.VIEW__PERIOD:
				return period != PERIOD_EDEFAULT;
			case SpicePackage.VIEW__SERVICES:
				return services != null && !services.isEmpty();
			case SpicePackage.VIEW__ADAPTERS:
				return adapters != null && !adapters.isEmpty();
			case SpicePackage.VIEW__OBSERVED_TAGS:
				return observedTags != null && !observedTags.isEmpty();
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
			case SpicePackage.VIEW___START:
				start();
				return null;
			case SpicePackage.VIEW___UPDATE:
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
		result.append(" (remoteDriven: ");
		result.append(remoteDriven);
		result.append(", host: ");
		result.append(host);
		result.append(", port: ");
		result.append(port);
		result.append(", period: ");
		result.append(period);
		result.append(", observedTags: ");
		result.append(observedTags);
		result.append(')');
		return result.toString();
	}

} //ViewImpl
