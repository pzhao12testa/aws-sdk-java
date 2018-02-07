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
package com.amazonaws.services.ecs.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecs-2014-11-13/RegisterTaskDefinition" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RegisterTaskDefinitionResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The full description of the registered task definition.
     * </p>
     */
    private TaskDefinition taskDefinition;

    /**
     * <p>
     * The full description of the registered task definition.
     * </p>
     * 
     * @param taskDefinition
     *        The full description of the registered task definition.
     */

    public void setTaskDefinition(TaskDefinition taskDefinition) {
        this.taskDefinition = taskDefinition;
    }

    /**
     * <p>
     * The full description of the registered task definition.
     * </p>
     * 
     * @return The full description of the registered task definition.
     */

    public TaskDefinition getTaskDefinition() {
        return this.taskDefinition;
    }

    /**
     * <p>
     * The full description of the registered task definition.
     * </p>
     * 
     * @param taskDefinition
     *        The full description of the registered task definition.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegisterTaskDefinitionResult withTaskDefinition(TaskDefinition taskDefinition) {
        setTaskDefinition(taskDefinition);
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
        if (getTaskDefinition() != null)
            sb.append("TaskDefinition: ").append(getTaskDefinition());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RegisterTaskDefinitionResult == false)
            return false;
        RegisterTaskDefinitionResult other = (RegisterTaskDefinitionResult) obj;
        if (other.getTaskDefinition() == null ^ this.getTaskDefinition() == null)
            return false;
        if (other.getTaskDefinition() != null && other.getTaskDefinition().equals(this.getTaskDefinition()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTaskDefinition() == null) ? 0 : getTaskDefinition().hashCode());
        return hashCode;
    }

    @Override
    public RegisterTaskDefinitionResult clone() {
        try {
            return (RegisterTaskDefinitionResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
