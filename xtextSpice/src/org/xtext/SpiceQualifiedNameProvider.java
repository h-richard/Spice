package org.xtext;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.naming.DefaultDeclarativeQualifiedNameProvider;
import org.eclipse.xtext.naming.QualifiedName;

import Spice.StaticAttribute;

public class SpiceQualifiedNameProvider extends DefaultDeclarativeQualifiedNameProvider {
    @Override
    public QualifiedName getFullyQualifiedName(EObject obj) {
    	if (obj instanceof StaticAttribute) {
            String id = ((StaticAttribute)obj).getName();
            if (id != null && !id.isEmpty())
                return QualifiedName.create(id);
        }
        return super.getFullyQualifiedName(obj);
    }
}
