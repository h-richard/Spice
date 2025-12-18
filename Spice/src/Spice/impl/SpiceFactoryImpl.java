/**
 */
package Spice.impl;

import Spice.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

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
			case SpicePackage.COMPONENT: return createComponent();
			case SpicePackage.VIEW: return createView();
			case SpicePackage.BASIC_ATTRIBUTE: return createBasicAttribute();
			case SpicePackage.ARRAY_ATTRIBUTE: return createArrayAttribute();
			case SpicePackage.XMOD_EXCEPTION: return createXmod_Exception();
			case SpicePackage.XMOD_ACTION: return createXmod_Action();
			case SpicePackage.XMOD_OPERATION: return createXmod_Operation();
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
				return createXmod_ExceptionReactionFromString(eDataType, initialValue);
			case SpicePackage.XMOD_EXCEPTION_KIND:
				return createXmod_ExceptionKindFromString(eDataType, initialValue);
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
				return convertXmod_ExceptionReactionToString(eDataType, instanceValue);
			case SpicePackage.XMOD_EXCEPTION_KIND:
				return convertXmod_ExceptionKindToString(eDataType, instanceValue);
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
	public Component createComponent() {
		ComponentImpl component = new ComponentImpl();
		return component;
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
	public BasicAttribute createBasicAttribute() {
		BasicAttributeImpl basicAttribute = new BasicAttributeImpl();
		return basicAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ArrayAttribute createArrayAttribute() {
		ArrayAttributeImpl arrayAttribute = new ArrayAttributeImpl();
		return arrayAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Xmod_Exception createXmod_Exception() {
		Xmod_ExceptionImpl xmod_Exception = new Xmod_ExceptionImpl();
		return xmod_Exception;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Xmod_Action createXmod_Action() {
		Xmod_ActionImpl xmod_Action = new Xmod_ActionImpl();
		return xmod_Action;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Xmod_Operation createXmod_Operation() {
		Xmod_OperationImpl xmod_Operation = new Xmod_OperationImpl();
		return xmod_Operation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Xmod_ExceptionReaction createXmod_ExceptionReactionFromString(EDataType eDataType, String initialValue) {
		Xmod_ExceptionReaction result = Xmod_ExceptionReaction.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertXmod_ExceptionReactionToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Xmod_ExceptionKind createXmod_ExceptionKindFromString(EDataType eDataType, String initialValue) {
		Xmod_ExceptionKind result = Xmod_ExceptionKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertXmod_ExceptionKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
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
