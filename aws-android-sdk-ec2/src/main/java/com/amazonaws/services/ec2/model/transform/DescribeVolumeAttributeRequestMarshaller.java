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
package com.amazonaws.services.ec2.model.transform;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.internal.ListWithAutoConstructFlag;
import com.amazonaws.services.ec2.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * Describe Volume Attribute Request Marshaller
 */
public class DescribeVolumeAttributeRequestMarshaller implements Marshaller<Request<DescribeVolumeAttributeRequest>, DescribeVolumeAttributeRequest> {

    public Request<DescribeVolumeAttributeRequest> marshall(DescribeVolumeAttributeRequest describeVolumeAttributeRequest) {

        if (describeVolumeAttributeRequest == null) {
            throw new AmazonClientException("Invalid argument passed to marshall(...)");
        }

        Request<DescribeVolumeAttributeRequest> request = new DefaultRequest<DescribeVolumeAttributeRequest>(describeVolumeAttributeRequest, "AmazonEC2");
        request.addParameter("Action", "DescribeVolumeAttribute");
        request.addParameter("Version", "2015-04-15");

        if (describeVolumeAttributeRequest.getVolumeId() != null) {
            request.addParameter("VolumeId", StringUtils.fromString(describeVolumeAttributeRequest.getVolumeId()));
        }
        if (describeVolumeAttributeRequest.getAttribute() != null) {
            request.addParameter("Attribute", StringUtils.fromString(describeVolumeAttributeRequest.getAttribute()));
        }

        return request;
    }
}
