/**
 */
package Spice.impl;

import Spice.ArrayAttribute;
import Spice.Attribute;
import Spice.BasicAttribute;
import Spice.Component;
import Spice.NamedElement;
import Spice.Simulation;
import Spice.SpiceFactory;
import Spice.SpicePackage;
import Spice.View;
import Spice.Xmod_Action;
import Spice.Xmod_Element;
import Spice.Xmod_Exception;
import Spice.Xmod_ExceptionKind;
import Spice.Xmod_ExceptionReaction;
import Spice.Xmod_Operation;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SpicePackageImpl extends EPackageImpl implements SpicePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass simulationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass viewEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass basicAttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arrayAttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xmod_ExceptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xmod_ActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xmod_OperationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xmod_ElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum xmod_ExceptionReactionEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum xmod_ExceptionKindEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see Spice.SpicePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SpicePackageImpl() {
		super(eNS_URI, SpiceFactory.eINSTANCE);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link SpicePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SpicePackage init() {
		if (isInited) return (SpicePackage)EPackage.Registry.INSTANCE.getEPackage(SpicePackage.eNS_URI);

		// Obtain or create and register package
		Object registeredSpicePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		SpicePackageImpl theSpicePackage = registeredSpicePackage instanceof SpicePackageImpl ? (SpicePackageImpl)registeredSpicePackage : new SpicePackageImpl();

		isInited = true;

		// Create package meta-data objects
		theSpicePackage.createPackageContents();

		// Initialize created meta-data
		theSpicePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSpicePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SpicePackage.eNS_URI, theSpicePackage);
		return theSpicePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSimulation() {
		return simulationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSimulation_StartTime() {
		return (EAttribute)simulationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSimulation_EndTime() {
		return (EAttribute)simulationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSimulation_DurationStep() {
		return (EAttribute)simulationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSimulation_Components() {
		return (EReference)simulationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSimulation_Views() {
		return (EReference)simulationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimulation__Run() {
		return simulationEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimulation__Init() {
		return simulationEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getComponent() {
		return componentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getComponent_Period() {
		return (EAttribute)componentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getComponent_Priority() {
		return (EAttribute)componentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getComponent_IsDataFlow() {
		return (EAttribute)componentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComponent_Attributes() {
		return (EReference)componentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComponent_Actions() {
		return (EReference)componentEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getComponent__DoStep() {
		return componentEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getComponent__Update() {
		return componentEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getView() {
		return viewEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getView_Host() {
		return (EAttribute)viewEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getView_Port() {
		return (EAttribute)viewEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getView_Period() {
		return (EAttribute)viewEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getView_ObservedTags() {
		return (EAttribute)viewEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getView__Start() {
		return viewEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getView__Update() {
		return viewEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAttribute() {
		return attributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAttribute_IsObservable() {
		return (EAttribute)attributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAttribute_Type() {
		return (EAttribute)attributeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAttribute_Multiplicity() {
		return (EAttribute)attributeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNamedElement() {
		return namedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNamedElement_Name() {
		return (EAttribute)namedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBasicAttribute() {
		return basicAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBasicAttribute_Value() {
		return (EAttribute)basicAttributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBasicAttribute_NewValue() {
		return (EAttribute)basicAttributeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getArrayAttribute() {
		return arrayAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getArrayAttribute_Value() {
		return (EAttribute)arrayAttributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getArrayAttribute_NewValue() {
		return (EAttribute)arrayAttributeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getXmod_Exception() {
		return xmod_ExceptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getXmod_Exception_Kind() {
		return (EAttribute)xmod_ExceptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getXmod_Exception_Filter() {
		return (EAttribute)xmod_ExceptionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getXmod_Exception_Reaction() {
		return (EAttribute)xmod_ExceptionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getXmod_Exception_CalledOperation() {
		return (EReference)xmod_ExceptionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getXmod_Action() {
		return xmod_ActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getXmod_Action_Name() {
		return (EAttribute)xmod_ActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getXmod_Action_Operations() {
		return (EReference)xmod_ActionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getXmod_Action__Execute() {
		return xmod_ActionEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getXmod_Operation() {
		return xmod_OperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getXmod_Operation_Name() {
		return (EAttribute)xmod_OperationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getXmod_Operation_ObjectTag() {
		return (EAttribute)xmod_OperationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getXmod_Operation_ParametersTag() {
		return (EAttribute)xmod_OperationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getXmod_Operation_ReturnTag() {
		return (EAttribute)xmod_OperationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getXmod_Operation_Exceptions() {
		return (EReference)xmod_OperationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getXmod_Operation__CallOperation() {
		return xmod_OperationEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getXmod_Element() {
		return xmod_ElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getXmod_Element_Xmod_id() {
		return (EAttribute)xmod_ElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getXmod_ExceptionReaction() {
		return xmod_ExceptionReactionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getXmod_ExceptionKind() {
		return xmod_ExceptionKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SpiceFactory getSpiceFactory() {
		return (SpiceFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		simulationEClass = createEClass(SIMULATION);
		createEAttribute(simulationEClass, SIMULATION__START_TIME);
		createEAttribute(simulationEClass, SIMULATION__END_TIME);
		createEAttribute(simulationEClass, SIMULATION__DURATION_STEP);
		createEReference(simulationEClass, SIMULATION__COMPONENTS);
		createEReference(simulationEClass, SIMULATION__VIEWS);
		createEOperation(simulationEClass, SIMULATION___RUN);
		createEOperation(simulationEClass, SIMULATION___INIT);

		componentEClass = createEClass(COMPONENT);
		createEAttribute(componentEClass, COMPONENT__PERIOD);
		createEAttribute(componentEClass, COMPONENT__PRIORITY);
		createEAttribute(componentEClass, COMPONENT__IS_DATA_FLOW);
		createEReference(componentEClass, COMPONENT__ATTRIBUTES);
		createEReference(componentEClass, COMPONENT__ACTIONS);
		createEOperation(componentEClass, COMPONENT___DO_STEP);
		createEOperation(componentEClass, COMPONENT___UPDATE);

		viewEClass = createEClass(VIEW);
		createEAttribute(viewEClass, VIEW__HOST);
		createEAttribute(viewEClass, VIEW__PORT);
		createEAttribute(viewEClass, VIEW__PERIOD);
		createEAttribute(viewEClass, VIEW__OBSERVED_TAGS);
		createEOperation(viewEClass, VIEW___START);
		createEOperation(viewEClass, VIEW___UPDATE);

		attributeEClass = createEClass(ATTRIBUTE);
		createEAttribute(attributeEClass, ATTRIBUTE__IS_OBSERVABLE);
		createEAttribute(attributeEClass, ATTRIBUTE__TYPE);
		createEAttribute(attributeEClass, ATTRIBUTE__MULTIPLICITY);

		namedElementEClass = createEClass(NAMED_ELEMENT);
		createEAttribute(namedElementEClass, NAMED_ELEMENT__NAME);

		basicAttributeEClass = createEClass(BASIC_ATTRIBUTE);
		createEAttribute(basicAttributeEClass, BASIC_ATTRIBUTE__VALUE);
		createEAttribute(basicAttributeEClass, BASIC_ATTRIBUTE__NEW_VALUE);

		arrayAttributeEClass = createEClass(ARRAY_ATTRIBUTE);
		createEAttribute(arrayAttributeEClass, ARRAY_ATTRIBUTE__VALUE);
		createEAttribute(arrayAttributeEClass, ARRAY_ATTRIBUTE__NEW_VALUE);

		xmod_ExceptionEClass = createEClass(XMOD_EXCEPTION);
		createEAttribute(xmod_ExceptionEClass, XMOD_EXCEPTION__KIND);
		createEAttribute(xmod_ExceptionEClass, XMOD_EXCEPTION__FILTER);
		createEAttribute(xmod_ExceptionEClass, XMOD_EXCEPTION__REACTION);
		createEReference(xmod_ExceptionEClass, XMOD_EXCEPTION__CALLED_OPERATION);

		xmod_ActionEClass = createEClass(XMOD_ACTION);
		createEAttribute(xmod_ActionEClass, XMOD_ACTION__NAME);
		createEReference(xmod_ActionEClass, XMOD_ACTION__OPERATIONS);
		createEOperation(xmod_ActionEClass, XMOD_ACTION___EXECUTE);

		xmod_OperationEClass = createEClass(XMOD_OPERATION);
		createEAttribute(xmod_OperationEClass, XMOD_OPERATION__NAME);
		createEAttribute(xmod_OperationEClass, XMOD_OPERATION__OBJECT_TAG);
		createEAttribute(xmod_OperationEClass, XMOD_OPERATION__PARAMETERS_TAG);
		createEAttribute(xmod_OperationEClass, XMOD_OPERATION__RETURN_TAG);
		createEReference(xmod_OperationEClass, XMOD_OPERATION__EXCEPTIONS);
		createEOperation(xmod_OperationEClass, XMOD_OPERATION___CALL_OPERATION);

		xmod_ElementEClass = createEClass(XMOD_ELEMENT);
		createEAttribute(xmod_ElementEClass, XMOD_ELEMENT__XMOD_ID);

		// Create enums
		xmod_ExceptionReactionEEnum = createEEnum(XMOD_EXCEPTION_REACTION);
		xmod_ExceptionKindEEnum = createEEnum(XMOD_EXCEPTION_KIND);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		simulationEClass.getESuperTypes().add(this.getXmod_Element());
		componentEClass.getESuperTypes().add(this.getXmod_Element());
		viewEClass.getESuperTypes().add(this.getXmod_Element());
		attributeEClass.getESuperTypes().add(this.getNamedElement());
		basicAttributeEClass.getESuperTypes().add(this.getAttribute());
		arrayAttributeEClass.getESuperTypes().add(this.getAttribute());

		// Initialize classes, features, and operations; add parameters
		initEClass(simulationEClass, Simulation.class, "Simulation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSimulation_StartTime(), ecorePackage.getELong(), "startTime", null, 1, 1, Simulation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSimulation_EndTime(), ecorePackage.getELong(), "endTime", null, 1, 1, Simulation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSimulation_DurationStep(), ecorePackage.getELong(), "durationStep", null, 1, 1, Simulation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSimulation_Components(), this.getComponent(), null, "components", null, 0, -1, Simulation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSimulation_Views(), this.getView(), null, "views", null, 0, -1, Simulation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getSimulation__Run(), null, "run", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getSimulation__Init(), null, "init", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(componentEClass, Component.class, "Component", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getComponent_Period(), ecorePackage.getELong(), "period", null, 1, 1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComponent_Priority(), ecorePackage.getELong(), "priority", null, 1, 1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComponent_IsDataFlow(), ecorePackage.getEBoolean(), "isDataFlow", "false", 1, 1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponent_Attributes(), this.getAttribute(), null, "attributes", null, 0, -1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponent_Actions(), this.getXmod_Action(), null, "actions", null, 0, -1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getComponent__DoStep(), this.getXmod_ExceptionReaction(), "doStep", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getComponent__Update(), null, "update", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(viewEClass, View.class, "View", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getView_Host(), ecorePackage.getEString(), "host", "localhost", 0, 1, View.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getView_Port(), ecorePackage.getEInt(), "port", "8080", 0, 1, View.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getView_Period(), ecorePackage.getELong(), "period", "1000", 0, 1, View.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getView_ObservedTags(), ecorePackage.getEString(), "observedTags", null, 0, -1, View.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getView__Start(), null, "start", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getView__Update(), null, "update", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(attributeEClass, Attribute.class, "Attribute", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAttribute_IsObservable(), ecorePackage.getEBoolean(), "isObservable", "false", 1, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttribute_Type(), ecorePackage.getEString(), "type", null, 1, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttribute_Multiplicity(), ecorePackage.getELong(), "multiplicity", "1", 1, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(namedElementEClass, NamedElement.class, "NamedElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNamedElement_Name(), ecorePackage.getEString(), "name", null, 1, 1, NamedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(basicAttributeEClass, BasicAttribute.class, "BasicAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBasicAttribute_Value(), ecorePackage.getEJavaObject(), "value", null, 0, 1, BasicAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBasicAttribute_NewValue(), ecorePackage.getEJavaObject(), "newValue", null, 0, 1, BasicAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(arrayAttributeEClass, ArrayAttribute.class, "ArrayAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getArrayAttribute_Value(), ecorePackage.getEJavaObject(), "value", null, 0, -1, ArrayAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getArrayAttribute_NewValue(), ecorePackage.getEJavaObject(), "newValue", null, 0, -1, ArrayAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(xmod_ExceptionEClass, Xmod_Exception.class, "Xmod_Exception", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getXmod_Exception_Kind(), this.getXmod_ExceptionKind(), "kind", null, 1, 1, Xmod_Exception.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getXmod_Exception_Filter(), ecorePackage.getEString(), "filter", null, 0, 1, Xmod_Exception.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getXmod_Exception_Reaction(), this.getXmod_ExceptionReaction(), "reaction", null, 1, 1, Xmod_Exception.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getXmod_Exception_CalledOperation(), this.getXmod_Operation(), null, "calledOperation", null, 0, 1, Xmod_Exception.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(xmod_ActionEClass, Xmod_Action.class, "Xmod_Action", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getXmod_Action_Name(), ecorePackage.getEString(), "name", null, 1, 1, Xmod_Action.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getXmod_Action_Operations(), this.getXmod_Operation(), null, "operations", null, 1, -1, Xmod_Action.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getXmod_Action__Execute(), this.getXmod_ExceptionReaction(), "execute", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(xmod_OperationEClass, Xmod_Operation.class, "Xmod_Operation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getXmod_Operation_Name(), ecorePackage.getEString(), "name", null, 1, 1, Xmod_Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getXmod_Operation_ObjectTag(), ecorePackage.getEString(), "objectTag", null, 1, 1, Xmod_Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getXmod_Operation_ParametersTag(), ecorePackage.getEString(), "parametersTag", null, 0, -1, Xmod_Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getXmod_Operation_ReturnTag(), ecorePackage.getEString(), "returnTag", null, 0, 1, Xmod_Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getXmod_Operation_Exceptions(), this.getXmod_Exception(), null, "exceptions", null, 0, -1, Xmod_Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getXmod_Operation__CallOperation(), this.getXmod_Exception(), "callOperation", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(xmod_ElementEClass, Xmod_Element.class, "Xmod_Element", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getXmod_Element_Xmod_id(), ecorePackage.getEString(), "xmod_id", null, 0, 1, Xmod_Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(xmod_ExceptionReactionEEnum, Xmod_ExceptionReaction.class, "Xmod_ExceptionReaction");
		addEEnumLiteral(xmod_ExceptionReactionEEnum, Xmod_ExceptionReaction.CONTINUE);
		addEEnumLiteral(xmod_ExceptionReactionEEnum, Xmod_ExceptionReaction.SKIP);
		addEEnumLiteral(xmod_ExceptionReactionEEnum, Xmod_ExceptionReaction.LOCALSTOP);
		addEEnumLiteral(xmod_ExceptionReactionEEnum, Xmod_ExceptionReaction.EXIT);

		initEEnum(xmod_ExceptionKindEEnum, Xmod_ExceptionKind.class, "Xmod_ExceptionKind");
		addEEnumLiteral(xmod_ExceptionKindEEnum, Xmod_ExceptionKind.OK);
		addEEnumLiteral(xmod_ExceptionKindEEnum, Xmod_ExceptionKind.UNKNOWN_NAMESPACE);
		addEEnumLiteral(xmod_ExceptionKindEEnum, Xmod_ExceptionKind.OBJECT_NOT_FOUND);
		addEEnumLiteral(xmod_ExceptionKindEEnum, Xmod_ExceptionKind.METHOD_NOT_FOUND);
		addEEnumLiteral(xmod_ExceptionKindEEnum, Xmod_ExceptionKind.PARAMETERS_NOT_MATCHING);
		addEEnumLiteral(xmod_ExceptionKindEEnum, Xmod_ExceptionKind.RETURN_TYPE_NOT_MATCHING);
		addEEnumLiteral(xmod_ExceptionKindEEnum, Xmod_ExceptionKind.METHOD_EXCEPTION);
		addEEnumLiteral(xmod_ExceptionKindEEnum, Xmod_ExceptionKind.OTHER);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// Xmod_elem
		createXmod_elemAnnotations();
		// Xmod_main
		createXmod_mainAnnotations();
		// Xmod_exec
		createXmod_execAnnotations();
	}

	/**
	 * Initializes the annotations for <b>Xmod_elem</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createXmod_elemAnnotations() {
		String source = "Xmod_elem";
		addAnnotation
		  (simulationEClass,
		   source,
		   new String[] {
		   });
		addAnnotation
		  (componentEClass,
		   source,
		   new String[] {
		   });
		addAnnotation
		  (viewEClass,
		   source,
		   new String[] {
		   });
	}

	/**
	 * Initializes the annotations for <b>Xmod_main</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createXmod_mainAnnotations() {
		String source = "Xmod_main";
		addAnnotation
		  (simulationEClass,
		   source,
		   new String[] {
		   });
	}

	/**
	 * Initializes the annotations for <b>Xmod_exec</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createXmod_execAnnotations() {
		String source = "Xmod_exec";
		addAnnotation
		  (componentEClass,
		   source,
		   new String[] {
		   });
	}

} //SpicePackageImpl
