/*******************************************************************************
 * Copyright (c) 2011 Oracle. All rights reserved.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 and Eclipse Distribution License v. 1.0
 * which accompanies this distribution.
 * The Eclipse Public License is available at http://www.eclipse.org/legal/epl-v10.html
 * and the Eclipse Distribution License is available at
 * http://www.eclipse.org/org/documents/edl-v10.php.
 *
 * Contributors:
 *     Mike Norman - June 10 2010, created DDL parser package
 ******************************************************************************/
package org.eclipse.persistence.tools.dbws.metadata;

public abstract class PrecisionType extends DatabaseTypeBase {

    protected long precision;
    protected long scale;
    
    public PrecisionType(String typeName, long precision) {
        super(typeName);
        this.precision = precision;
        this.scale = 0;
    }
    
    public PrecisionType(String typeName, long precision, long scale) {
        this(typeName, precision);
        this.scale = scale;
    }

    public long getPrecision() {
        return precision;
    }
    public long getScale() {
        return scale;
    }
    
    public abstract long getDefaultPrecision();

    public boolean isSimple() {
        return true;
    }
    public boolean isComplex() {
        return false;
    }

	public String toString() {
		StringBuilder sb = new StringBuilder(super.toString());
		if (precision != getDefaultPrecision()) {
			sb.append('(');
			sb.append(precision);
			if (scale != 0) {
				sb.append(',');
				sb.append(scale);
			}
			sb.append(')');
		}
		return sb.toString();
	}

}