/**
 */
package Spice;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see Spice.SpiceFactory
 * @model kind="package"
 * @generated
 */
public interface SpicePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Spice";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "platform:/resource/Spice/metamodels/spice.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "Spice";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SpicePackage eINSTANCE = Spice.impl.SpicePackageImpl.init();

	/**
	 * The meta object id for the '{@link Spice.impl.SimulationImpl <em>Simulation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Spice.impl.SimulationImpl
	 * @see Spice.impl.SpicePackageImpl#getSimulation()
	 * @generated
	 */
	int SIMULATION = 0;

	/**
	 * The meta object id for the '{@link Spice.impl.XMod_ElementImpl <em>XMod Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Spice.impl.XMod_ElementImpl
	 * @see Spice.impl.SpicePackageImpl#getXMod_Element()
	 * @generated
	 */
	int XMOD_ELEMENT = 14;

	/**
	 * The feature id for the '<em><b>Xmod id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XMOD_ELEMENT__XMOD_ID = 0;

	/**
	 * The number of structural features of the '<em>XMod Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XMOD_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>XMod Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XMOD_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Xmod id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATION__XMOD_ID = XMOD_ELEMENT__XMOD_ID;

	/**
	 * The feature id for the '<em><b>Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATION__START_TIME = XMOD_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>End Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATION__END_TIME = XMOD_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Duration Step</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATION__DURATION_STEP = XMOD_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Components</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATION__COMPONENTS = XMOD_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Views</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATION__VIEWS = XMOD_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Adapters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATION__ADAPTERS = XMOD_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Simulation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATION_FEATURE_COUNT = XMOD_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The operation id for the '<em>Run</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATION___RUN = XMOD_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Init</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATION___INIT = XMOD_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Simulation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATION_OPERATION_COUNT = XMOD_ELEMENT_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link Spice.impl.ComponentImpl <em>Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Spice.impl.ComponentImpl
	 * @see Spice.impl.SpicePackageImpl#getComponent()
	 * @generated
	 */
	int COMPONENT = 1;

	/**
	 * The feature id for the '<em><b>Xmod id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__XMOD_ID = XMOD_ELEMENT__XMOD_ID;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__ATTRIBUTES = XMOD_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__ACTIONS = XMOD_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_FEATURE_COUNT = XMOD_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Init</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT___INIT = XMOD_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_OPERATION_COUNT = XMOD_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link Spice.impl.ExecutableComponentImpl <em>Executable Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Spice.impl.ExecutableComponentImpl
	 * @see Spice.impl.SpicePackageImpl#getExecutableComponent()
	 * @generated
	 */
	int EXECUTABLE_COMPONENT = 2;

	/**
	 * The feature id for the '<em><b>Xmod id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTABLE_COMPONENT__XMOD_ID = COMPONENT__XMOD_ID;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTABLE_COMPONENT__ATTRIBUTES = COMPONENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTABLE_COMPONENT__ACTIONS = COMPONENT__ACTIONS;

	/**
	 * The feature id for the '<em><b>Period</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTABLE_COMPONENT__PERIOD = COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTABLE_COMPONENT__PRIORITY = COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Services</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTABLE_COMPONENT__SERVICES = COMPONENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Is Data Flow</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTABLE_COMPONENT__IS_DATA_FLOW = COMPONENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Executable Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTABLE_COMPONENT_FEATURE_COUNT = COMPONENT_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Init</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTABLE_COMPONENT___INIT = COMPONENT___INIT;

	/**
	 * The operation id for the '<em>Do Step</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTABLE_COMPONENT___DO_STEP = COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTABLE_COMPONENT___UPDATE = COMPONENT_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Executable Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTABLE_COMPONENT_OPERATION_COUNT = COMPONENT_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link Spice.impl.ServiceComponentImpl <em>Service Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Spice.impl.ServiceComponentImpl
	 * @see Spice.impl.SpicePackageImpl#getServiceComponent()
	 * @generated
	 */
	int SERVICE_COMPONENT = 3;

	/**
	 * The feature id for the '<em><b>Xmod id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_COMPONENT__XMOD_ID = COMPONENT__XMOD_ID;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_COMPONENT__ATTRIBUTES = COMPONENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_COMPONENT__ACTIONS = COMPONENT__ACTIONS;

	/**
	 * The number of structural features of the '<em>Service Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_COMPONENT_FEATURE_COUNT = COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Init</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_COMPONENT___INIT = COMPONENT___INIT;

	/**
	 * The number of operations of the '<em>Service Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_COMPONENT_OPERATION_COUNT = COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Spice.impl.ViewImpl <em>View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Spice.impl.ViewImpl
	 * @see Spice.impl.SpicePackageImpl#getView()
	 * @generated
	 */
	int VIEW = 4;

	/**
	 * The feature id for the '<em><b>Xmod id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW__XMOD_ID = XMOD_ELEMENT__XMOD_ID;

	/**
	 * The feature id for the '<em><b>Remote Driven</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW__REMOTE_DRIVEN = XMOD_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Host</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW__HOST = XMOD_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW__PORT = XMOD_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Period</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW__PERIOD = XMOD_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Services</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW__SERVICES = XMOD_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Adapters</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW__ADAPTERS = XMOD_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Observed Tags</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW__OBSERVED_TAGS = XMOD_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_FEATURE_COUNT = XMOD_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The operation id for the '<em>Start</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW___START = XMOD_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW___UPDATE = XMOD_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_OPERATION_COUNT = XMOD_ELEMENT_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link Spice.impl.AdapterImpl <em>Adapter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Spice.impl.AdapterImpl
	 * @see Spice.impl.SpicePackageImpl#getAdapter()
	 * @generated
	 */
	int ADAPTER = 5;

	/**
	 * The feature id for the '<em><b>Xmod id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTER__XMOD_ID = XMOD_ELEMENT__XMOD_ID;

	/**
	 * The feature id for the '<em><b>Is Adaptable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTER__IS_ADAPTABLE = XMOD_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTER__DATA = XMOD_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTER__ATTRIBUTES = XMOD_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Action</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTER__ACTION = XMOD_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Adapter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTER_FEATURE_COUNT = XMOD_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Adapt</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTER___ADAPT = XMOD_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Adapter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTER_OPERATION_COUNT = XMOD_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link Spice.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Spice.impl.NamedElementImpl
	 * @see Spice.impl.SpicePackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 16;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Spice.impl.XMod_ActionImpl <em>XMod Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Spice.impl.XMod_ActionImpl
	 * @see Spice.impl.SpicePackageImpl#getXMod_Action()
	 * @generated
	 */
	int XMOD_ACTION = 12;

	/**
	 * The meta object id for the '{@link Spice.impl.XMod_OperationImpl <em>XMod Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Spice.impl.XMod_OperationImpl
	 * @see Spice.impl.SpicePackageImpl#getXMod_Operation()
	 * @generated
	 */
	int XMOD_OPERATION = 13;

	/**
	 * The meta object id for the '{@link Spice.impl.AttributeImpl <em>Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Spice.impl.AttributeImpl
	 * @see Spice.impl.SpicePackageImpl#getAttribute()
	 * @generated
	 */
	int ATTRIBUTE = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Is Observable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__IS_OBSERVABLE = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Output</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__IS_OUTPUT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__TYPE = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Multiplicity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__MULTIPLICITY = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__DATA = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Spice.impl.StaticAttributeImpl <em>Static Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Spice.impl.StaticAttributeImpl
	 * @see Spice.impl.SpicePackageImpl#getStaticAttribute()
	 * @generated
	 */
	int STATIC_ATTRIBUTE = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_ATTRIBUTE__NAME = ATTRIBUTE__NAME;

	/**
	 * The feature id for the '<em><b>Is Observable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_ATTRIBUTE__IS_OBSERVABLE = ATTRIBUTE__IS_OBSERVABLE;

	/**
	 * The feature id for the '<em><b>Is Output</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_ATTRIBUTE__IS_OUTPUT = ATTRIBUTE__IS_OUTPUT;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_ATTRIBUTE__TYPE = ATTRIBUTE__TYPE;

	/**
	 * The feature id for the '<em><b>Multiplicity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_ATTRIBUTE__MULTIPLICITY = ATTRIBUTE__MULTIPLICITY;

	/**
	 * The feature id for the '<em><b>Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_ATTRIBUTE__DATA = ATTRIBUTE__DATA;

	/**
	 * The number of structural features of the '<em>Static Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_ATTRIBUTE_FEATURE_COUNT = ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Static Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_ATTRIBUTE_OPERATION_COUNT = ATTRIBUTE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Spice.impl.DynamicAttributeImpl <em>Dynamic Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Spice.impl.DynamicAttributeImpl
	 * @see Spice.impl.SpicePackageImpl#getDynamicAttribute()
	 * @generated
	 */
	int DYNAMIC_ATTRIBUTE = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_ATTRIBUTE__NAME = ATTRIBUTE__NAME;

	/**
	 * The feature id for the '<em><b>Is Observable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_ATTRIBUTE__IS_OBSERVABLE = ATTRIBUTE__IS_OBSERVABLE;

	/**
	 * The feature id for the '<em><b>Is Output</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_ATTRIBUTE__IS_OUTPUT = ATTRIBUTE__IS_OUTPUT;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_ATTRIBUTE__TYPE = ATTRIBUTE__TYPE;

	/**
	 * The feature id for the '<em><b>Multiplicity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_ATTRIBUTE__MULTIPLICITY = ATTRIBUTE__MULTIPLICITY;

	/**
	 * The feature id for the '<em><b>Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_ATTRIBUTE__DATA = ATTRIBUTE__DATA;

	/**
	 * The feature id for the '<em><b>Initial</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_ATTRIBUTE__INITIAL = ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>New Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_ATTRIBUTE__NEW_DATA = ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Dynamic Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_ATTRIBUTE_FEATURE_COUNT = ATTRIBUTE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Dynamic Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_ATTRIBUTE_OPERATION_COUNT = ATTRIBUTE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Spice.impl.DataImpl <em>Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Spice.impl.DataImpl
	 * @see Spice.impl.SpicePackageImpl#getData()
	 * @generated
	 */
	int DATA = 9;

	/**
	 * The number of structural features of the '<em>Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Get Data Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA___GET_DATA_VALUE = 0;

	/**
	 * The operation id for the '<em>Set Data Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA___SET_DATA_VALUE__ELIST = 1;

	/**
	 * The number of operations of the '<em>Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link Spice.impl.BooleanDataImpl <em>Boolean Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Spice.impl.BooleanDataImpl
	 * @see Spice.impl.SpicePackageImpl#getBooleanData()
	 * @generated
	 */
	int BOOLEAN_DATA = 10;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_DATA__VALUE = DATA_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Boolean Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_DATA_FEATURE_COUNT = DATA_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Data Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_DATA___GET_DATA_VALUE = DATA___GET_DATA_VALUE;

	/**
	 * The operation id for the '<em>Set Data Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_DATA___SET_DATA_VALUE__ELIST = DATA___SET_DATA_VALUE__ELIST;

	/**
	 * The number of operations of the '<em>Boolean Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_DATA_OPERATION_COUNT = DATA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Spice.impl.DoubleDataImpl <em>Double Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Spice.impl.DoubleDataImpl
	 * @see Spice.impl.SpicePackageImpl#getDoubleData()
	 * @generated
	 */
	int DOUBLE_DATA = 11;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_DATA__VALUE = DATA_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Double Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_DATA_FEATURE_COUNT = DATA_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Data Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_DATA___GET_DATA_VALUE = DATA___GET_DATA_VALUE;

	/**
	 * The operation id for the '<em>Set Data Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_DATA___SET_DATA_VALUE__ELIST = DATA___SET_DATA_VALUE__ELIST;

	/**
	 * The number of operations of the '<em>Double Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_DATA_OPERATION_COUNT = DATA_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Xmod id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XMOD_ACTION__XMOD_ID = XMOD_ELEMENT__XMOD_ID;

	/**
	 * The feature id for the '<em><b>Operations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XMOD_ACTION__OPERATIONS = XMOD_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>XMod Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XMOD_ACTION_FEATURE_COUNT = XMOD_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Execute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XMOD_ACTION___EXECUTE = XMOD_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>XMod Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XMOD_ACTION_OPERATION_COUNT = XMOD_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XMOD_OPERATION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Object Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XMOD_OPERATION__OBJECT_TAG = 1;

	/**
	 * The feature id for the '<em><b>Parameters Tag</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XMOD_OPERATION__PARAMETERS_TAG = 2;

	/**
	 * The feature id for the '<em><b>Return Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XMOD_OPERATION__RETURN_TAG = 3;

	/**
	 * The feature id for the '<em><b>Exceptions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XMOD_OPERATION__EXCEPTIONS = 4;

	/**
	 * The number of structural features of the '<em>XMod Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XMOD_OPERATION_FEATURE_COUNT = 5;

	/**
	 * The operation id for the '<em>Call Operation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XMOD_OPERATION___CALL_OPERATION = 0;

	/**
	 * The number of operations of the '<em>XMod Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XMOD_OPERATION_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link Spice.impl.XMod_ExceptionImpl <em>XMod Exception</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Spice.impl.XMod_ExceptionImpl
	 * @see Spice.impl.SpicePackageImpl#getXMod_Exception()
	 * @generated
	 */
	int XMOD_EXCEPTION = 15;

	/**
	 * The feature id for the '<em><b>Literal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XMOD_EXCEPTION__LITERAL = 0;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XMOD_EXCEPTION__FILTER = 1;

	/**
	 * The feature id for the '<em><b>Reaction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XMOD_EXCEPTION__REACTION = 2;

	/**
	 * The feature id for the '<em><b>Called Operation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XMOD_EXCEPTION__CALLED_OPERATION = 3;

	/**
	 * The number of structural features of the '<em>XMod Exception</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XMOD_EXCEPTION_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>XMod Exception</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XMOD_EXCEPTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Spice.XMod_ExceptionReaction <em>XMod Exception Reaction</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Spice.XMod_ExceptionReaction
	 * @see Spice.impl.SpicePackageImpl#getXMod_ExceptionReaction()
	 * @generated
	 */
	int XMOD_EXCEPTION_REACTION = 17;

	/**
	 * The meta object id for the '{@link Spice.XMod_ExceptionLiteral <em>XMod Exception Literal</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Spice.XMod_ExceptionLiteral
	 * @see Spice.impl.SpicePackageImpl#getXMod_ExceptionLiteral()
	 * @generated
	 */
	int XMOD_EXCEPTION_LITERAL = 18;

	/**
	 * Returns the meta object for class '{@link Spice.Simulation <em>Simulation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simulation</em>'.
	 * @see Spice.Simulation
	 * @generated
	 */
	EClass getSimulation();

	/**
	 * Returns the meta object for the attribute '{@link Spice.Simulation#getStartTime <em>Start Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Time</em>'.
	 * @see Spice.Simulation#getStartTime()
	 * @see #getSimulation()
	 * @generated
	 */
	EAttribute getSimulation_StartTime();

	/**
	 * Returns the meta object for the attribute '{@link Spice.Simulation#getEndTime <em>End Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Time</em>'.
	 * @see Spice.Simulation#getEndTime()
	 * @see #getSimulation()
	 * @generated
	 */
	EAttribute getSimulation_EndTime();

	/**
	 * Returns the meta object for the attribute '{@link Spice.Simulation#getDurationStep <em>Duration Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Duration Step</em>'.
	 * @see Spice.Simulation#getDurationStep()
	 * @see #getSimulation()
	 * @generated
	 */
	EAttribute getSimulation_DurationStep();

	/**
	 * Returns the meta object for the containment reference list '{@link Spice.Simulation#getComponents <em>Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Components</em>'.
	 * @see Spice.Simulation#getComponents()
	 * @see #getSimulation()
	 * @generated
	 */
	EReference getSimulation_Components();

	/**
	 * Returns the meta object for the containment reference list '{@link Spice.Simulation#getViews <em>Views</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Views</em>'.
	 * @see Spice.Simulation#getViews()
	 * @see #getSimulation()
	 * @generated
	 */
	EReference getSimulation_Views();

	/**
	 * Returns the meta object for the containment reference list '{@link Spice.Simulation#getAdapters <em>Adapters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Adapters</em>'.
	 * @see Spice.Simulation#getAdapters()
	 * @see #getSimulation()
	 * @generated
	 */
	EReference getSimulation_Adapters();

	/**
	 * Returns the meta object for the '{@link Spice.Simulation#Run() <em>Run</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Run</em>' operation.
	 * @see Spice.Simulation#Run()
	 * @generated
	 */
	EOperation getSimulation__Run();

	/**
	 * Returns the meta object for the '{@link Spice.Simulation#Init() <em>Init</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Init</em>' operation.
	 * @see Spice.Simulation#Init()
	 * @generated
	 */
	EOperation getSimulation__Init();

	/**
	 * Returns the meta object for class '{@link Spice.Component <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component</em>'.
	 * @see Spice.Component
	 * @generated
	 */
	EClass getComponent();

	/**
	 * Returns the meta object for the containment reference list '{@link Spice.Component#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attributes</em>'.
	 * @see Spice.Component#getAttributes()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_Attributes();

	/**
	 * Returns the meta object for the containment reference list '{@link Spice.Component#getActions <em>Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Actions</em>'.
	 * @see Spice.Component#getActions()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_Actions();

	/**
	 * Returns the meta object for the '{@link Spice.Component#Init() <em>Init</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Init</em>' operation.
	 * @see Spice.Component#Init()
	 * @generated
	 */
	EOperation getComponent__Init();

	/**
	 * Returns the meta object for class '{@link Spice.ExecutableComponent <em>Executable Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Executable Component</em>'.
	 * @see Spice.ExecutableComponent
	 * @generated
	 */
	EClass getExecutableComponent();

	/**
	 * Returns the meta object for the attribute '{@link Spice.ExecutableComponent#getPeriod <em>Period</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Period</em>'.
	 * @see Spice.ExecutableComponent#getPeriod()
	 * @see #getExecutableComponent()
	 * @generated
	 */
	EAttribute getExecutableComponent_Period();

	/**
	 * Returns the meta object for the attribute '{@link Spice.ExecutableComponent#getPriority <em>Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Priority</em>'.
	 * @see Spice.ExecutableComponent#getPriority()
	 * @see #getExecutableComponent()
	 * @generated
	 */
	EAttribute getExecutableComponent_Priority();

	/**
	 * Returns the meta object for the reference list '{@link Spice.ExecutableComponent#getServices <em>Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Services</em>'.
	 * @see Spice.ExecutableComponent#getServices()
	 * @see #getExecutableComponent()
	 * @generated
	 */
	EReference getExecutableComponent_Services();

	/**
	 * Returns the meta object for the attribute '{@link Spice.ExecutableComponent#isIsDataFlow <em>Is Data Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Data Flow</em>'.
	 * @see Spice.ExecutableComponent#isIsDataFlow()
	 * @see #getExecutableComponent()
	 * @generated
	 */
	EAttribute getExecutableComponent_IsDataFlow();

	/**
	 * Returns the meta object for the '{@link Spice.ExecutableComponent#doStep() <em>Do Step</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Do Step</em>' operation.
	 * @see Spice.ExecutableComponent#doStep()
	 * @generated
	 */
	EOperation getExecutableComponent__DoStep();

	/**
	 * Returns the meta object for the '{@link Spice.ExecutableComponent#update() <em>Update</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Update</em>' operation.
	 * @see Spice.ExecutableComponent#update()
	 * @generated
	 */
	EOperation getExecutableComponent__Update();

	/**
	 * Returns the meta object for class '{@link Spice.ServiceComponent <em>Service Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Component</em>'.
	 * @see Spice.ServiceComponent
	 * @generated
	 */
	EClass getServiceComponent();

	/**
	 * Returns the meta object for class '{@link Spice.View <em>View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>View</em>'.
	 * @see Spice.View
	 * @generated
	 */
	EClass getView();

	/**
	 * Returns the meta object for the attribute '{@link Spice.View#isRemoteDriven <em>Remote Driven</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Remote Driven</em>'.
	 * @see Spice.View#isRemoteDriven()
	 * @see #getView()
	 * @generated
	 */
	EAttribute getView_RemoteDriven();

	/**
	 * Returns the meta object for the attribute '{@link Spice.View#getHost <em>Host</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Host</em>'.
	 * @see Spice.View#getHost()
	 * @see #getView()
	 * @generated
	 */
	EAttribute getView_Host();

	/**
	 * Returns the meta object for the attribute '{@link Spice.View#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Port</em>'.
	 * @see Spice.View#getPort()
	 * @see #getView()
	 * @generated
	 */
	EAttribute getView_Port();

	/**
	 * Returns the meta object for the attribute '{@link Spice.View#getPeriod <em>Period</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Period</em>'.
	 * @see Spice.View#getPeriod()
	 * @see #getView()
	 * @generated
	 */
	EAttribute getView_Period();

	/**
	 * Returns the meta object for the reference list '{@link Spice.View#getServices <em>Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Services</em>'.
	 * @see Spice.View#getServices()
	 * @see #getView()
	 * @generated
	 */
	EReference getView_Services();

	/**
	 * Returns the meta object for the reference list '{@link Spice.View#getAdapters <em>Adapters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Adapters</em>'.
	 * @see Spice.View#getAdapters()
	 * @see #getView()
	 * @generated
	 */
	EReference getView_Adapters();

	/**
	 * Returns the meta object for the attribute list '{@link Spice.View#getObservedTags <em>Observed Tags</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Observed Tags</em>'.
	 * @see Spice.View#getObservedTags()
	 * @see #getView()
	 * @generated
	 */
	EAttribute getView_ObservedTags();

	/**
	 * Returns the meta object for the '{@link Spice.View#start() <em>Start</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Start</em>' operation.
	 * @see Spice.View#start()
	 * @generated
	 */
	EOperation getView__Start();

	/**
	 * Returns the meta object for the '{@link Spice.View#update() <em>Update</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Update</em>' operation.
	 * @see Spice.View#update()
	 * @generated
	 */
	EOperation getView__Update();

	/**
	 * Returns the meta object for class '{@link Spice.Adapter <em>Adapter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Adapter</em>'.
	 * @see Spice.Adapter
	 * @generated
	 */
	EClass getAdapter();

	/**
	 * Returns the meta object for the attribute '{@link Spice.Adapter#isIsAdaptable <em>Is Adaptable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Adaptable</em>'.
	 * @see Spice.Adapter#isIsAdaptable()
	 * @see #getAdapter()
	 * @generated
	 */
	EAttribute getAdapter_IsAdaptable();

	/**
	 * Returns the meta object for the containment reference '{@link Spice.Adapter#getData <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Data</em>'.
	 * @see Spice.Adapter#getData()
	 * @see #getAdapter()
	 * @generated
	 */
	EReference getAdapter_Data();

	/**
	 * Returns the meta object for the reference list '{@link Spice.Adapter#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Attributes</em>'.
	 * @see Spice.Adapter#getAttributes()
	 * @see #getAdapter()
	 * @generated
	 */
	EReference getAdapter_Attributes();

	/**
	 * Returns the meta object for the containment reference '{@link Spice.Adapter#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Action</em>'.
	 * @see Spice.Adapter#getAction()
	 * @see #getAdapter()
	 * @generated
	 */
	EReference getAdapter_Action();

	/**
	 * Returns the meta object for the '{@link Spice.Adapter#adapt() <em>Adapt</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Adapt</em>' operation.
	 * @see Spice.Adapter#adapt()
	 * @generated
	 */
	EOperation getAdapter__Adapt();

	/**
	 * Returns the meta object for class '{@link Spice.XMod_Action <em>XMod Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XMod Action</em>'.
	 * @see Spice.XMod_Action
	 * @generated
	 */
	EClass getXMod_Action();

	/**
	 * Returns the meta object for the containment reference list '{@link Spice.XMod_Action#getOperations <em>Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Operations</em>'.
	 * @see Spice.XMod_Action#getOperations()
	 * @see #getXMod_Action()
	 * @generated
	 */
	EReference getXMod_Action_Operations();

	/**
	 * Returns the meta object for the '{@link Spice.XMod_Action#execute() <em>Execute</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Execute</em>' operation.
	 * @see Spice.XMod_Action#execute()
	 * @generated
	 */
	EOperation getXMod_Action__Execute();

	/**
	 * Returns the meta object for class '{@link Spice.XMod_Operation <em>XMod Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XMod Operation</em>'.
	 * @see Spice.XMod_Operation
	 * @generated
	 */
	EClass getXMod_Operation();

	/**
	 * Returns the meta object for the attribute '{@link Spice.XMod_Operation#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Spice.XMod_Operation#getName()
	 * @see #getXMod_Operation()
	 * @generated
	 */
	EAttribute getXMod_Operation_Name();

	/**
	 * Returns the meta object for the attribute '{@link Spice.XMod_Operation#getObjectTag <em>Object Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Object Tag</em>'.
	 * @see Spice.XMod_Operation#getObjectTag()
	 * @see #getXMod_Operation()
	 * @generated
	 */
	EAttribute getXMod_Operation_ObjectTag();

	/**
	 * Returns the meta object for the attribute list '{@link Spice.XMod_Operation#getParametersTag <em>Parameters Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Parameters Tag</em>'.
	 * @see Spice.XMod_Operation#getParametersTag()
	 * @see #getXMod_Operation()
	 * @generated
	 */
	EAttribute getXMod_Operation_ParametersTag();

	/**
	 * Returns the meta object for the attribute '{@link Spice.XMod_Operation#getReturnTag <em>Return Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Return Tag</em>'.
	 * @see Spice.XMod_Operation#getReturnTag()
	 * @see #getXMod_Operation()
	 * @generated
	 */
	EAttribute getXMod_Operation_ReturnTag();

	/**
	 * Returns the meta object for the containment reference list '{@link Spice.XMod_Operation#getExceptions <em>Exceptions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Exceptions</em>'.
	 * @see Spice.XMod_Operation#getExceptions()
	 * @see #getXMod_Operation()
	 * @generated
	 */
	EReference getXMod_Operation_Exceptions();

	/**
	 * Returns the meta object for the '{@link Spice.XMod_Operation#callOperation() <em>Call Operation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Call Operation</em>' operation.
	 * @see Spice.XMod_Operation#callOperation()
	 * @generated
	 */
	EOperation getXMod_Operation__CallOperation();

	/**
	 * Returns the meta object for class '{@link Spice.XMod_Element <em>XMod Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XMod Element</em>'.
	 * @see Spice.XMod_Element
	 * @generated
	 */
	EClass getXMod_Element();

	/**
	 * Returns the meta object for the attribute '{@link Spice.XMod_Element#getXmod_id <em>Xmod id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Xmod id</em>'.
	 * @see Spice.XMod_Element#getXmod_id()
	 * @see #getXMod_Element()
	 * @generated
	 */
	EAttribute getXMod_Element_Xmod_id();

	/**
	 * Returns the meta object for class '{@link Spice.XMod_Exception <em>XMod Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XMod Exception</em>'.
	 * @see Spice.XMod_Exception
	 * @generated
	 */
	EClass getXMod_Exception();

	/**
	 * Returns the meta object for the attribute '{@link Spice.XMod_Exception#getLiteral <em>Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Literal</em>'.
	 * @see Spice.XMod_Exception#getLiteral()
	 * @see #getXMod_Exception()
	 * @generated
	 */
	EAttribute getXMod_Exception_Literal();

	/**
	 * Returns the meta object for the attribute '{@link Spice.XMod_Exception#getFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter</em>'.
	 * @see Spice.XMod_Exception#getFilter()
	 * @see #getXMod_Exception()
	 * @generated
	 */
	EAttribute getXMod_Exception_Filter();

	/**
	 * Returns the meta object for the attribute '{@link Spice.XMod_Exception#getReaction <em>Reaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reaction</em>'.
	 * @see Spice.XMod_Exception#getReaction()
	 * @see #getXMod_Exception()
	 * @generated
	 */
	EAttribute getXMod_Exception_Reaction();

	/**
	 * Returns the meta object for the containment reference '{@link Spice.XMod_Exception#getCalledOperation <em>Called Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Called Operation</em>'.
	 * @see Spice.XMod_Exception#getCalledOperation()
	 * @see #getXMod_Exception()
	 * @generated
	 */
	EReference getXMod_Exception_CalledOperation();

	/**
	 * Returns the meta object for class '{@link Spice.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see Spice.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link Spice.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Spice.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the meta object for enum '{@link Spice.XMod_ExceptionReaction <em>XMod Exception Reaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>XMod Exception Reaction</em>'.
	 * @see Spice.XMod_ExceptionReaction
	 * @generated
	 */
	EEnum getXMod_ExceptionReaction();

	/**
	 * Returns the meta object for enum '{@link Spice.XMod_ExceptionLiteral <em>XMod Exception Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>XMod Exception Literal</em>'.
	 * @see Spice.XMod_ExceptionLiteral
	 * @generated
	 */
	EEnum getXMod_ExceptionLiteral();

	/**
	 * Returns the meta object for class '{@link Spice.Attribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute</em>'.
	 * @see Spice.Attribute
	 * @generated
	 */
	EClass getAttribute();

	/**
	 * Returns the meta object for the attribute '{@link Spice.Attribute#isIsObservable <em>Is Observable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Observable</em>'.
	 * @see Spice.Attribute#isIsObservable()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_IsObservable();

	/**
	 * Returns the meta object for the attribute '{@link Spice.Attribute#getMultiplicity <em>Multiplicity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multiplicity</em>'.
	 * @see Spice.Attribute#getMultiplicity()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Multiplicity();

	/**
	 * Returns the meta object for the attribute '{@link Spice.Attribute#isIsOutput <em>Is Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Output</em>'.
	 * @see Spice.Attribute#isIsOutput()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_IsOutput();

	/**
	 * Returns the meta object for the attribute '{@link Spice.Attribute#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see Spice.Attribute#getType()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Type();

	/**
	 * Returns the meta object for the containment reference '{@link Spice.Attribute#getData <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Data</em>'.
	 * @see Spice.Attribute#getData()
	 * @see #getAttribute()
	 * @generated
	 */
	EReference getAttribute_Data();

	/**
	 * Returns the meta object for class '{@link Spice.StaticAttribute <em>Static Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Static Attribute</em>'.
	 * @see Spice.StaticAttribute
	 * @generated
	 */
	EClass getStaticAttribute();

	/**
	 * Returns the meta object for class '{@link Spice.DynamicAttribute <em>Dynamic Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dynamic Attribute</em>'.
	 * @see Spice.DynamicAttribute
	 * @generated
	 */
	EClass getDynamicAttribute();

	/**
	 * Returns the meta object for the reference '{@link Spice.DynamicAttribute#getInitial <em>Initial</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Initial</em>'.
	 * @see Spice.DynamicAttribute#getInitial()
	 * @see #getDynamicAttribute()
	 * @generated
	 */
	EReference getDynamicAttribute_Initial();

	/**
	 * Returns the meta object for the containment reference '{@link Spice.DynamicAttribute#getNewData <em>New Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>New Data</em>'.
	 * @see Spice.DynamicAttribute#getNewData()
	 * @see #getDynamicAttribute()
	 * @generated
	 */
	EReference getDynamicAttribute_NewData();

	/**
	 * Returns the meta object for class '{@link Spice.Data <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data</em>'.
	 * @see Spice.Data
	 * @generated
	 */
	EClass getData();

	/**
	 * Returns the meta object for the '{@link Spice.Data#getDataValue() <em>Get Data Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Data Value</em>' operation.
	 * @see Spice.Data#getDataValue()
	 * @generated
	 */
	EOperation getData__GetDataValue();

	/**
	 * Returns the meta object for the '{@link Spice.Data#setDataValue(org.eclipse.emf.common.util.EList) <em>Set Data Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Data Value</em>' operation.
	 * @see Spice.Data#setDataValue(org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getData__SetDataValue__EList();

	/**
	 * Returns the meta object for class '{@link Spice.BooleanData <em>Boolean Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Data</em>'.
	 * @see Spice.BooleanData
	 * @generated
	 */
	EClass getBooleanData();

	/**
	 * Returns the meta object for the attribute list '{@link Spice.BooleanData#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Value</em>'.
	 * @see Spice.BooleanData#getValue()
	 * @see #getBooleanData()
	 * @generated
	 */
	EAttribute getBooleanData_Value();

	/**
	 * Returns the meta object for class '{@link Spice.DoubleData <em>Double Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Double Data</em>'.
	 * @see Spice.DoubleData
	 * @generated
	 */
	EClass getDoubleData();

	/**
	 * Returns the meta object for the attribute list '{@link Spice.DoubleData#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Value</em>'.
	 * @see Spice.DoubleData#getValue()
	 * @see #getDoubleData()
	 * @generated
	 */
	EAttribute getDoubleData_Value();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SpiceFactory getSpiceFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link Spice.impl.SimulationImpl <em>Simulation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Spice.impl.SimulationImpl
		 * @see Spice.impl.SpicePackageImpl#getSimulation()
		 * @generated
		 */
		EClass SIMULATION = eINSTANCE.getSimulation();

		/**
		 * The meta object literal for the '<em><b>Start Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMULATION__START_TIME = eINSTANCE.getSimulation_StartTime();

		/**
		 * The meta object literal for the '<em><b>End Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMULATION__END_TIME = eINSTANCE.getSimulation_EndTime();

		/**
		 * The meta object literal for the '<em><b>Duration Step</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMULATION__DURATION_STEP = eINSTANCE.getSimulation_DurationStep();

		/**
		 * The meta object literal for the '<em><b>Components</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIMULATION__COMPONENTS = eINSTANCE.getSimulation_Components();

		/**
		 * The meta object literal for the '<em><b>Views</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIMULATION__VIEWS = eINSTANCE.getSimulation_Views();

		/**
		 * The meta object literal for the '<em><b>Adapters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIMULATION__ADAPTERS = eINSTANCE.getSimulation_Adapters();

		/**
		 * The meta object literal for the '<em><b>Run</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SIMULATION___RUN = eINSTANCE.getSimulation__Run();

		/**
		 * The meta object literal for the '<em><b>Init</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SIMULATION___INIT = eINSTANCE.getSimulation__Init();

		/**
		 * The meta object literal for the '{@link Spice.impl.ComponentImpl <em>Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Spice.impl.ComponentImpl
		 * @see Spice.impl.SpicePackageImpl#getComponent()
		 * @generated
		 */
		EClass COMPONENT = eINSTANCE.getComponent();

		/**
		 * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__ATTRIBUTES = eINSTANCE.getComponent_Attributes();

		/**
		 * The meta object literal for the '<em><b>Actions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__ACTIONS = eINSTANCE.getComponent_Actions();

		/**
		 * The meta object literal for the '<em><b>Init</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COMPONENT___INIT = eINSTANCE.getComponent__Init();

		/**
		 * The meta object literal for the '{@link Spice.impl.ExecutableComponentImpl <em>Executable Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Spice.impl.ExecutableComponentImpl
		 * @see Spice.impl.SpicePackageImpl#getExecutableComponent()
		 * @generated
		 */
		EClass EXECUTABLE_COMPONENT = eINSTANCE.getExecutableComponent();

		/**
		 * The meta object literal for the '<em><b>Period</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXECUTABLE_COMPONENT__PERIOD = eINSTANCE.getExecutableComponent_Period();

		/**
		 * The meta object literal for the '<em><b>Priority</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXECUTABLE_COMPONENT__PRIORITY = eINSTANCE.getExecutableComponent_Priority();

		/**
		 * The meta object literal for the '<em><b>Services</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXECUTABLE_COMPONENT__SERVICES = eINSTANCE.getExecutableComponent_Services();

		/**
		 * The meta object literal for the '<em><b>Is Data Flow</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXECUTABLE_COMPONENT__IS_DATA_FLOW = eINSTANCE.getExecutableComponent_IsDataFlow();

		/**
		 * The meta object literal for the '<em><b>Do Step</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EXECUTABLE_COMPONENT___DO_STEP = eINSTANCE.getExecutableComponent__DoStep();

		/**
		 * The meta object literal for the '<em><b>Update</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EXECUTABLE_COMPONENT___UPDATE = eINSTANCE.getExecutableComponent__Update();

		/**
		 * The meta object literal for the '{@link Spice.impl.ServiceComponentImpl <em>Service Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Spice.impl.ServiceComponentImpl
		 * @see Spice.impl.SpicePackageImpl#getServiceComponent()
		 * @generated
		 */
		EClass SERVICE_COMPONENT = eINSTANCE.getServiceComponent();

		/**
		 * The meta object literal for the '{@link Spice.impl.ViewImpl <em>View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Spice.impl.ViewImpl
		 * @see Spice.impl.SpicePackageImpl#getView()
		 * @generated
		 */
		EClass VIEW = eINSTANCE.getView();

		/**
		 * The meta object literal for the '<em><b>Remote Driven</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIEW__REMOTE_DRIVEN = eINSTANCE.getView_RemoteDriven();

		/**
		 * The meta object literal for the '<em><b>Host</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIEW__HOST = eINSTANCE.getView_Host();

		/**
		 * The meta object literal for the '<em><b>Port</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIEW__PORT = eINSTANCE.getView_Port();

		/**
		 * The meta object literal for the '<em><b>Period</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIEW__PERIOD = eINSTANCE.getView_Period();

		/**
		 * The meta object literal for the '<em><b>Services</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIEW__SERVICES = eINSTANCE.getView_Services();

		/**
		 * The meta object literal for the '<em><b>Adapters</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIEW__ADAPTERS = eINSTANCE.getView_Adapters();

		/**
		 * The meta object literal for the '<em><b>Observed Tags</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIEW__OBSERVED_TAGS = eINSTANCE.getView_ObservedTags();

		/**
		 * The meta object literal for the '<em><b>Start</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation VIEW___START = eINSTANCE.getView__Start();

		/**
		 * The meta object literal for the '<em><b>Update</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation VIEW___UPDATE = eINSTANCE.getView__Update();

		/**
		 * The meta object literal for the '{@link Spice.impl.AdapterImpl <em>Adapter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Spice.impl.AdapterImpl
		 * @see Spice.impl.SpicePackageImpl#getAdapter()
		 * @generated
		 */
		EClass ADAPTER = eINSTANCE.getAdapter();

		/**
		 * The meta object literal for the '<em><b>Is Adaptable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADAPTER__IS_ADAPTABLE = eINSTANCE.getAdapter_IsAdaptable();

		/**
		 * The meta object literal for the '<em><b>Data</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADAPTER__DATA = eINSTANCE.getAdapter_Data();

		/**
		 * The meta object literal for the '<em><b>Attributes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADAPTER__ATTRIBUTES = eINSTANCE.getAdapter_Attributes();

		/**
		 * The meta object literal for the '<em><b>Action</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADAPTER__ACTION = eINSTANCE.getAdapter_Action();

		/**
		 * The meta object literal for the '<em><b>Adapt</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ADAPTER___ADAPT = eINSTANCE.getAdapter__Adapt();

		/**
		 * The meta object literal for the '{@link Spice.impl.XMod_ActionImpl <em>XMod Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Spice.impl.XMod_ActionImpl
		 * @see Spice.impl.SpicePackageImpl#getXMod_Action()
		 * @generated
		 */
		EClass XMOD_ACTION = eINSTANCE.getXMod_Action();

		/**
		 * The meta object literal for the '<em><b>Operations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XMOD_ACTION__OPERATIONS = eINSTANCE.getXMod_Action_Operations();

		/**
		 * The meta object literal for the '<em><b>Execute</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation XMOD_ACTION___EXECUTE = eINSTANCE.getXMod_Action__Execute();

		/**
		 * The meta object literal for the '{@link Spice.impl.XMod_OperationImpl <em>XMod Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Spice.impl.XMod_OperationImpl
		 * @see Spice.impl.SpicePackageImpl#getXMod_Operation()
		 * @generated
		 */
		EClass XMOD_OPERATION = eINSTANCE.getXMod_Operation();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XMOD_OPERATION__NAME = eINSTANCE.getXMod_Operation_Name();

		/**
		 * The meta object literal for the '<em><b>Object Tag</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XMOD_OPERATION__OBJECT_TAG = eINSTANCE.getXMod_Operation_ObjectTag();

		/**
		 * The meta object literal for the '<em><b>Parameters Tag</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XMOD_OPERATION__PARAMETERS_TAG = eINSTANCE.getXMod_Operation_ParametersTag();

		/**
		 * The meta object literal for the '<em><b>Return Tag</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XMOD_OPERATION__RETURN_TAG = eINSTANCE.getXMod_Operation_ReturnTag();

		/**
		 * The meta object literal for the '<em><b>Exceptions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XMOD_OPERATION__EXCEPTIONS = eINSTANCE.getXMod_Operation_Exceptions();

		/**
		 * The meta object literal for the '<em><b>Call Operation</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation XMOD_OPERATION___CALL_OPERATION = eINSTANCE.getXMod_Operation__CallOperation();

		/**
		 * The meta object literal for the '{@link Spice.impl.XMod_ElementImpl <em>XMod Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Spice.impl.XMod_ElementImpl
		 * @see Spice.impl.SpicePackageImpl#getXMod_Element()
		 * @generated
		 */
		EClass XMOD_ELEMENT = eINSTANCE.getXMod_Element();

		/**
		 * The meta object literal for the '<em><b>Xmod id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XMOD_ELEMENT__XMOD_ID = eINSTANCE.getXMod_Element_Xmod_id();

		/**
		 * The meta object literal for the '{@link Spice.impl.XMod_ExceptionImpl <em>XMod Exception</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Spice.impl.XMod_ExceptionImpl
		 * @see Spice.impl.SpicePackageImpl#getXMod_Exception()
		 * @generated
		 */
		EClass XMOD_EXCEPTION = eINSTANCE.getXMod_Exception();

		/**
		 * The meta object literal for the '<em><b>Literal</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XMOD_EXCEPTION__LITERAL = eINSTANCE.getXMod_Exception_Literal();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XMOD_EXCEPTION__FILTER = eINSTANCE.getXMod_Exception_Filter();

		/**
		 * The meta object literal for the '<em><b>Reaction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XMOD_EXCEPTION__REACTION = eINSTANCE.getXMod_Exception_Reaction();

		/**
		 * The meta object literal for the '<em><b>Called Operation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XMOD_EXCEPTION__CALLED_OPERATION = eINSTANCE.getXMod_Exception_CalledOperation();

		/**
		 * The meta object literal for the '{@link Spice.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Spice.impl.NamedElementImpl
		 * @see Spice.impl.SpicePackageImpl#getNamedElement()
		 * @generated
		 */
		EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__NAME = eINSTANCE.getNamedElement_Name();

		/**
		 * The meta object literal for the '{@link Spice.XMod_ExceptionReaction <em>XMod Exception Reaction</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Spice.XMod_ExceptionReaction
		 * @see Spice.impl.SpicePackageImpl#getXMod_ExceptionReaction()
		 * @generated
		 */
		EEnum XMOD_EXCEPTION_REACTION = eINSTANCE.getXMod_ExceptionReaction();

		/**
		 * The meta object literal for the '{@link Spice.XMod_ExceptionLiteral <em>XMod Exception Literal</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Spice.XMod_ExceptionLiteral
		 * @see Spice.impl.SpicePackageImpl#getXMod_ExceptionLiteral()
		 * @generated
		 */
		EEnum XMOD_EXCEPTION_LITERAL = eINSTANCE.getXMod_ExceptionLiteral();

		/**
		 * The meta object literal for the '{@link Spice.impl.AttributeImpl <em>Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Spice.impl.AttributeImpl
		 * @see Spice.impl.SpicePackageImpl#getAttribute()
		 * @generated
		 */
		EClass ATTRIBUTE = eINSTANCE.getAttribute();

		/**
		 * The meta object literal for the '<em><b>Is Observable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__IS_OBSERVABLE = eINSTANCE.getAttribute_IsObservable();

		/**
		 * The meta object literal for the '<em><b>Multiplicity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__MULTIPLICITY = eINSTANCE.getAttribute_Multiplicity();

		/**
		 * The meta object literal for the '<em><b>Is Output</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__IS_OUTPUT = eINSTANCE.getAttribute_IsOutput();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__TYPE = eINSTANCE.getAttribute_Type();

		/**
		 * The meta object literal for the '<em><b>Data</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE__DATA = eINSTANCE.getAttribute_Data();

		/**
		 * The meta object literal for the '{@link Spice.impl.StaticAttributeImpl <em>Static Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Spice.impl.StaticAttributeImpl
		 * @see Spice.impl.SpicePackageImpl#getStaticAttribute()
		 * @generated
		 */
		EClass STATIC_ATTRIBUTE = eINSTANCE.getStaticAttribute();

		/**
		 * The meta object literal for the '{@link Spice.impl.DynamicAttributeImpl <em>Dynamic Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Spice.impl.DynamicAttributeImpl
		 * @see Spice.impl.SpicePackageImpl#getDynamicAttribute()
		 * @generated
		 */
		EClass DYNAMIC_ATTRIBUTE = eINSTANCE.getDynamicAttribute();

		/**
		 * The meta object literal for the '<em><b>Initial</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DYNAMIC_ATTRIBUTE__INITIAL = eINSTANCE.getDynamicAttribute_Initial();

		/**
		 * The meta object literal for the '<em><b>New Data</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DYNAMIC_ATTRIBUTE__NEW_DATA = eINSTANCE.getDynamicAttribute_NewData();

		/**
		 * The meta object literal for the '{@link Spice.impl.DataImpl <em>Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Spice.impl.DataImpl
		 * @see Spice.impl.SpicePackageImpl#getData()
		 * @generated
		 */
		EClass DATA = eINSTANCE.getData();

		/**
		 * The meta object literal for the '<em><b>Get Data Value</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA___GET_DATA_VALUE = eINSTANCE.getData__GetDataValue();

		/**
		 * The meta object literal for the '<em><b>Set Data Value</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA___SET_DATA_VALUE__ELIST = eINSTANCE.getData__SetDataValue__EList();

		/**
		 * The meta object literal for the '{@link Spice.impl.BooleanDataImpl <em>Boolean Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Spice.impl.BooleanDataImpl
		 * @see Spice.impl.SpicePackageImpl#getBooleanData()
		 * @generated
		 */
		EClass BOOLEAN_DATA = eINSTANCE.getBooleanData();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOLEAN_DATA__VALUE = eINSTANCE.getBooleanData_Value();

		/**
		 * The meta object literal for the '{@link Spice.impl.DoubleDataImpl <em>Double Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Spice.impl.DoubleDataImpl
		 * @see Spice.impl.SpicePackageImpl#getDoubleData()
		 * @generated
		 */
		EClass DOUBLE_DATA = eINSTANCE.getDoubleData();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOUBLE_DATA__VALUE = eINSTANCE.getDoubleData_Value();

	}

} //SpicePackage
