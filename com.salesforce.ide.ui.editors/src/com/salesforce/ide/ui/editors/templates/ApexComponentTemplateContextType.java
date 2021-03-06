/*******************************************************************************
 * Copyright (c) 2015 Salesforce.com, inc..
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *     Salesforce.com, inc. - initial API and implementation
 ******************************************************************************/
package com.salesforce.ide.ui.editors.templates;

public final class ApexComponentTemplateContextType extends ForceTemplateContextType {

    public static final String ID = "com.salesforce.ide.ui.editors.templates.contextType.apexComponent"; //$NON-NLS-1$

    public ApexComponentTemplateContextType() {
        super();
    }

    public ApexComponentTemplateContextType(String id) {
        super(id);
    }

    public ApexComponentTemplateContextType(String id, String name) {
        super(id, name);
    }

}
