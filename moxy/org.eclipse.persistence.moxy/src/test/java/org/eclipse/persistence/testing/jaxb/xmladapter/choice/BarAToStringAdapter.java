/*
 * Copyright (c) 2011, 2020 Oracle and/or its affiliates. All rights reserved.
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
// Matt MacIvor - July 4th 2011
package org.eclipse.persistence.testing.jaxb.xmladapter.choice;

import jakarta.xml.bind.annotation.adapters.XmlAdapter;

public class BarAToStringAdapter extends XmlAdapter<String, BarA> {

    @Override
    public String marshal(BarA arg0) throws Exception {
        return "Adapted String";
    }

    @Override
    public BarA unmarshal(String arg0) throws Exception {
        return new BarA();
    }

}
