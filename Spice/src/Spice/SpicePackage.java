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
	 * The meta object id for the '{@link Spice.impl.Xmod_ElementImpl <em>Xmod Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Spice.impl.Xmod_ElementImpl
	 * @see Spice.impl.SpicePackageImpl#getXmod_Element()
	 * @generated
	 */
	int XMOD_ELEMENT = 10;

	/**
	 * The feature id for the '<em><b>Xmod id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XMOD_ELEMENT__XMOD_ID = 0;

	/**
	 * The number of structural features of the '<em>Xmod Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XMOD_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Xmod Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XMOD_ELEMENT_OPERATION_COUNT = 0;

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
	 * The number of structural features of the '<em>Simulation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATION_FEATURE_COUNT = XMOD_ELEMENT_FEATURE_COUNT + 5;

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
	 * The feature id for the '<em><b>Period</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__PERIOD = XMOD_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__PRIORITY = XMOD_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is Data Flow</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__IS_DATA_FLOW = XMOD_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__ATTRIBUTES = XMOD_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__ACTIONS = XMOD_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_FEATURE_COUNT = XMOD_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>Do Step</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT___DO_STEP = XMOD_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT___UPDATE = XMOD_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_OPERATION_COUNT = XMOD_ELEMENT_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link Spice.impl.ViewImpl <em>View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Spice.impl.ViewImpl
	 * @see Spice.impl.SpicePackageImpl#getView()
	 * @generated
	 */
	int VIEW = 2;

	/**
	 * The feature id for the '<em><b>Xmod id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW__XMOD_ID = XMOD_ELEMENT__XMOD_ID;

	/**
	 * The feature id for the '<em><b>Host</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW__HOST = XMOD_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW__PORT = XMOD_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Period</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW__PERIOD = XMOD_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Observed Tags</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW__OBSERVED_TAGS = XMOD_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_FEATURE_COUNT = XMOD_ELEMENT_FEATURE_COUNT + 4;

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
	 * The meta object id for the '{@link Spice.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Spice.impl.NamedElementImpl
	 * @see Spice.impl.SpicePackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 4;

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
	 * The meta object id for the '{@link Spice.impl.AttributeImpl <em>Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Spice.impl.AttributeImpl
	 * @see Spice.impl.SpicePackageImpl#getAttribute()
	 * @generated
	 */
	int ATTRIBUTE = 3;

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
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__TYPE = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Multiplicity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__MULTIPLICITY = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Spice.impl.BasicAttributeImpl <em>Basic Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Spice.impl.BasicAttributeImpl
	 * @see Spice.impl.SpicePackageImpl#getBasicAttribute()
	 * @generated
	 */
	int BASIC_ATTRIBUTE = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_ATTRIBUTE__NAME = ATTRIBUTE__NAME;

	/**
	 * The feature id for the '<em><b>Is Observable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_ATTRIBUTE__IS_OBSERVABLE = ATTRIBUTE__IS_OBSERVABLE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_ATTRIBUTE__TYPE = ATTRIBUTE__TYPE;

	/**
	 * The feature id for the '<em><b>Multiplicity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_ATTRIBUTE__MULTIPLICITY = ATTRIBUTE__MULTIPLICITY;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_ATTRIBUTE__VALUE = ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>New Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_ATTRIBUTE__NEW_VALUE = ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Basic Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_ATTRIBUTE_FEATURE_COUNT = ATTRIBUTE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Basic Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_ATTRIBUTE_OPERATION_COUNT = ATTRIBUTE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Spice.impl.ArrayAttributeImpl <em>Array Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Spice.impl.ArrayAttributeImpl
	 * @see Spice.impl.SpicePackageImpl#getArrayAttribute()
	 * @generated
	 */
	int ARRAY_ATTRIBUTE = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_ATTRIBUTE__NAME = ATTRIBUTE__NAME;

	/**
	 * The feature id for the '<em><b>Is Observable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_ATTRIBUTE__IS_OBSERVABLE = ATTRIBUTE__IS_OBSERVABLE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_ATTRIBUTE__TYPE = ATTRIBUTE__TYPE;

	/**
	 * The feature id for the '<em><b>Multiplicity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_ATTRIBUTE__MULTIPLICITY = ATTRIBUTE__MULTIPLICITY;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_ATTRIBUTE__VALUE = ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>New Value</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_ATTRIBUTE__NEW_VALUE = ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Array Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_ATTRIBUTE_FEATURE_COUNT = ATTRIBUTE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Array Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_ATTRIBUTE_OPERATION_COUNT = ATTRIBUTE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Spice.impl.Xmod_ExceptionImpl <em>Xmod Exception</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Spice.impl.Xmod_ExceptionImpl
	 * @see Spice.impl.SpicePackageImpl#getXmod_Exception()
	 * @generated
	 */
	int XMOD_EXCEPTION = 7;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XMOD_EXCEPTION__KIND = 0;

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
	 * The number of structural features of the '<em>Xmod Exception</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XMOD_EXCEPTION_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Xmod Exception</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XMOD_EXCEPTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Spice.impl.Xmod_ActionImpl <em>Xmod Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Spice.impl.Xmod_ActionImpl
	 * @see Spice.impl.SpicePackageImpl#getXmod_Action()
	 * @generated
	 */
	int XMOD_ACTION = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XMOD_ACTION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Operations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XMOD_ACTION__OPERATIONS = 1;

	/**
	 * The number of structural features of the '<em>Xmod Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XMOD_ACTION_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>Execute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XMOD_ACTION___EXECUTE = 0;

	/**
	 * The number of operations of the '<em>Xmod Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XMOD_ACTION_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link Spice.impl.Xmod_OperationImpl <em>Xmod Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Spice.impl.Xmod_OperationImpl
	 * @see Spice.impl.SpicePackageImpl#getXmod_Operation()
	 * @generated
	 */
	int XMOD_OPERATION = 9;

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
	 * The number of structural features of the '<em>Xmod Operation</em>' class.
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
	 * The number of operations of the '<em>Xmod Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XMOD_OPERATION_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link Spice.Xmod_ExceptionReaction <em>Xmod Exception Reaction</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Spice.Xmod_ExceptionReaction
	 * @see Spice.impl.SpicePackageImpl#getXmod_ExceptionReaction()
	 * @generated
	 */
	int XMOD_EXCEPTION_REACTION = 11;

	/**
	 * The meta object id for the '{@link Spice.Xmod_ExceptionKind <em>Xmod Exception Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Spice.Xmod_ExceptionKind
	 * @see Spice.impl.SpicePackageImpl#getXmod_ExceptionKind()
	 * @generated
	 */
	int XMOD_EXCEPTION_KIND = 12;


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
	 * Returns the meta object for the '{@link Spice.Simulation#run() <em>Run</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Run</em>' operation.
	 * @see Spice.Simulation#run()
	 * @generated
	 */
	EOperation getSimulation__Run();

	/**
	 * Returns the meta object for the '{@link Spice.Simulation#init() <em>Init</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Init</em>' operation.
	 * @see Spice.Simulation#init()
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
	 * Returns the meta object for the attribute '{@link Spice.Component#getPeriod <em>Period</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Period</em>'.
	 * @see Spice.Component#getPeriod()
	 * @see #getComponent()
	 * @generated
	 */
	EAttribute getComponent_Period();

	/**
	 * Returns the meta object for the attribute '{@link Spice.Component#getPriority <em>Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Priority</em>'.
	 * @see Spice.Component#getPriority()
	 * @see #getComponent()
	 * @generated
	 */
	EAttribute getComponent_Priority();

	/**
	 * Returns the meta object for the attribute '{@link Spice.Component#isIsDataFlow <em>Is Data Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Data Flow</em>'.
	 * @see Spice.Component#isIsDataFlow()
	 * @see #getComponent()
	 * @generated
	 */
	EAttribute getComponent_IsDataFlow();

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
	 * Returns the meta object for the '{@link Spice.Component#doStep() <em>Do Step</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Do Step</em>' operation.
	 * @see Spice.Component#doStep()
	 * @generated
	 */
	EOperation getComponent__DoStep();

	/**
	 * Returns the meta object for the '{@link Spice.Component#update() <em>Update</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Update</em>' operation.
	 * @see Spice.Component#update()
	 * @generated
	 */
	EOperation getComponent__Update();

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
	 * Returns the meta object for class '{@link Spice.BasicAttribute <em>Basic Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Basic Attribute</em>'.
	 * @see Spice.BasicAttribute
	 * @generated
	 */
	EClass getBasicAttribute();

	/**
	 * Returns the meta object for the attribute '{@link Spice.BasicAttribute#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see Spice.BasicAttribute#getValue()
	 * @see #getBasicAttribute()
	 * @generated
	 */
	EAttribute getBasicAttribute_Value();

	/**
	 * Returns the meta object for the attribute '{@link Spice.BasicAttribute#getNewValue <em>New Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New Value</em>'.
	 * @see Spice.BasicAttribute#getNewValue()
	 * @see #getBasicAttribute()
	 * @generated
	 */
	EAttribute getBasicAttribute_NewValue();

	/**
	 * Returns the meta object for class '{@link Spice.ArrayAttribute <em>Array Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Array Attribute</em>'.
	 * @see Spice.ArrayAttribute
	 * @generated
	 */
	EClass getArrayAttribute();

	/**
	 * Returns the meta object for the attribute list '{@link Spice.ArrayAttribute#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Value</em>'.
	 * @see Spice.ArrayAttribute#getValue()
	 * @see #getArrayAttribute()
	 * @generated
	 */
	EAttribute getArrayAttribute_Value();

	/**
	 * Returns the meta object for the attribute list '{@link Spice.ArrayAttribute#getNewValue <em>New Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>New Value</em>'.
	 * @see Spice.ArrayAttribute#getNewValue()
	 * @see #getArrayAttribute()
	 * @generated
	 */
	EAttribute getArrayAttribute_NewValue();

	/**
	 * Returns the meta object for class '{@link Spice.Xmod_Exception <em>Xmod Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Xmod Exception</em>'.
	 * @see Spice.Xmod_Exception
	 * @generated
	 */
	EClass getXmod_Exception();

	/**
	 * Returns the meta object for the attribute '{@link Spice.Xmod_Exception#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see Spice.Xmod_Exception#getKind()
	 * @see #getXmod_Exception()
	 * @generated
	 */
	EAttribute getXmod_Exception_Kind();

	/**
	 * Returns the meta object for the attribute '{@link Spice.Xmod_Exception#getFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter</em>'.
	 * @see Spice.Xmod_Exception#getFilter()
	 * @see #getXmod_Exception()
	 * @generated
	 */
	EAttribute getXmod_Exception_Filter();

	/**
	 * Returns the meta object for the attribute '{@link Spice.Xmod_Exception#getReaction <em>Reaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reaction</em>'.
	 * @see Spice.Xmod_Exception#getReaction()
	 * @see #getXmod_Exception()
	 * @generated
	 */
	EAttribute getXmod_Exception_Reaction();

	/**
	 * Returns the meta object for the containment reference '{@link Spice.Xmod_Exception#getCalledOperation <em>Called Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Called Operation</em>'.
	 * @see Spice.Xmod_Exception#getCalledOperation()
	 * @see #getXmod_Exception()
	 * @generated
	 */
	EReference getXmod_Exception_CalledOperation();

	/**
	 * Returns the meta object for class '{@link Spice.Xmod_Action <em>Xmod Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Xmod Action</em>'.
	 * @see Spice.Xmod_Action
	 * @generated
	 */
	EClass getXmod_Action();

	/**
	 * Returns the meta object for the attribute '{@link Spice.Xmod_Action#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Spice.Xmod_Action#getName()
	 * @see #getXmod_Action()
	 * @generated
	 */
	EAttribute getXmod_Action_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link Spice.Xmod_Action#getOperations <em>Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Operations</em>'.
	 * @see Spice.Xmod_Action#getOperations()
	 * @see #getXmod_Action()
	 * @generated
	 */
	EReference getXmod_Action_Operations();

	/**
	 * Returns the meta object for the '{@link Spice.Xmod_Action#execute() <em>Execute</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Execute</em>' operation.
	 * @see Spice.Xmod_Action#execute()
	 * @generated
	 */
	EOperation getXmod_Action__Execute();

	/**
	 * Returns the meta object for class '{@link Spice.Xmod_Operation <em>Xmod Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Xmod Operation</em>'.
	 * @see Spice.Xmod_Operation
	 * @generated
	 */
	EClass getXmod_Operation();

	/**
	 * Returns the meta object for the attribute '{@link Spice.Xmod_Operation#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Spice.Xmod_Operation#getName()
	 * @see #getXmod_Operation()
	 * @generated
	 */
	EAttribute getXmod_Operation_Name();

	/**
	 * Returns the meta object for the attribute '{@link Spice.Xmod_Operation#getObjectTag <em>Object Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Object Tag</em>'.
	 * @see Spice.Xmod_Operation#getObjectTag()
	 * @see #getXmod_Operation()
	 * @generated
	 */
	EAttribute getXmod_Operation_ObjectTag();

	/**
	 * Returns the meta object for the attribute list '{@link Spice.Xmod_Operation#getParametersTag <em>Parameters Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Parameters Tag</em>'.
	 * @see Spice.Xmod_Operation#getParametersTag()
	 * @see #getXmod_Operation()
	 * @generated
	 */
	EAttribute getXmod_Operation_ParametersTag();

	/**
	 * Returns the meta object for the attribute '{@link Spice.Xmod_Operation#getReturnTag <em>Return Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Return Tag</em>'.
	 * @see Spice.Xmod_Operation#getReturnTag()
	 * @see #getXmod_Operation()
	 * @generated
	 */
	EAttribute getXmod_Operation_ReturnTag();

	/**
	 * Returns the meta object for the containment reference list '{@link Spice.Xmod_Operation#getExceptions <em>Exceptions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Exceptions</em>'.
	 * @see Spice.Xmod_Operation#getExceptions()
	 * @see #getXmod_Operation()
	 * @generated
	 */
	EReference getXmod_Operation_Exceptions();

	/**
	 * Returns the meta object for the '{@link Spice.Xmod_Operation#callOperation() <em>Call Operation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Call Operation</em>' operation.
	 * @see Spice.Xmod_Operation#callOperation()
	 * @generated
	 */
	EOperation getXmod_Operation__CallOperation();

	/**
	 * Returns the meta object for class '{@link Spice.Xmod_Element <em>Xmod Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Xmod Element</em>'.
	 * @see Spice.Xmod_Element
	 * @generated
	 */
	EClass getXmod_Element();

	/**
	 * Returns the meta object for the attribute '{@link Spice.Xmod_Element#getXmod_id <em>Xmod id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Xmod id</em>'.
	 * @see Spice.Xmod_Element#getXmod_id()
	 * @see #getXmod_Element()
	 * @generated
	 */
	EAttribute getXmod_Element_Xmod_id();

	/**
	 * Returns the meta object for enum '{@link Spice.Xmod_ExceptionReaction <em>Xmod Exception Reaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Xmod Exception Reaction</em>'.
	 * @see Spice.Xmod_ExceptionReaction
	 * @generated
	 */
	EEnum getXmod_ExceptionReaction();

	/**
	 * Returns the meta object for enum '{@link Spice.Xmod_ExceptionKind <em>Xmod Exception Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Xmod Exception Kind</em>'.
	 * @see Spice.Xmod_ExceptionKind
	 * @generated
	 */
	EEnum getXmod_ExceptionKind();

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
		 * The meta object literal for the '<em><b>Period</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT__PERIOD = eINSTANCE.getComponent_Period();

		/**
		 * The meta object literal for the '<em><b>Priority</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT__PRIORITY = eINSTANCE.getComponent_Priority();

		/**
		 * The meta object literal for the '<em><b>Is Data Flow</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT__IS_DATA_FLOW = eINSTANCE.getComponent_IsDataFlow();

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
		 * The meta object literal for the '<em><b>Do Step</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COMPONENT___DO_STEP = eINSTANCE.getComponent__DoStep();

		/**
		 * The meta object literal for the '<em><b>Update</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COMPONENT___UPDATE = eINSTANCE.getComponent__Update();

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
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__TYPE = eINSTANCE.getAttribute_Type();

		/**
		 * The meta object literal for the '<em><b>Multiplicity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__MULTIPLICITY = eINSTANCE.getAttribute_Multiplicity();

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
		 * The meta object literal for the '{@link Spice.impl.BasicAttributeImpl <em>Basic Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Spice.impl.BasicAttributeImpl
		 * @see Spice.impl.SpicePackageImpl#getBasicAttribute()
		 * @generated
		 */
		EClass BASIC_ATTRIBUTE = eINSTANCE.getBasicAttribute();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BASIC_ATTRIBUTE__VALUE = eINSTANCE.getBasicAttribute_Value();

		/**
		 * The meta object literal for the '<em><b>New Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BASIC_ATTRIBUTE__NEW_VALUE = eINSTANCE.getBasicAttribute_NewValue();

		/**
		 * The meta object literal for the '{@link Spice.impl.ArrayAttributeImpl <em>Array Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Spice.impl.ArrayAttributeImpl
		 * @see Spice.impl.SpicePackageImpl#getArrayAttribute()
		 * @generated
		 */
		EClass ARRAY_ATTRIBUTE = eINSTANCE.getArrayAttribute();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARRAY_ATTRIBUTE__VALUE = eINSTANCE.getArrayAttribute_Value();

		/**
		 * The meta object literal for the '<em><b>New Value</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARRAY_ATTRIBUTE__NEW_VALUE = eINSTANCE.getArrayAttribute_NewValue();

		/**
		 * The meta object literal for the '{@link Spice.impl.Xmod_ExceptionImpl <em>Xmod Exception</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Spice.impl.Xmod_ExceptionImpl
		 * @see Spice.impl.SpicePackageImpl#getXmod_Exception()
		 * @generated
		 */
		EClass XMOD_EXCEPTION = eINSTANCE.getXmod_Exception();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XMOD_EXCEPTION__KIND = eINSTANCE.getXmod_Exception_Kind();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XMOD_EXCEPTION__FILTER = eINSTANCE.getXmod_Exception_Filter();

		/**
		 * The meta object literal for the '<em><b>Reaction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XMOD_EXCEPTION__REACTION = eINSTANCE.getXmod_Exception_Reaction();

		/**
		 * The meta object literal for the '<em><b>Called Operation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XMOD_EXCEPTION__CALLED_OPERATION = eINSTANCE.getXmod_Exception_CalledOperation();

		/**
		 * The meta object literal for the '{@link Spice.impl.Xmod_ActionImpl <em>Xmod Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Spice.impl.Xmod_ActionImpl
		 * @see Spice.impl.SpicePackageImpl#getXmod_Action()
		 * @generated
		 */
		EClass XMOD_ACTION = eINSTANCE.getXmod_Action();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XMOD_ACTION__NAME = eINSTANCE.getXmod_Action_Name();

		/**
		 * The meta object literal for the '<em><b>Operations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XMOD_ACTION__OPERATIONS = eINSTANCE.getXmod_Action_Operations();

		/**
		 * The meta object literal for the '<em><b>Execute</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation XMOD_ACTION___EXECUTE = eINSTANCE.getXmod_Action__Execute();

		/**
		 * The meta object literal for the '{@link Spice.impl.Xmod_OperationImpl <em>Xmod Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Spice.impl.Xmod_OperationImpl
		 * @see Spice.impl.SpicePackageImpl#getXmod_Operation()
		 * @generated
		 */
		EClass XMOD_OPERATION = eINSTANCE.getXmod_Operation();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XMOD_OPERATION__NAME = eINSTANCE.getXmod_Operation_Name();

		/**
		 * The meta object literal for the '<em><b>Object Tag</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XMOD_OPERATION__OBJECT_TAG = eINSTANCE.getXmod_Operation_ObjectTag();

		/**
		 * The meta object literal for the '<em><b>Parameters Tag</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XMOD_OPERATION__PARAMETERS_TAG = eINSTANCE.getXmod_Operation_ParametersTag();

		/**
		 * The meta object literal for the '<em><b>Return Tag</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XMOD_OPERATION__RETURN_TAG = eINSTANCE.getXmod_Operation_ReturnTag();

		/**
		 * The meta object literal for the '<em><b>Exceptions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XMOD_OPERATION__EXCEPTIONS = eINSTANCE.getXmod_Operation_Exceptions();

		/**
		 * The meta object literal for the '<em><b>Call Operation</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation XMOD_OPERATION___CALL_OPERATION = eINSTANCE.getXmod_Operation__CallOperation();

		/**
		 * The meta object literal for the '{@link Spice.impl.Xmod_ElementImpl <em>Xmod Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Spice.impl.Xmod_ElementImpl
		 * @see Spice.impl.SpicePackageImpl#getXmod_Element()
		 * @generated
		 */
		EClass XMOD_ELEMENT = eINSTANCE.getXmod_Element();

		/**
		 * The meta object literal for the '<em><b>Xmod id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XMOD_ELEMENT__XMOD_ID = eINSTANCE.getXmod_Element_Xmod_id();

		/**
		 * The meta object literal for the '{@link Spice.Xmod_ExceptionReaction <em>Xmod Exception Reaction</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Spice.Xmod_ExceptionReaction
		 * @see Spice.impl.SpicePackageImpl#getXmod_ExceptionReaction()
		 * @generated
		 */
		EEnum XMOD_EXCEPTION_REACTION = eINSTANCE.getXmod_ExceptionReaction();

		/**
		 * The meta object literal for the '{@link Spice.Xmod_ExceptionKind <em>Xmod Exception Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Spice.Xmod_ExceptionKind
		 * @see Spice.impl.SpicePackageImpl#getXmod_ExceptionKind()
		 * @generated
		 */
		EEnum XMOD_EXCEPTION_KIND = eINSTANCE.getXmod_ExceptionKind();

	}

} //SpicePackage
