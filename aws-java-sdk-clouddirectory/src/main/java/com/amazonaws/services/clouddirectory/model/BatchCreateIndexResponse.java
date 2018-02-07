/*
 * Copyright 2013-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.clouddirectory.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Represents the output of a <a>CreateIndex</a> response operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2016-05-10/BatchCreateIndexResponse"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchCreateIndexResponse implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The <code>ObjectIdentifier</code> of the index created by this operation.
     * </p>
     */
    private String objectIdentifier;

    /**
     * <p>
     * The <code>ObjectIdentifier</code> of the index created by this operation.
     * </p>
     * 
     * @param objectIdentifier
     *        The <code>ObjectIdentifier</code> of the index created by this operation.
     */

    public void setObjectIdentifier(String objectIdentifier) {
        this.objectIdentifier = objectIdentifier;
    }

    /**
     * <p>
     * The <code>ObjectIdentifier</code> of the index created by this operation.
     * </p>
     * 
     * @return The <code>ObjectIdentifier</code> of the index created by this operation.
     */

    public String getObjectIdentifier() {
        return this.objectIdentifier;
    }

    /**
     * <p>
     * The <code>ObjectIdentifier</code> of the index created by this operation.
     * </p>
     * 
     * @param objectIdentifier
     *        The <code>ObjectIdentifier</code> of the index created by this operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchCreateIndexResponse withObjectIdentifier(String objectIdentifier) {
        setObjectIdentifier(objectIdentifier);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getObjectIdentifier() != null)
            sb.append("ObjectIdentifier: ").append(getObjectIdentifier());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchCreateIndexResponse == false)
            return false;
        BatchCreateIndexResponse other = (BatchCreateIndexResponse) obj;
        if (other.getObjectIdentifier() == null ^ this.getObjectIdentifier() == null)
            return false;
        if (other.getObjectIdentifier() != null && other.getObjectIdentifier().equals(this.getObjectIdentifier()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getObjectIdentifier() == null) ? 0 : getObjectIdentifier().hashCode());
        return hashCode;
    }

    @Override
    public BatchCreateIndexResponse clone() {
        try {
            return (BatchCreateIndexResponse) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.clouddirectory.model.transform.BatchCreateIndexResponseMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
