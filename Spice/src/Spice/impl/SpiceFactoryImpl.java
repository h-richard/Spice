/**
 */
package Spice.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import Spice.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SpiceFactoryImpl extends EFactoryImpl implements SpiceFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SpiceFactory init() {
		try {
			SpiceFactory theSpiceFactory = (SpiceFactory)EPackage.Registry.INSTANCE.getEFactory(SpicePackage.eNS_URI);
			if (theSpiceFactory != null) {
				return theSpiceFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SpiceFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpiceFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case SpicePackage.SIMULATION: return createSimulation();
			case SpicePackage.EXECUTABLE_COMPONENT: return createExecutableComponent();
			case SpicePackage.SERVICE_COMPONENT: return createServiceComponent();
			case SpicePackage.VIEW: return createView();
			case SpicePackage.ADAPTER: return createAdapter();
			case SpicePackage.STATIC_ATTRIBUTE: return createStaticAttribute();
			case SpicePackage.DYNAMIC_ATTRIBUTE: return createDynamicAttribute();
			case SpicePackage.BOOLEAN_DATA: return createBooleanData();
			case SpicePackage.DOUBLE_DATA: return createDoubleData();
			case SpicePackage.XMOD_ACTION: return createXMod_Action();
			case SpicePackage.XMOD_OPERATION: return createXMod_Operation();
			case SpicePackage.XMOD_EXCEPTION: return createXMod_Exception();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case SpicePackage.XMOD_EXCEPTION_REACTION:
				return createXMod_ExceptionReactionFromString(eDataType, initialValue);
			case SpicePackage.XMOD_EXCEPTION_LITERAL:
				return createXMod_ExceptionLiteralFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case SpicePackage.XMOD_EXCEPTION_REACTION:
				return convertXMod_ExceptionReactionToString(eDataType, instanceValue);
			case SpicePackage.XMOD_EXCEPTION_LITERAL:
				return convertXMod_ExceptionLiteralToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Simulation createSimulation() {
		SimulationImpl simulation = new SimulationImpl();
		return simulation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExecutableComponent createExecutableComponent() {
		ExecutableComponentImpl executableComponent = new ExecutableComponentImpl();
		return executableComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ServiceComponent createServiceComponent() {
		ServiceComponentImpl serviceComponent = new ServiceComponentImpl();
		return serviceComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public View createView() {
		ViewImpl view = new ViewImpl();
		return view;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAdapter() {
		AdapterImpl adapter = new AdapterImpl();
		return adapter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XMod_Operation createXMod_Operation() {
		XMod_OperationImpl xMod_Operation = new XMod_OperationImpl();
		return xMod_Operation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XMod_Exception createXMod_Exception() {
		XMod_ExceptionImpl xMod_Exception = new XMod_ExceptionImpl();
		return xMod_Exception;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMod_ExceptionReaction createXMod_ExceptionReactionFromString(EDataType eDataType, String initialValue) {
		XMod_ExceptionReaction result = XMod_ExceptionReaction.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertXMod_ExceptionReactionToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMod_ExceptionLiteral createXMod_ExceptionLiteralFromString(EDataType eDataType, String initialValue) {
		XMod_ExceptionLiteral result = XMod_ExceptionLiteral.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertXMod_ExceptionLiteralToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StaticAttribute createStaticAttribute() {
		StaticAttributeImpl staticAttribute = new StaticAttributeImpl();
		return staticAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DynamicAttribute createDynamicAttribute() {
		DynamicAttributeImpl dynamicAttribute = new DynamicAttributeImpl();
		return dynamicAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BooleanData createBooleanData() {
		BooleanDataImpl booleanData = new BooleanDataImpl();
		return booleanData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleData createDoubleData() {
		DoubleDataImpl doubleData = new DoubleDataImpl();
		return doubleData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XMod_Action createXMod_Action() {
		XMod_ActionImpl xMod_Action = new XMod_ActionImpl();
		return xMod_Action;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SpicePackage getSpicePackage() {
		return (SpicePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SpicePackage getPackage() {
		return SpicePackage.eINSTANCE;
	}

} //SpiceFactoryImpl
