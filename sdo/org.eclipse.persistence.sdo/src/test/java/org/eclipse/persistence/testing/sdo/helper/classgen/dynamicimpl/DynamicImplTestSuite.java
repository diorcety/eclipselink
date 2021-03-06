/*
 * Copyright (c) 1998, 2020 Oracle and/or its affiliates. All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v. 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0,
 * or the Eclipse Distribution License v. 1.0 which is available at
 * http://www.eclipse.org/org/documents/edl-v10.php.
 *
 * SPDX-License-Identifier: EPL-2.0 OR BSD-3-Clause
 */

// Contributors:
//     bdoughan - Mar 18/2009 - 2.0 - Initial implementation
package org.eclipse.persistence.testing.sdo.helper.classgen.dynamicimpl;

import junit.framework.Test;
import junit.framework.TestSuite;

public class DynamicImplTestSuite {
    public DynamicImplTestSuite() {
    }

    public static void main(String[] args) {
        junit.textui.TestRunner.run(suite());
    }

    public static Test suite() {
        TestSuite suite = new TestSuite("Dynamic Impl Tests");
        suite.addTestSuite(OneElementTestCases.class);
        suite.addTestSuite(DataTypesTestCases.class);
        suite.addTestSuite(InheritanceTestCases.class);
        suite.addTestSuite(DataTypeManyTestCases.class);
        suite.addTestSuite(NonDataTypeTestCases.class);
        suite.addTestSuite(NonDataTypeManyTestCases.class);
        suite.addTestSuite(ChangeSummaryTestCases.class);
        return suite;
    }
}
