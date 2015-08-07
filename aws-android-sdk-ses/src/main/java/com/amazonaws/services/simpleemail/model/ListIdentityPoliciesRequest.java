/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.simpleemail.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.simpleemail.AmazonSimpleEmailService#listIdentityPolicies(ListIdentityPoliciesRequest) ListIdentityPolicies operation}.
 * <p>
 * Returns a list of sending authorization policies that are attached to
 * the given identity (email address or domain). This API returns only a
 * list. If you want the actual policy content, you can use
 * <code>GetIdentityPolicies</code> .
 * </p>
 * <p>
 * <b>NOTE:</b>This API is for the identity owner only. If you have not
 * verified the identity, this API will return an error.
 * </p>
 * <p>
 * Sending authorization is a feature that enables an identity owner to
 * authorize other senders to use its identities. For information about
 * using sending authorization, see the
 * <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization.html"> Amazon SES Developer Guide </a>
 * .
 * </p>
 * <p>
 * This action is throttled at one request per second.
 * </p>
 *
 * @see com.amazonaws.services.simpleemail.AmazonSimpleEmailService#listIdentityPolicies(ListIdentityPoliciesRequest)
 */
public class ListIdentityPoliciesRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The identity that is associated with the policy for which the policies
     * will be listed. You can specify an identity by using its name or by
     * using its Amazon Resource Name (ARN). Examples:
     * <code>user@example.com</code>, <code>example.com</code>,
     * <code>arn:aws:ses:us-east-1:123456789012:identity/example.com</code>.
     * <p>To successfully call this API, you must own the identity.
     */
    private String identity;

    /**
     * The identity that is associated with the policy for which the policies
     * will be listed. You can specify an identity by using its name or by
     * using its Amazon Resource Name (ARN). Examples:
     * <code>user@example.com</code>, <code>example.com</code>,
     * <code>arn:aws:ses:us-east-1:123456789012:identity/example.com</code>.
     * <p>To successfully call this API, you must own the identity.
     *
     * @return The identity that is associated with the policy for which the policies
     *         will be listed. You can specify an identity by using its name or by
     *         using its Amazon Resource Name (ARN). Examples:
     *         <code>user@example.com</code>, <code>example.com</code>,
     *         <code>arn:aws:ses:us-east-1:123456789012:identity/example.com</code>.
     *         <p>To successfully call this API, you must own the identity.
     */
    public String getIdentity() {
        return identity;
    }
    
    /**
     * The identity that is associated with the policy for which the policies
     * will be listed. You can specify an identity by using its name or by
     * using its Amazon Resource Name (ARN). Examples:
     * <code>user@example.com</code>, <code>example.com</code>,
     * <code>arn:aws:ses:us-east-1:123456789012:identity/example.com</code>.
     * <p>To successfully call this API, you must own the identity.
     *
     * @param identity The identity that is associated with the policy for which the policies
     *         will be listed. You can specify an identity by using its name or by
     *         using its Amazon Resource Name (ARN). Examples:
     *         <code>user@example.com</code>, <code>example.com</code>,
     *         <code>arn:aws:ses:us-east-1:123456789012:identity/example.com</code>.
     *         <p>To successfully call this API, you must own the identity.
     */
    public void setIdentity(String identity) {
        this.identity = identity;
    }
    
    /**
     * The identity that is associated with the policy for which the policies
     * will be listed. You can specify an identity by using its name or by
     * using its Amazon Resource Name (ARN). Examples:
     * <code>user@example.com</code>, <code>example.com</code>,
     * <code>arn:aws:ses:us-east-1:123456789012:identity/example.com</code>.
     * <p>To successfully call this API, you must own the identity.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param identity The identity that is associated with the policy for which the policies
     *         will be listed. You can specify an identity by using its name or by
     *         using its Amazon Resource Name (ARN). Examples:
     *         <code>user@example.com</code>, <code>example.com</code>,
     *         <code>arn:aws:ses:us-east-1:123456789012:identity/example.com</code>.
     *         <p>To successfully call this API, you must own the identity.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ListIdentityPoliciesRequest withIdentity(String identity) {
        this.identity = identity;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getIdentity() != null) sb.append("Identity: " + getIdentity() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getIdentity() == null) ? 0 : getIdentity().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ListIdentityPoliciesRequest == false) return false;
        ListIdentityPoliciesRequest other = (ListIdentityPoliciesRequest)obj;
        
        if (other.getIdentity() == null ^ this.getIdentity() == null) return false;
        if (other.getIdentity() != null && other.getIdentity().equals(this.getIdentity()) == false) return false; 
        return true;
    }
    
}
    