/**
 */
package Spice.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import Spice.Adapter;
import Spice.Attribute;
import Spice.BooleanData;
import Spice.Component;
import Spice.Data;
import Spice.DoubleData;
import Spice.DynamicAttribute;
import Spice.ExecutableComponent;
import Spice.NamedElement;
import Spice.SpiceFactory;
import Spice.SpicePackage;
import Spice.ServiceComponent;
import Spice.Simulation;
import Spice.StaticAttribute;
import Spice.View;
import Spice.XMod_Action;
import Spice.XMod_Element;
import Spice.XMod_Exception;
import Spice.XMod_ExceptionLiteral;
import Spice.XMod_ExceptionReaction;
import Spice.XMod_Operation;

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
	private EClass executableComponentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceComponentEClass = null;

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
	private EClass adapterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xMod_ActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xMod_OperationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xMod_ElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xMod_ExceptionEClass = null;

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
	private EEnum xMod_ExceptionReactionEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum xMod_ExceptionLiteralEEnum = null;

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
	private EClass staticAttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dynamicAttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass booleanDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass doubleDataEClass = null;

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
	public EReference getSimulation_Adapters() {
		return (EReference)simulationEClass.getEStructuralFeatures().get(5);
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
	public EReference getComponent_Attributes() {
		return (EReference)componentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComponent_Actions() {
		return (EReference)componentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getComponent__Init() {
		return componentEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getExecutableComponent() {
		return executableComponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getExecutableComponent_Period() {
		return (EAttribute)executableComponentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getExecutableComponent_Priority() {
		return (EAttribute)executableComponentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getExecutableComponent_Services() {
		return (EReference)executableComponentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getExecutableComponent_IsDataFlow() {
		return (EAttribute)executableComponentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getExecutableComponent__DoStep() {
		return executableComponentEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getExecutableComponent__Update() {
		return executableComponentEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getServiceComponent() {
		return serviceComponentEClass;
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
	public EAttribute getView_RemoteDriven() {
		return (EAttribute)viewEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getView_Host() {
		return (EAttribute)viewEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getView_Port() {
		return (EAttribute)viewEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getView_Period() {
		return (EAttribute)viewEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getView_Services() {
		return (EReference)viewEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getView_Adapters() {
		return (EReference)viewEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getView_ObservedTags() {
		return (EAttribute)viewEClass.getEStructuralFeatures().get(6);
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
	public EClass getAdapter() {
		return adapterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAdapter_IsAdaptable() {
		return (EAttribute)adapterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAdapter_Data() {
		return (EReference)adapterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAdapter_Attributes() {
		return (EReference)adapterEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAdapter_Action() {
		return (EReference)adapterEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAdapter__Adapt() {
		return adapterEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getXMod_Action() {
		return xMod_ActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getXMod_Action_Operations() {
		return (EReference)xMod_ActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getXMod_Action__Execute() {
		return xMod_ActionEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getXMod_Operation() {
		return xMod_OperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getXMod_Operation_Name() {
		return (EAttribute)xMod_OperationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getXMod_Operation_ObjectTag() {
		return (EAttribute)xMod_OperationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getXMod_Operation_ParametersTag() {
		return (EAttribute)xMod_OperationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getXMod_Operation_ReturnTag() {
		return (EAttribute)xMod_OperationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getXMod_Operation_Exceptions() {
		return (EReference)xMod_OperationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getXMod_Operation__CallOperation() {
		return xMod_OperationEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getXMod_Element() {
		return xMod_ElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getXMod_Element_Xmod_id() {
		return (EAttribute)xMod_ElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getXMod_Exception() {
		return xMod_ExceptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getXMod_Exception_Literal() {
		return (EAttribute)xMod_ExceptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getXMod_Exception_Filter() {
		return (EAttribute)xMod_ExceptionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getXMod_Exception_Reaction() {
		return (EAttribute)xMod_ExceptionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getXMod_Exception_CalledOperation() {
		return (EReference)xMod_ExceptionEClass.getEStructuralFeatures().get(3);
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
	public EEnum getXMod_ExceptionReaction() {
		return xMod_ExceptionReactionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getXMod_ExceptionLiteral() {
		return xMod_ExceptionLiteralEEnum;
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
	public EAttribute getAttribute_Multiplicity() {
		return (EAttribute)attributeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAttribute_IsOutput() {
		return (EAttribute)attributeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAttribute_Type() {
		return (EAttribute)attributeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAttribute_Data() {
		return (EReference)attributeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStaticAttribute() {
		return staticAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDynamicAttribute() {
		return dynamicAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDynamicAttribute_Initial() {
		return (EReference)dynamicAttributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDynamicAttribute_NewData() {
		return (EReference)dynamicAttributeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getData() {
		return dataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getData__GetDataValue() {
		return dataEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getData__SetDataValue__EList() {
		return dataEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBooleanData() {
		return booleanDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBooleanData_Value() {
		return (EAttribute)booleanDataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDoubleData() {
		return doubleDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDoubleData_Value() {
		return (EAttribute)doubleDataEClass.getEStructuralFeatures().get(0);
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
		createEReference(simulationEClass, SIMULATION__ADAPTERS);
		createEOperation(simulationEClass, SIMULATION___RUN);
		createEOperation(simulationEClass, SIMULATION___INIT);

		componentEClass = createEClass(COMPONENT);
		createEReference(componentEClass, COMPONENT__ATTRIBUTES);
		createEReference(componentEClass, COMPONENT__ACTIONS);
		createEOperation(componentEClass, COMPONENT___INIT);

		executableComponentEClass = createEClass(EXECUTABLE_COMPONENT);
		createEAttribute(executableComponentEClass, EXECUTABLE_COMPONENT__PERIOD);
		createEAttribute(executableComponentEClass, EXECUTABLE_COMPONENT__PRIORITY);
		createEReference(executableComponentEClass, EXECUTABLE_COMPONENT__SERVICES);
		createEAttribute(executableComponentEClass, EXECUTABLE_COMPONENT__IS_DATA_FLOW);
		createEOperation(executableComponentEClass, EXECUTABLE_COMPONENT___DO_STEP);
		createEOperation(executableComponentEClass, EXECUTABLE_COMPONENT___UPDATE);

		serviceComponentEClass = createEClass(SERVICE_COMPONENT);

		viewEClass = createEClass(VIEW);
		createEAttribute(viewEClass, VIEW__REMOTE_DRIVEN);
		createEAttribute(viewEClass, VIEW__HOST);
		createEAttribute(viewEClass, VIEW__PORT);
		createEAttribute(viewEClass, VIEW__PERIOD);
		createEReference(viewEClass, VIEW__SERVICES);
		createEReference(viewEClass, VIEW__ADAPTERS);
		createEAttribute(viewEClass, VIEW__OBSERVED_TAGS);
		createEOperation(viewEClass, VIEW___START);
		createEOperation(viewEClass, VIEW___UPDATE);

		adapterEClass = createEClass(ADAPTER);
		createEAttribute(adapterEClass, ADAPTER__IS_ADAPTABLE);
		createEReference(adapterEClass, ADAPTER__DATA);
		createEReference(adapterEClass, ADAPTER__ATTRIBUTES);
		createEReference(adapterEClass, ADAPTER__ACTION);
		createEOperation(adapterEClass, ADAPTER___ADAPT);

		attributeEClass = createEClass(ATTRIBUTE);
		createEAttribute(attributeEClass, ATTRIBUTE__IS_OBSERVABLE);
		createEAttribute(attributeEClass, ATTRIBUTE__IS_OUTPUT);
		createEAttribute(attributeEClass, ATTRIBUTE__TYPE);
		createEAttribute(attributeEClass, ATTRIBUTE__MULTIPLICITY);
		createEReference(attributeEClass, ATTRIBUTE__DATA);

		staticAttributeEClass = createEClass(STATIC_ATTRIBUTE);

		dynamicAttributeEClass = createEClass(DYNAMIC_ATTRIBUTE);
		createEReference(dynamicAttributeEClass, DYNAMIC_ATTRIBUTE__INITIAL);
		createEReference(dynamicAttributeEClass, DYNAMIC_ATTRIBUTE__NEW_DATA);

		dataEClass = createEClass(DATA);
		createEOperation(dataEClass, DATA___GET_DATA_VALUE);
		createEOperation(dataEClass, DATA___SET_DATA_VALUE__ELIST);

		booleanDataEClass = createEClass(BOOLEAN_DATA);
		createEAttribute(booleanDataEClass, BOOLEAN_DATA__VALUE);

		doubleDataEClass = createEClass(DOUBLE_DATA);
		createEAttribute(doubleDataEClass, DOUBLE_DATA__VALUE);

		xMod_ActionEClass = createEClass(XMOD_ACTION);
		createEReference(xMod_ActionEClass, XMOD_ACTION__OPERATIONS);
		createEOperation(xMod_ActionEClass, XMOD_ACTION___EXECUTE);

		xMod_OperationEClass = createEClass(XMOD_OPERATION);
		createEAttribute(xMod_OperationEClass, XMOD_OPERATION__NAME);
		createEAttribute(xMod_OperationEClass, XMOD_OPERATION__OBJECT_TAG);
		createEAttribute(xMod_OperationEClass, XMOD_OPERATION__PARAMETERS_TAG);
		createEAttribute(xMod_OperationEClass, XMOD_OPERATION__RETURN_TAG);
		createEReference(xMod_OperationEClass, XMOD_OPERATION__EXCEPTIONS);
		createEOperation(xMod_OperationEClass, XMOD_OPERATION___CALL_OPERATION);

		xMod_ElementEClass = createEClass(XMOD_ELEMENT);
		createEAttribute(xMod_ElementEClass, XMOD_ELEMENT__XMOD_ID);

		xMod_ExceptionEClass = createEClass(XMOD_EXCEPTION);
		createEAttribute(xMod_ExceptionEClass, XMOD_EXCEPTION__LITERAL);
		createEAttribute(xMod_ExceptionEClass, XMOD_EXCEPTION__FILTER);
		createEAttribute(xMod_ExceptionEClass, XMOD_EXCEPTION__REACTION);
		createEReference(xMod_ExceptionEClass, XMOD_EXCEPTION__CALLED_OPERATION);

		namedElementEClass = createEClass(NAMED_ELEMENT);
		createEAttribute(namedElementEClass, NAMED_ELEMENT__NAME);

		// Create enums
		xMod_ExceptionReactionEEnum = createEEnum(XMOD_EXCEPTION_REACTION);
		xMod_ExceptionLiteralEEnum = createEEnum(XMOD_EXCEPTION_LITERAL);
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
		simulationEClass.getESuperTypes().add(this.getXMod_Element());
		componentEClass.getESuperTypes().add(this.getXMod_Element());
		executableComponentEClass.getESuperTypes().add(this.getComponent());
		serviceComponentEClass.getESuperTypes().add(this.getComponent());
		viewEClass.getESuperTypes().add(this.getXMod_Element());
		adapterEClass.getESuperTypes().add(this.getXMod_Element());
		attributeEClass.getESuperTypes().add(this.getNamedElement());
		staticAttributeEClass.getESuperTypes().add(this.getAttribute());
		dynamicAttributeEClass.getESuperTypes().add(this.getAttribute());
		booleanDataEClass.getESuperTypes().add(this.getData());
		doubleDataEClass.getESuperTypes().add(this.getData());
		xMod_ActionEClass.getESuperTypes().add(this.getXMod_Element());

		// Initialize classes, features, and operations; add parameters
		initEClass(simulationEClass, Simulation.class, "Simulation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSimulation_StartTime(), ecorePackage.getELong(), "startTime", null, 1, 1, Simulation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSimulation_EndTime(), ecorePackage.getELong(), "endTime", null, 1, 1, Simulation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSimulation_DurationStep(), ecorePackage.getELong(), "durationStep", null, 1, 1, Simulation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSimulation_Components(), this.getComponent(), null, "components", null, 0, -1, Simulation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSimulation_Views(), this.getView(), null, "views", null, 0, -1, Simulation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSimulation_Adapters(), this.getAdapter(), null, "adapters", null, 0, -1, Simulation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getSimulation__Run(), null, "Run", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getSimulation__Init(), null, "Init", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(componentEClass, Component.class, "Component", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComponent_Attributes(), this.getAttribute(), null, "attributes", null, 0, -1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponent_Actions(), this.getXMod_Action(), null, "actions", null, 0, -1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getComponent__Init(), null, "Init", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(executableComponentEClass, ExecutableComponent.class, "ExecutableComponent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExecutableComponent_Period(), ecorePackage.getELong(), "period", null, 1, 1, ExecutableComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExecutableComponent_Priority(), ecorePackage.getELong(), "priority", null, 1, 1, ExecutableComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExecutableComponent_Services(), this.getServiceComponent(), null, "services", null, 0, -1, ExecutableComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExecutableComponent_IsDataFlow(), ecorePackage.getEBoolean(), "isDataFlow", "false", 1, 1, ExecutableComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getExecutableComponent__DoStep(), ecorePackage.getEString(), "doStep", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getExecutableComponent__Update(), null, "update", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(serviceComponentEClass, ServiceComponent.class, "ServiceComponent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(viewEClass, View.class, "View", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getView_RemoteDriven(), ecorePackage.getEBoolean(), "remoteDriven", "false", 0, 1, View.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getView_Host(), ecorePackage.getEString(), "host", "localhost", 0, 1, View.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getView_Port(), ecorePackage.getEInt(), "port", "8080", 0, 1, View.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getView_Period(), ecorePackage.getELong(), "period", "1000", 0, 1, View.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getView_Services(), this.getServiceComponent(), null, "services", null, 0, -1, View.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getView_Adapters(), this.getAdapter(), null, "adapters", null, 0, -1, View.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getView_ObservedTags(), ecorePackage.getEString(), "observedTags", null, 0, -1, View.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getView__Start(), null, "start", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getView__Update(), null, "update", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(adapterEClass, Adapter.class, "Adapter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAdapter_IsAdaptable(), ecorePackage.getEBoolean(), "isAdaptable", "false", 1, 1, Adapter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAdapter_Data(), this.getData(), null, "data", null, 0, 1, Adapter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAdapter_Attributes(), this.getAttribute(), null, "attributes", null, 0, -1, Adapter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAdapter_Action(), this.getXMod_Action(), null, "action", null, 0, 1, Adapter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getAdapter__Adapt(), this.getData(), "adapt", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(attributeEClass, Attribute.class, "Attribute", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAttribute_IsObservable(), ecorePackage.getEBoolean(), "isObservable", "false", 1, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttribute_IsOutput(), ecorePackage.getEBoolean(), "isOutput", "false", 1, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttribute_Type(), ecorePackage.getEString(), "type", null, 1, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttribute_Multiplicity(), ecorePackage.getELong(), "multiplicity", "1", 1, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAttribute_Data(), this.getData(), null, "data", null, 0, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(staticAttributeEClass, StaticAttribute.class, "StaticAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dynamicAttributeEClass, DynamicAttribute.class, "DynamicAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDynamicAttribute_Initial(), this.getStaticAttribute(), null, "initial", null, 1, 1, DynamicAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDynamicAttribute_NewData(), this.getData(), null, "newData", null, 0, 1, DynamicAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataEClass, Data.class, "Data", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getData__GetDataValue(), ecorePackage.getEJavaObject(), "getDataValue", 1, 1, IS_UNIQUE, IS_ORDERED);

		EOperation op = initEOperation(getData__SetDataValue__EList(), null, "setDataValue", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEJavaObject(), "args", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEClass(booleanDataEClass, BooleanData.class, "BooleanData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBooleanData_Value(), ecorePackage.getEBoolean(), "value", null, 0, -1, BooleanData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(doubleDataEClass, DoubleData.class, "DoubleData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDoubleData_Value(), ecorePackage.getEDouble(), "value", null, 0, -1, DoubleData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(xMod_ActionEClass, XMod_Action.class, "XMod_Action", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getXMod_Action_Operations(), this.getXMod_Operation(), null, "operations", null, 1, -1, XMod_Action.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getXMod_Action__Execute(), this.getXMod_ExceptionReaction(), "execute", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(xMod_OperationEClass, XMod_Operation.class, "XMod_Operation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getXMod_Operation_Name(), ecorePackage.getEString(), "name", null, 1, 1, XMod_Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getXMod_Operation_ObjectTag(), ecorePackage.getEString(), "objectTag", null, 1, 1, XMod_Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getXMod_Operation_ParametersTag(), ecorePackage.getEString(), "parametersTag", null, 0, -1, XMod_Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getXMod_Operation_ReturnTag(), ecorePackage.getEString(), "returnTag", null, 0, 1, XMod_Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getXMod_Operation_Exceptions(), this.getXMod_Exception(), null, "exceptions", null, 0, -1, XMod_Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getXMod_Operation__CallOperation(), this.getXMod_Exception(), "callOperation", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(xMod_ElementEClass, XMod_Element.class, "XMod_Element", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getXMod_Element_Xmod_id(), ecorePackage.getEString(), "xmod_id", null, 0, 1, XMod_Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(xMod_ExceptionEClass, XMod_Exception.class, "XMod_Exception", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getXMod_Exception_Literal(), this.getXMod_ExceptionLiteral(), "literal", "ok", 1, 1, XMod_Exception.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getXMod_Exception_Filter(), ecorePackage.getEString(), "filter", null, 0, 1, XMod_Exception.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getXMod_Exception_Reaction(), this.getXMod_ExceptionReaction(), "reaction", "continue", 1, 1, XMod_Exception.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getXMod_Exception_CalledOperation(), this.getXMod_Operation(), null, "calledOperation", null, 0, 1, XMod_Exception.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(namedElementEClass, NamedElement.class, "NamedElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNamedElement_Name(), ecorePackage.getEString(), "name", null, 1, 1, NamedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(xMod_ExceptionReactionEEnum, XMod_ExceptionReaction.class, "XMod_ExceptionReaction");
		addEEnumLiteral(xMod_ExceptionReactionEEnum, XMod_ExceptionReaction.CONTINUE);
		addEEnumLiteral(xMod_ExceptionReactionEEnum, XMod_ExceptionReaction.SKIP);
		addEEnumLiteral(xMod_ExceptionReactionEEnum, XMod_ExceptionReaction.EXIT);
		addEEnumLiteral(xMod_ExceptionReactionEEnum, XMod_ExceptionReaction.LOCALSTOP);

		initEEnum(xMod_ExceptionLiteralEEnum, XMod_ExceptionLiteral.class, "XMod_ExceptionLiteral");
		addEEnumLiteral(xMod_ExceptionLiteralEEnum, XMod_ExceptionLiteral.OK);
		addEEnumLiteral(xMod_ExceptionLiteralEEnum, XMod_ExceptionLiteral.UNKNOWN_TAG);
		addEEnumLiteral(xMod_ExceptionLiteralEEnum, XMod_ExceptionLiteral.OBJECT_NOT_FOUND);
		addEEnumLiteral(xMod_ExceptionLiteralEEnum, XMod_ExceptionLiteral.METHOD_NOT_FOUND);
		addEEnumLiteral(xMod_ExceptionLiteralEEnum, XMod_ExceptionLiteral.PARAMETERS_NOT_MATCHING);
		addEEnumLiteral(xMod_ExceptionLiteralEEnum, XMod_ExceptionLiteral.RETURN_TYPE_NOT_MATCHING);
		addEEnumLiteral(xMod_ExceptionLiteralEEnum, XMod_ExceptionLiteral.METHOD_EXCEPTION);
		addEEnumLiteral(xMod_ExceptionLiteralEEnum, XMod_ExceptionLiteral.OTHER);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// Xmod_exec
		createXmod_execAnnotations();
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
		  (executableComponentEClass,
		   source,
		   new String[] {
		   });
	}

} //SpicePackageImpl
