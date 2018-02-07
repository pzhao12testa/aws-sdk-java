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
package com.amazonaws.services.devicefarm.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Represents information about incompatibility.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/IncompatibilityMessage" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class IncompatibilityMessage implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A message about the incompatibility.
     * </p>
     */
    private String message;
    /**
     * <p>
     * The type of incompatibility.
     * </p>
     * <p>
     * Allowed values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * ARN: The ARN.
     * </p>
     * </li>
     * <li>
     * <p>
     * FORM_FACTOR: The form factor (for example, phone or tablet).
     * </p>
     * </li>
     * <li>
     * <p>
     * MANUFACTURER: The manufacturer.
     * </p>
     * </li>
     * <li>
     * <p>
     * PLATFORM: The platform (for example, Android or iOS).
     * </p>
     * </li>
     * <li>
     * <p>
     * REMOTE_ACCESS_ENABLED: Whether the device is enabled for remote access.
     * </p>
     * </li>
     * <li>
     * <p>
     * APPIUM_VERSION: The Appium version for the test.
     * </p>
     * </li>
     * </ul>
     */
    private String type;

    /**
     * <p>
     * A message about the incompatibility.
     * </p>
     * 
     * @param message
     *        A message about the incompatibility.
     */

    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * <p>
     * A message about the incompatibility.
     * </p>
     * 
     * @return A message about the incompatibility.
     */

    public String getMessage() {
        return this.message;
    }

    /**
     * <p>
     * A message about the incompatibility.
     * </p>
     * 
     * @param message
     *        A message about the incompatibility.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IncompatibilityMessage withMessage(String message) {
        setMessage(message);
        return this;
    }

    /**
     * <p>
     * The type of incompatibility.
     * </p>
     * <p>
     * Allowed values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * ARN: The ARN.
     * </p>
     * </li>
     * <li>
     * <p>
     * FORM_FACTOR: The form factor (for example, phone or tablet).
     * </p>
     * </li>
     * <li>
     * <p>
     * MANUFACTURER: The manufacturer.
     * </p>
     * </li>
     * <li>
     * <p>
     * PLATFORM: The platform (for example, Android or iOS).
     * </p>
     * </li>
     * <li>
     * <p>
     * REMOTE_ACCESS_ENABLED: Whether the device is enabled for remote access.
     * </p>
     * </li>
     * <li>
     * <p>
     * APPIUM_VERSION: The Appium version for the test.
     * </p>
     * </li>
     * </ul>
     * 
     * @param type
     *        The type of incompatibility.</p>
     *        <p>
     *        Allowed values include:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        ARN: The ARN.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        FORM_FACTOR: The form factor (for example, phone or tablet).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        MANUFACTURER: The manufacturer.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        PLATFORM: The platform (for example, Android or iOS).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        REMOTE_ACCESS_ENABLED: Whether the device is enabled for remote access.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        APPIUM_VERSION: The Appium version for the test.
     *        </p>
     *        </li>
     * @see DeviceAttribute
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of incompatibility.
     * </p>
     * <p>
     * Allowed values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * ARN: The ARN.
     * </p>
     * </li>
     * <li>
     * <p>
     * FORM_FACTOR: The form factor (for example, phone or tablet).
     * </p>
     * </li>
     * <li>
     * <p>
     * MANUFACTURER: The manufacturer.
     * </p>
     * </li>
     * <li>
     * <p>
     * PLATFORM: The platform (for example, Android or iOS).
     * </p>
     * </li>
     * <li>
     * <p>
     * REMOTE_ACCESS_ENABLED: Whether the device is enabled for remote access.
     * </p>
     * </li>
     * <li>
     * <p>
     * APPIUM_VERSION: The Appium version for the test.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The type of incompatibility.</p>
     *         <p>
     *         Allowed values include:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         ARN: The ARN.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         FORM_FACTOR: The form factor (for example, phone or tablet).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MANUFACTURER: The manufacturer.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         PLATFORM: The platform (for example, Android or iOS).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         REMOTE_ACCESS_ENABLED: Whether the device is enabled for remote access.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         APPIUM_VERSION: The Appium version for the test.
     *         </p>
     *         </li>
     * @see DeviceAttribute
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of incompatibility.
     * </p>
     * <p>
     * Allowed values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * ARN: The ARN.
     * </p>
     * </li>
     * <li>
     * <p>
     * FORM_FACTOR: The form factor (for example, phone or tablet).
     * </p>
     * </li>
     * <li>
     * <p>
     * MANUFACTURER: The manufacturer.
     * </p>
     * </li>
     * <li>
     * <p>
     * PLATFORM: The platform (for example, Android or iOS).
     * </p>
     * </li>
     * <li>
     * <p>
     * REMOTE_ACCESS_ENABLED: Whether the device is enabled for remote access.
     * </p>
     * </li>
     * <li>
     * <p>
     * APPIUM_VERSION: The Appium version for the test.
     * </p>
     * </li>
     * </ul>
     * 
     * @param type
     *        The type of incompatibility.</p>
     *        <p>
     *        Allowed values include:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        ARN: The ARN.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        FORM_FACTOR: The form factor (for example, phone or tablet).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        MANUFACTURER: The manufacturer.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        PLATFORM: The platform (for example, Android or iOS).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        REMOTE_ACCESS_ENABLED: Whether the device is enabled for remote access.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        APPIUM_VERSION: The Appium version for the test.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DeviceAttribute
     */

    public IncompatibilityMessage withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of incompatibility.
     * </p>
     * <p>
     * Allowed values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * ARN: The ARN.
     * </p>
     * </li>
     * <li>
     * <p>
     * FORM_FACTOR: The form factor (for example, phone or tablet).
     * </p>
     * </li>
     * <li>
     * <p>
     * MANUFACTURER: The manufacturer.
     * </p>
     * </li>
     * <li>
     * <p>
     * PLATFORM: The platform (for example, Android or iOS).
     * </p>
     * </li>
     * <li>
     * <p>
     * REMOTE_ACCESS_ENABLED: Whether the device is enabled for remote access.
     * </p>
     * </li>
     * <li>
     * <p>
     * APPIUM_VERSION: The Appium version for the test.
     * </p>
     * </li>
     * </ul>
     * 
     * @param type
     *        The type of incompatibility.</p>
     *        <p>
     *        Allowed values include:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        ARN: The ARN.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        FORM_FACTOR: The form factor (for example, phone or tablet).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        MANUFACTURER: The manufacturer.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        PLATFORM: The platform (for example, Android or iOS).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        REMOTE_ACCESS_ENABLED: Whether the device is enabled for remote access.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        APPIUM_VERSION: The Appium version for the test.
     *        </p>
     *        </li>
     * @see DeviceAttribute
     */

    public void setType(DeviceAttribute type) {
        withType(type);
    }

    /**
     * <p>
     * The type of incompatibility.
     * </p>
     * <p>
     * Allowed values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * ARN: The ARN.
     * </p>
     * </li>
     * <li>
     * <p>
     * FORM_FACTOR: The form factor (for example, phone or tablet).
     * </p>
     * </li>
     * <li>
     * <p>
     * MANUFACTURER: The manufacturer.
     * </p>
     * </li>
     * <li>
     * <p>
     * PLATFORM: The platform (for example, Android or iOS).
     * </p>
     * </li>
     * <li>
     * <p>
     * REMOTE_ACCESS_ENABLED: Whether the device is enabled for remote access.
     * </p>
     * </li>
     * <li>
     * <p>
     * APPIUM_VERSION: The Appium version for the test.
     * </p>
     * </li>
     * </ul>
     * 
     * @param type
     *        The type of incompatibility.</p>
     *        <p>
     *        Allowed values include:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        ARN: The ARN.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        FORM_FACTOR: The form factor (for example, phone or tablet).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        MANUFACTURER: The manufacturer.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        PLATFORM: The platform (for example, Android or iOS).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        REMOTE_ACCESS_ENABLED: Whether the device is enabled for remote access.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        APPIUM_VERSION: The Appium version for the test.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DeviceAttribute
     */

    public IncompatibilityMessage withType(DeviceAttribute type) {
        this.type = type.toString();
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
        if (getMessage() != null)
            sb.append("Message: ").append(getMessage()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof IncompatibilityMessage == false)
            return false;
        IncompatibilityMessage other = (IncompatibilityMessage) obj;
        if (other.getMessage() == null ^ this.getMessage() == null)
            return false;
        if (other.getMessage() != null && other.getMessage().equals(this.getMessage()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMessage() == null) ? 0 : getMessage().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        return hashCode;
    }

    @Override
    public IncompatibilityMessage clone() {
        try {
            return (IncompatibilityMessage) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.devicefarm.model.transform.IncompatibilityMessageMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
