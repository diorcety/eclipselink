/*
 * Copyright (c) 2013, 2020 Oracle and/or its affiliates. All rights reserved.
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
//     Guy Pelletier - initial API and implementation
package org.eclipse.persistence.internal.jpa.config.mappings;

import org.eclipse.persistence.internal.jpa.config.MetadataImpl;
import org.eclipse.persistence.internal.jpa.metadata.mappings.BatchFetchMetadata;
import org.eclipse.persistence.jpa.config.BatchFetch;

/**
 * JPA scripting API implementation.
 *
 * @author Guy Pelletier
 * @since EclipseLink 2.5.1
 */
public class BatchFetchImpl extends MetadataImpl<BatchFetchMetadata> implements BatchFetch {

    public BatchFetchImpl() {
        super(new BatchFetchMetadata());
    }

    @Override
    public BatchFetch setSize(Integer size) {
        getMetadata().setSize(size);
        return this;
    }

    @Override
    public BatchFetch setType(String type) {
        getMetadata().setType(type);
        return this;
    }

}
