/*
 * Copyright 2012-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.organizations.model;

import javax.annotation.Generated;

/**
 * <p>
 * You can't use the specified policy type with the feature set currently enabled for this organization. For example,
 * you can enable service control policies (SCPs) only after you enable all features in the organization. For more
 * information, see <a
 * href="http://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_policies.html#enable_policies_on_root"
 * >Enabling and Disabling a Policy Type on a Root</a> in the <i>AWS Organizations User Guide</i>.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PolicyTypeNotAvailableForOrganizationException extends com.amazonaws.services.organizations.model.AWSOrganizationsException {
    private static final long serialVersionUID = 1L;

    /**
     * Constructs a new PolicyTypeNotAvailableForOrganizationException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public PolicyTypeNotAvailableForOrganizationException(String message) {
        super(message);
    }

}
