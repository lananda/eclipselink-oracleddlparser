/*
 * Copyright (c) 2011, 2018 Oracle and/or its affiliates. All rights reserved.
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
//     Mike Norman - June 10 2011, created DDL parser package
package org.eclipse.persistence.tools.oracleddl.metadata;

import org.eclipse.persistence.tools.oracleddl.metadata.visit.DatabaseTypeVisitable;
import org.eclipse.persistence.tools.oracleddl.metadata.visit.DatabaseTypeVisitor;

public class IntervalYearToMonth extends ScalarDatabaseTypeBase implements ScalarDatabaseType, DatabaseTypeVisitable {

    public static final String TYPENAME_YEARPART = "INTERVAL YEAR";
    public static final String TYPENAME_MONTHPART = "TO MONTH";
    static final long DEFAULT_YEAR_PRECISION = 2L;

    protected long yearPrecision;

    public IntervalYearToMonth() {
        super(null);
        this.yearPrecision = DEFAULT_YEAR_PRECISION;
        this.typeName = TYPENAME_YEARPART + " " + TYPENAME_MONTHPART;
    }
    public IntervalYearToMonth(long yearPrecision) {
        super(null);
        this.yearPrecision = yearPrecision;
        this.typeName = TYPENAME_YEARPART + "(" + yearPrecision + ") " + TYPENAME_MONTHPART;
    }

    public long getYearPrecision() {
        return yearPrecision;
    }

    @Override
    public boolean isIntervalYearToMonth() {
        return true;
    }

    public void accept(DatabaseTypeVisitor visitor) {
        visitor.visit(this);
    }
}
