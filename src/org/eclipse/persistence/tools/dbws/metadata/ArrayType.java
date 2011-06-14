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

public class ArrayType extends SizedType {

	static long DEFAULT_SIZE = 0l;
	
    public ArrayType() {
        super("ARRAY", DEFAULT_SIZE);
    }
    public ArrayType(long size) {
        super("ARRAY", size);
    }
    
	@Override
	public long getDefaultSize() {
		return DEFAULT_SIZE;
	}

}