/**
 */
package Spice.impl;

import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import Spice.Data;
import Spice.SpicePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class DataImpl extends MinimalEObjectImpl.Container implements Data {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SpicePackage.Literals.DATA;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public abstract Object getRawValue();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public abstract Object getValue();
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public abstract void setRawValue(Object args);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public abstract void setValue(Object args);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case SpicePackage.DATA___GET_DATA_VALUE:
				return getValue();
			case SpicePackage.DATA___SET_DATA_VALUE__ELIST:
				setValue(arguments.get(0));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}
	
	protected static Object getSimplifiedObject(Object obj) {
    	if (obj instanceof EList<?> elist) {
    		Object first = elist.get(0);
            
            if (elist.size() == 1)
            	return first;
            
            Class<?> elementType = first.getClass();
            Object array = Array.newInstance(elementType, elist.size());

            for (int i = 0; i < elist.size(); i++)
                Array.set(array, i, elist.get(i));
            
            return array;
    	}
    	return obj;
    }
    
    @SuppressWarnings("unchecked")
	protected static <T> EList<T> toEList(Object obj) {
    	EList<T> elist = new BasicEList<>();
    	
    	if (obj.getClass().isArray())
    		Collections.addAll(elist, (T[]) obj);
    	else
    		elist.add((T)obj);
    	
    	return elist;
    }

} //DataImpl
